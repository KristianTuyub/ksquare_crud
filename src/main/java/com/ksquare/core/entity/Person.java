package com.ksquare.core.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name="person")
@Data
@NoArgsConstructor
@Entity
public class Person implements Serializable {
	
	private static final long serialVersionUID = 6509354096597501512L;
	
	@GeneratedValue
	@Id
	@Column(name = "personId")
	private long personId;
	@Column(name = "personName")
	private String personName;
	@Column(name = "personDob")
	private LocalDateTime personDob;
	
	@OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="personTasks", 
    		   joinColumns={@JoinColumn(name="personId", referencedColumnName="personId")},
    		   inverseJoinColumns={@JoinColumn(name="taskId", referencedColumnName="taskId")})
    private List<Task> taskList;	
	
	public Person(long personId, String personName, LocalDateTime personDob) {
		this.personId = personId;
		this.personName = personName;
		this.personDob = personDob;
	}
	
}
