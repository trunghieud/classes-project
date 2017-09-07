package com.sqa.td;

import com.sqa.td.helpers.*;

public class Game
{

	private String currentLevel;

	private double health;

	private int numOfLevels;

	/**
	 *
	 */
	public Game()
	{
		super();
		this.numOfLevels = 99;
		this.currentLevel = "99";
		this.health = 100.0;
	}

	/**
	 * @param health
	 */
	public Game(double health)
	{
		this();
		this.health = health;
	}

	/**
	 * @param numOfLevels
	 * @param currentLevel
	 */
	public Game(int numOfLevels, String currentLevel)
	{
		this();
		this.numOfLevels = numOfLevels;
		this.currentLevel = currentLevel;
	}

	/**
	 * @param numOfLevels
	 * @param currentLevel
	 * @param health
	 */
	public Game(int numOfLevels, String currentLevel, double health)
	{
		super();
		this.numOfLevels = numOfLevels;
		this.currentLevel = currentLevel;
		this.health = health;
	}

	public boolean continueLevel(String levelName)
	{
		setCurrentLevel(levelName);
		String dead = "";
		getHealth();
		if (getHealth() == 0)
		{
			dead = " You are dead!";
			System.out.println("Your current health is " + getHealth() + "%." + dead);
			System.out.println("********************************");
			System.out.println("*           GAME OVER          *");
			System.out.println("********************************");
			System.out.println("Thanks for playing this game!");
			return false;
		} else
		{
			System.out.print("Your current health is " + getHealth() + "%.");
			System.out.print("You are currently on level " + getCurrentLevel() + ". ");
			System.out.print("There are " + getNumOfLevels() + " levels. ");
			System.out.println("Keep on going!");
			return true;
		}
	}

	public double damage(double pointDamage)
	{
		this.health = getHealth();
		System.out.println("You encounter an enemy. The enemy attacks- *pow* *pow* " + pointDamage + " damage");
		this.health = this.health - pointDamage;
		System.out.println("Your health is " + this.health + "%. ");
		System.out.println("It's your turn to strike - *pow* *pow*. You killed the enemy!");
		return this.health;
	}

	/**
	 * @return the currentLevel
	 */
	public String getCurrentLevel()
	{
		return this.currentLevel;
	}

	/**
	 * @return the health
	 */
	public double getHealth()
	{
		return this.health;
	}

	/**
	 * @return the numOfLevels
	 */
	public int getNumOfLevels()
	{
		return this.numOfLevels;
	}

	public void play()
	{
		char play = 'y';
		if (getHealth() == 0)
			;
		{
			play = AppBasics.requestChar("Would you like to play again? y/n");
			if (play == 'y')
			{
				System.out.println("Let's play again!");
			} else
				System.out.println("Thanks for playing.");
		}
	}

	/**
	 * @param currentLevel
	 *            the currentLevel to set
	 */
	public void setCurrentLevel(String currentLevel)
	{
		this.currentLevel = currentLevel;
	}

	/**
	 * @param health
	 *            the health to set
	 */
	public void setHealth(double health)
	{
		this.health = health;
	}

	/**
	 * @param numOfLevels
	 *            the numOfLevels to set
	 */
	public void setNumOfLevels(int numOfLevels)
	{
		this.numOfLevels = numOfLevels;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		System.out.println("*****************************************");
		System.out.println("* Welcome to the game - " + "                *");
		System.out.println("* Levels - " + this.numOfLevels + "                           *");
		System.out.println("* Current level - " + this.currentLevel + "                    *");
		System.out.println("* Health - " + this.health + "%                        *");
		System.out.println("*****************************************");
		return "Let the game begin!\n\n";
	}
}
