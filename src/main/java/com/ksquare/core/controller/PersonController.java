package com.ksquare.core.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksquare.core.entity.Person;
import com.ksquare.core.model.MPerson;
import com.ksquare.core.service.PersonService;

@RestController
@RequestMapping("/v1")
public class PersonController {
	
	@Autowired
	@Qualifier("PersonService")
	PersonService personService;
	
	@PostMapping("/person")
	public boolean createPerson(@RequestBody @Valid Person person) {
		return personService.createPerson(person);
	}

	@GetMapping("/person/{personId}")
	public MPerson getPerson(@PathVariable("personId") long personId) {
		return personService.getPerson(personId);
	}
	
	@PutMapping("/person")
	public boolean updatePerson(@RequestBody @Valid Person person) {
		return personService.updatePerson(person);
	}
	
	@DeleteMapping("/person/{personId}")
	public boolean deletePerson(@PathVariable("personId") long personId) {
		return personService.deletePerson(personId);
	}
}
