package com.lesports.wangjichuan.util.schedule;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class ScheduleTest {
	public static void main(String[] args) throws Exception{
		Scheduler schedule = StdSchedulerFactory.getDefaultScheduler();
		schedule.start();
		JobDetail job = JobBuilder.newJob(HelloJob.class)
				.withIdentity("job1", "group1").build();
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("triggr1", "group1")
				.startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(40).repeatForever()).build();
		schedule.scheduleJob(job, trigger);
	}

}
