package com.sqa.td;

import org.testng.annotations.*;

public class BugTest
{

	@Test
	public void testBug()
	{
		Bug[] bug = new Bug[4];
		bug[0] = new Bug(123457, "TrungHieu Dam");
		bug[1] = new Bug(12347, "Tester 1");
		bug[2] = new Bug(12348, "Tester 2");
		bug[3] = new Bug(12349, "TrungHieu Dam", "Video Quality", 'E', "Windows", "09/02/17", "This is only a test", 1,
				false);
		for (int i = 0; i < bug.length; i++)
		{
			System.out.println("Bug Details: " + bug[i]);
			bug[i].recreateBugActivity(123);
		}
	}
}
