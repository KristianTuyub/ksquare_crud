package com.ksquare.core.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="task")
@Entity
public class Task implements Serializable {
	/**
	 * 
	 */
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
	
	// Used by Hibernate
	public Task() {
		
	}
	
	public Task(long taskId, LocalDateTime creationDate, LocalDateTime completionDate, String description) {
		this.taskId = taskId;
		this.creationDate = creationDate;
		this.completionDate = completionDate;
		this.description = description;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(LocalDateTime completionDate) {
		this.completionDate = completionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
}
