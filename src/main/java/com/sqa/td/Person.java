package com.sqa.td;

public class Person
{

	private String name;

	private String address;

	private String age;

	private String jobTitle;

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, String age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return this.address;
	}

	/**
	 * @return the age
	 */
	public String getAge()
	{
		return this.age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getjobTitle()
	{
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @param the
	 *            address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @param the
	 *            age to set
	 */
	public void setAge(String age)
	{
		this.age = age;
	}

	/**
	 * @param the
	 *            jobTitle to set
	 */
	public void setjobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Person [name=" + this.name + ", address=" + this.address + ", age=" + this.age + ", jobTitle="
				+ this.jobTitle + "]";
	}

	private void doWork()
	{
		System.out.println("This is doing work.");
	}

	private void move()
	{
		System.out.println("This is moving.");
	}

	private void sleep()
	{
		System.out.println("This is sleeping.");
	}
}
