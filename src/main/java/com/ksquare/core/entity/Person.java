package com.ksquare.core.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="person")
@Entity
public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6509354096597501512L;
	
	@GeneratedValue
	@Id
	@Column(name = "personId")
	private long personId;
	@Column(name = "personName")
	private String personName;
	@Column(name = "personDob")
	private LocalDateTime personDob;
	
	// Used by Hibernate
	public Person() {
		
	}

	public Person(long personId, String personName, LocalDateTime personDob) {
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
