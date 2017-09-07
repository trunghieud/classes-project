package com.sqa.td;

import org.testng.annotations.*;

public class JobTest
{

	@Test
	public void testJob()
	{
		Job[] newJob = new Job[3];
		newJob[0] = new Job("Software QA", 5, 80000);
		newJob[1] = new Job("QA Automation", 6, 110000);
		newJob[2] = new Job("Software Development Engineer in Test", 7, 150000);
		for (int i = 0; i < newJob.length; i++)
		{
			System.out.println("Here are the new hires: " + newJob[i]);
			System.out.println();
		}
		newJob[0].doWork("UI Design");
		newJob[1].doWork("Automate UI");
		newJob[2].doWork("Learn about Python");
		System.out.println("Complete Task: -------------------");
		newJob[0].completeTask(12345, 1);
	}
}
