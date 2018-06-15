package com.cheny.manage;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
QuartzManager.addJob("job1", "jobgroup1", "trigger1", "triggergroup1", SwapJob.class, "0/1 * * * * ?");
QuartzManager.addJob("job2", "jobgroup2", "trigger2", "triggergroup2", SwapJob2.class, "0/1 * * * * ?");

	Thread.sleep(5000);

System.out.println("修改定时参数");
//QuartzManager.modifyJobTime("trigger1", "triggergroup1", "0/2 * * * * ?");
QuartzManager.pauseJob("trigger1","jobgroup1");
QuartzManager.removeJob("job2");
//QuartzManager.shutdownJobs();
Thread.sleep(3000);
System.out.println("复苏参数");
QuartzManager.startJobs();
	}

}
