/**
 * File Name: Job.java<br>
 * Dam, Trung-Hieu<br>
 * Created: Sep 4, 2017
 */
package com.sqa.td;

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

	private int taskId;

	private String task;

	private short minutes;

	private int numDaysWorkingPerWeek;

	private float salary;

	public Job()
	{
		super();
		this.jobTitle = "Unemployed";
		this.taskId = 12345;
		this.task = "NA";
		this.minutes = 15;
		this.numDaysWorkingPerWeek = 0;
		this.salary = 0;
	}

	public Job(String jobTitle)
	{
		this();
		this.jobTitle = jobTitle;
	}

	/**
	 * @param jobTitle
	 * @param numDaysWorkingPerWeek
	 * @param salary
	 */
	public Job(String jobTitle, int numDaysWorkingPerWeek, float salary)
	{
		super();
		this.jobTitle = jobTitle;
		this.numDaysWorkingPerWeek = numDaysWorkingPerWeek;
		this.salary = salary;
	}

	public String completeTask(int taskId, float completion)
	{
		System.out.println("This is " + taskId + " and it is suppose to be completed " + completion);
		return "This will be deploy";
	}

	public void doWork(String task)
	{
		System.out.print("Here are the task that need to be done " + task + ". ");
		System.out.println("This job is assigned to " + getJobTitle() + ". ");
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle()
	{
		return this.jobTitle;
	}

	/**
	 * @return the numDaysWorkingPerWeek
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
	 * @param numDaysWorkingPerWeek
	 *            the numDaysWorkingPerWeek to set
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
		if (minutes > 15)
		{
			System.out.println("hey! it's time to take a break. ");
			return false;
		} else
		{
			return true;
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Job [jobTitle=" + this.jobTitle + ", numDaysWorkingPerWeek=" + this.numDaysWorkingPerWeek + ", salary="
				+ this.salary + "]";
	}
}
