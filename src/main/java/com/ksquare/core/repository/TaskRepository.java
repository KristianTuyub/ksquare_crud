package com.ksquare.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksquare.core.entity.Task;
import com.ksquare.core.model.MTask;

@Repository("TaskRepository")
public interface TaskRepository extends JpaRepository<Task, Serializable>{
	public abstract Task findByTaskId(long taskId);
}
