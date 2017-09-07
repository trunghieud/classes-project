package com.sqa.td;

public class Bug
{

	private int bugId;

	private String reporterName;

	private String bugName;

	private char bugCategory;

	private String operatingSystem;

	private String date;

	private String bugDetails;

	private double frequency;

	private boolean isActive;

	/**
	 * @param bugId
	 * @param reporterName
	 * @param bugName
	 * @param bugCategory
	 * @param operatingSystem
	 * @param date
	 * @param bugDetails
	 * @param frequency
	 * @param isActive
	 */
	public Bug()
	{
		super();
		this.bugId = 123456;
		this.reporterName = "Default Reporter Name";
		this.bugName = "Default Bug Name";
		this.bugCategory = 'B';
		this.operatingSystem = "Windows";
		this.date = "01/01/2000";
		this.bugDetails = "Test";
		this.frequency = 1.0;
		this.isActive = false;
	}

	/**
	 * @param bugId
	 * @param reporterName
	 * @param bugName
	 * @param bugCategory
	 * @param operatingSystem
	 * @param date
	 * @param bugDetails
	 * @param frequency
	 * @param isActive
	 */
	public Bug(int bugId, String reporterName)
	{
		this();
		this.bugId = bugId;
		this.reporterName = reporterName;
	}

	/**
	 * @param bugId
	 * @param reporterName
	 * @param bugName
	 * @param bugCategory
	 * @param operatingSystem
	 * @param date
	 * @param bugDetails
	 * @param frequency
	 * @param isActive
	 */
	public Bug(int bugId, String reporterName, String bugName, char bugCategory, String operatingSystem, String date,
			String bugDetails, double frequency, boolean isActive)
	{
		super();
		this.bugId = bugId;
		this.reporterName = reporterName;
		this.bugName = bugName;
		this.bugCategory = bugCategory;
		this.operatingSystem = operatingSystem;
		this.date = date;
		this.bugDetails = bugDetails;
		this.frequency = frequency;
		this.isActive = isActive;
	}

	/**
	 * @return the bugCategory
	 */
	public char getBugCategory()
	{
		return this.bugCategory;
	}

	/**
	 * @return the bugDetails
	 */
	public String getBugDetails()
	{
		return this.bugDetails;
	}

	/**
	 * @return the bugId
	 */
	public int getBugId()
	{
		return this.bugId;
	}

	/**
	 * @return the bugName
	 */
	public String getBugName()
	{
		return this.bugName;
	}

	/**
	 * @return the date
	 */
	public String getDate()
	{
		return this.date;
	}

	/**
	 * @return the frequency
	 */
	public double getFrequency()
	{
		return this.frequency;
	}

	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem()
	{
		return this.operatingSystem;
	}

	/**
	 * @return the reporterName
	 */
	public String getReporterName()
	{
		return this.reporterName;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive()
	{
		return this.isActive;
	}

	public boolean recreateBugActivity(int bugId)
	{
		System.out.println(
				this.bugName + " is recreated with bug[" + bugId + "] activity - Bug Details " + this.bugDetails);
		return this.isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setActive(boolean isActive)
	{
		this.isActive = isActive;
	}

	/**
	 * @param bugCategory
	 *            the bugCategory to set
	 */
	public void setBugCategory(char bugCategory)
	{
		this.bugCategory = bugCategory;
	}

	/**
	 * @param bugDetails
	 *            the bugDetails to set
	 */
	public void setBugDetails(String bugDetails)
	{
		this.bugDetails = bugDetails;
	}

	/**
	 * @param bugId
	 *            the bugId to set
	 */
	public void setBugId(int bugId)
	{
		this.bugId = bugId;
	}

	/**
	 * @param bugName
	 *            the bugName to set
	 */
	public void setBugName(String bugName)
	{
		this.bugName = bugName;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date)
	{
		this.date = date;
	}

	/**
	 * @param frequency
	 *            the frequency to set
	 */
	public void setFrequency(double frequency)
	{
		this.frequency = frequency;
	}

	/**
	 * @param operatingSystem
	 *            the operatingSystem to set
	 */
	public void setOperatingSystem(String operatingSystem)
	{
		this.operatingSystem = operatingSystem;
	}

	/**
	 * @param reporterName
	 *            the reporterName to set
	 */
	public void setReporterName(String reporterName)
	{
		this.reporterName = reporterName;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Bug [bugId=" + this.bugId + ", reporterName=" + this.reporterName + ", bugName=" + this.bugName
				+ ", bugCategory=" + this.bugCategory + ", operatingSystem=" + this.operatingSystem + ", date="
				+ this.date + ", bugDetails=" + this.bugDetails + ", frequency=" + this.frequency + ", isActive="
				+ this.isActive + "]";
	}
}
