package com.lesports.wangjichuan.util.schedule;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloJob implements Job{
	public static Integer aa = 1;
	public static final Logger log = LoggerFactory.getLogger(HelloJob.class);
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println(context.getJobDetail().getKey());
		log.info("hello job!!!!");
		log.info("previous"+context.getPreviousFireTime()+";next:"+context.getNextFireTime());
		
	}

}
