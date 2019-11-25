package com.ksquare.core.model;

import java.time.LocalDateTime;

import com.ksquare.core.entity.Person;
import com.ksquare.core.entity.Task;

public class MTask {
	private long taskId;
	private LocalDateTime creationDate;
	private LocalDateTime completionDate;
	private String description;
	
	private Person person;
	
	// To convert an entity to a model
	public MTask(Task task) {
		this.taskId = task.getTaskId();
		this.creationDate = task.getCreationDate();
		this.completionDate = task.getCompletionDate();
		this.description = task.getDescription();
	}
	
	public MTask(long taskId, LocalDateTime creationDate, LocalDateTime completionDate, String description) {
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
