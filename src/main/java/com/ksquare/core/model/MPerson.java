package com.ksquare.core.model;

import java.time.LocalDateTime;

import com.ksquare.core.entity.Person;

public class MPerson {
	private long personId;
	private String personName;
	private LocalDateTime personDob;
	
	public MPerson(Person person) {
		this.personId = person.getPersonId();
		this.personName = person.getPersonName();
		this.personDob = person.getPersonDob();
	}

	public MPerson(long personId, String personName, LocalDateTime personDob) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personDob = personDob;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public LocalDateTime getPersonDob() {
		return personDob;
	}

	public void setPersonDob(LocalDateTime personDob) {
		this.personDob = personDob;
	}

}
