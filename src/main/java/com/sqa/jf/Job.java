/**
 * File Name: Job.java<br>
 * Dam, Trung-Hieu<br>
 * Created: Sep 4, 2017
 */
package com.sqa.jf;

/**
 * Job //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Dam, Trung-Hieu
 * @version 1.0.0
 * @since 1.0
 */
public class Job
{

	private String jobTitle;

	private int numDaysWorkingPerWeek;

	private float salary;

	/**
	 *
	 */
	public Job()
	{
		super();
		this.jobTitle = "Unemployed";
		this.salary = 0.0F;
		this.numDaysWorkingPerWeek = 0;
	}

	/**
	 * @param jobTitle
	 */
	public Job(String jobTitle)
	{
		this();
		this.jobTitle = jobTitle;
	}

	/**
	 * @param jobTitle
	 * @param salary
	 * @param numDaysWorkingPerWeek
	 */
	public Job(String jobTitle, float salary, int numDaysWorkingPerWeek)
	{
		super();
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.numDaysWorkingPerWeek = numDaysWorkingPerWeek;
	}

	public String completeTask(int taskID, float completion)
	{
		return null;
	}

	public void doWork(String task)
	{
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle()
	{
		return this.jobTitle;
	}

	/**
	 * @return the numDaysWOrkingPerWeek
	 */
	public int getNumDaysWorkingPerWeek()
	{
		return this.numDaysWorkingPerWeek;
	}

	/**
	 * @return the salary
	 */
	public float getSalary()
	{
		return this.salary;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	/**
	 * @param numDaysWOrkingPerWeek
	 *            the numDaysWOrkingPerWeek to set
	 */
	public void setNumDaysWorkingPerWeek(int numDaysWorkingPerWeek)
	{
		this.numDaysWorkingPerWeek = numDaysWorkingPerWeek;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(float salary)
	{
		this.salary = salary;
	}

	public boolean takeBreak(short minutes)
	{
		System.out.println(this.jobTitle + " takes a break for " + minutes);
		if (minutes > 15)
		{
			System.out.println(this.jobTitle + "was fire due to going over his break allocated time.");
			return false;
		}
		return true;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Job [jobTitle=" + this.jobTitle + ", salary=" + this.salary + ", numDaysWorkingPerWeek="
				+ this.numDaysWorkingPerWeek + "]";
	}
}
