package com.ksquare.core.converter;

import org.springframework.stereotype.Component;

import com.ksquare.core.entity.Person;
import com.ksquare.core.model.MPerson;

@Component("PersonConverter")
public class PersonConverter {
	public MPerson personToMPersonConverter(Person person) {
		MPerson mPerson = new MPerson(person);
		
		return mPerson;
	}
}
