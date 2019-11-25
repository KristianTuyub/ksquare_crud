package com.ksquare.core.model;

import java.time.LocalDateTime;
import java.util.List;

import com.ksquare.core.entity.Person;
import com.ksquare.core.entity.Task;

import lombok.Data;

@Data
public class MPerson {
	private long personId;
	private String personName;
	private LocalDateTime personDob;
	
	private List<Task> taskList;	
	
	public MPerson(Person person) {
		this.personId = person.getPersonId();
		this.personName = person.getPersonName();
		this.personDob = person.getPersonDob();
	}

	public MPerson(long personId, String personName, LocalDateTime personDob) {
		this.personId = personId;
		this.personName = personName;
		this.personDob = personDob;
	}

}
