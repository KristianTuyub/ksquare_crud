package com.ksquare.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ksquare.core.converter.TaskConverter;
import com.ksquare.core.entity.Task;
import com.ksquare.core.model.MTask;
import com.ksquare.core.repository.TaskRepository;

@Service("TaskService")
public class TaskService {
	
	@Autowired
	@Qualifier("TaskRepository")
	private TaskRepository taskRepository;
	
	@Autowired
	@Qualifier("TaskConverter")
	private TaskConverter taskConverter;
	
	public boolean createTask(Task task) {
		try {
			taskRepository.save(task);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateTask(Task task) {
		try {
			taskRepository.save(task);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean deleteTask(long taskId) {
		try {
			Task task = taskRepository.findByTaskId(taskId);
			taskRepository.delete(task);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public MTask getTask(long taskId) {
		Task task = taskRepository.findByTaskId(taskId);
		MTask mTask = taskConverter.taskToMTaskConverter(task);
		
		return mTask;
	}
}
