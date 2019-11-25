package com.ksquare.core.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="task")
@Data
@NoArgsConstructor
@Entity
public class Task implements Serializable {

	private static final long serialVersionUID = 8447880494554378687L;
	
	@GeneratedValue
	@Id
	@Column(name = "taskId")
	private long taskId;
	@Column(name = "creationDate")
	private LocalDateTime creationDate;
	@Column(name = "completionDate")
	private LocalDateTime completionDate;
	@Column(name = "description")
	private String description;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinTable(name="personTasks", 
    		   joinColumns={@JoinColumn(name="taskId", referencedColumnName="taskId")},
    		   inverseJoinColumns={@JoinColumn(name="personId", referencedColumnName="personId")})
    private Person person;
	
	public Task(long taskId, LocalDateTime creationDate, LocalDateTime completionDate, String description) {
		this.taskId = taskId;
		this.creationDate = creationDate;
		this.completionDate = completionDate;
		this.description = description;
	}
	
}
