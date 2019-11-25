package com.ksquare.core.converter;

import org.springframework.stereotype.Component;

import com.ksquare.core.entity.Task;
import com.ksquare.core.model.MTask;

import java.util.ArrayList;
import java.util.List;

@Component("TaskConverter")
public class TaskConverter {
	
	//To Use if An Entity List Query Result in Repository is required.
	
	/*public List<MTask> listConverter(List<Task> tasks) {
		List<MTask> mTasks = new ArrayList<>();
		
		tasks.forEach(task -> mTasks.add(new MTask(task)));
		
		return mTasks;
		
	}*/
	
	public MTask taskToMTaskConverter(Task task) {
		MTask mTask = new MTask(task);
		
		return mTask;		
	}

}
