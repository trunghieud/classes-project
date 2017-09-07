package com.sqa.jf;

import org.testng.annotations.*;

public class JobTest
{

	@Test
	public void testJobs()
	{
		System.out.println("Testing Jobs");
		// Job job = new Job();
		Job[] jobs = new Job[5];
		// for (int i = 0; i < jobs.length; i++)
		// {
		// jobs[i] = new Job();
		// }
		jobs[0] = new Job();
		jobs[1] = new Job("Instructor");
		jobs[2] = new Job("Software QA Engineer", 120000, 5);
		jobs[3] = new Job("Students");
		jobs[4] = new Job("Janitor", 50000, 6);
		for (int i = 0; i < jobs.length; i++)
		{
			System.out.println(jobs[i]);
			jobs[i].doWork("Task");
			jobs[i].completeTask(34, .95F);
			jobs[i].takeBreak((short) (20 * Math.random()));
		}
	}
}
