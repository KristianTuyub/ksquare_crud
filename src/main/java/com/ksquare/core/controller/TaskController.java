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

import com.ksquare.core.entity.Task;
import com.ksquare.core.model.MTask;
import com.ksquare.core.service.TaskService;

@RestController
@RequestMapping("/v1")
public class TaskController {
	
	@Autowired
	@Qualifier("TaskService")
	TaskService taskService;
	
	@PostMapping("/task")
	public boolean createTask(@RequestBody @Valid Task task) {
		return taskService.createTask(task);
	}

	@GetMapping("/task/{taskId}")
	public MTask geTask(@PathVariable("taskId") long taskId) {
		return taskService.getTask(taskId);
	}
	
	@PutMapping("/task")
	public boolean updateTask(@RequestBody @Valid Task task) {
		return taskService.updateTask(task);
	}
	
	@DeleteMapping("/task/{taskId}")
	public boolean deleteTask(@PathVariable("taskId") long taskId) {
		return taskService.deleteTask(taskId);
	}

}
