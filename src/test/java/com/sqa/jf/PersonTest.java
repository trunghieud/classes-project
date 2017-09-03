package com.sqa.jf;

import org.testng.annotations.*;

public class PersonTest
{

	@Test
	public void testPerson()
	{
		Person[] people = new Person[7];
		people[0] = new Person("Vladimir Kononov", "Unemployed");
		people[1] = new Person("Delgado, Javier", "Unemployed");
		people[2] = new Person("Anne Hesemann", "QA Analyst");
		people[3] = new Person("Trung-Hieu Dam", "Unemployed", "91 FoxwellCt. San Jose CA 95138", "34");
		people[4] = new Person("EIEI", "Unemployed");
		people[5] = new Person("George Hanna", "Unemployed");
		people[6] = new Person("JF", "Instructor", "140 San Pedro", "34");
		for (int i = 0; i < people.length; i++)
		{
			System.out.println("Person Details: " + people[i]);
		}
	}
}
