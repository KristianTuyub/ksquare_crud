package com.ksquare.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ksquare.core.converter.PersonConverter;
import com.ksquare.core.entity.Person;
import com.ksquare.core.model.MPerson;
import com.ksquare.core.repository.PersonRepository;

@Service("PersonService")
public class PersonService {
	
	@Autowired
	@Qualifier("PersonRepository")
	private PersonRepository personRepository;
	
	@Autowired
	@Qualifier("PersonConverter")
	private PersonConverter personConverter;
	
	public boolean createPerson(Person person) {
		try {
			personRepository.save(person);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updatePerson(Person person) {
		try {
			personRepository.save(person);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean deletePerson(long personId) {
		try {
			Person person = personRepository.findByPersonId(personId);
			personRepository.delete(person);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public MPerson getPerson(long personId) {
		Person person = personRepository.findByPersonId(personId);
		MPerson mPerson = personConverter.personToMPersonConverter(person);
		
		return mPerson;
	}

}
