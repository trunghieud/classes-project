package com.sqa.jf;

public class Person
{

	private String name;

	private String age;

	private String address;

	private String jobTitle;

	/**
	 * @param name
	 * @param jobTitle
	 * @param address
	 * @param age
	 */
	public Person()
	{
		super();
		this.name = "John Doe";
		this.jobTitle = "Unemployed";
		this.address = "Homeless";
		this.age = "18";
	}

	/**
	 * @param name
	 * @param jobTitle
	 * @param address
	 * @param age
	 */
	public Person(String name, String jobTitle)
	{
		this();
		this.name = "John Doe";
		this.jobTitle = "Unemployed";
	}

	/**
	 * @param name
	 * @param jobTitle
	 * @param address
	 * @param age
	 */
	public Person(String name, String jobTitle, String address, String age)
	{
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.address = address;
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
	public String getJobTitle()
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
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age)
	{
		this.age = age;
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
		return this.getClass().getSimpleName() + " [name=" + this.name + ", jobTitle=" + this.jobTitle + ", address="
				+ this.address + ", age=" + this.age + "]";
	}
}
