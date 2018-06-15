package com.cheny.manage;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SwapJob2 implements Job {
	protected Logger logger = Logger.getLogger(this.getClass());

	public void execute(JobExecutionContext context) throws JobExecutionException {
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("job2   "+format.format(new Date()));
	}
}