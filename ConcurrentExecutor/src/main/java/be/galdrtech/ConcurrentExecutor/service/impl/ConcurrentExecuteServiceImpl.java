package be.galdrtech.ConcurrentExecutor.service.impl;

import javax.inject.Inject;

import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import be.galdrtech.ConcurrentExecutor.service.ConcurrentExecuteService;

@Service
public class ConcurrentExecuteServiceImpl implements ConcurrentExecuteService{
	
	@Inject
	private TaskExecutor taskExecutor;
	
	public void execute(Runnable runnable) {
		this.taskExecutor.execute(runnable);
	}
	

}
