/**
 * File Name: GameTest.java<br>
 * Dam, Trung-Hieu<br>
 * Created: Sep 5, 2017
 */
package com.sqa.td;

import org.testng.annotations.*;

/**
 * GameTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Dam, Trung-Hieu
 * @version 1.0.0
 * @since 1.0
 */
public class GameTest
{

	@Test
	public void testGame()
	{
		Game[] games = new Game[2];
		games[0] = new Game(99, "10", 99);
		games[1] = new Game(50, "49", 0);
		for (int i = 0; i < games.length; i++)
		{
			System.out.println(games[i]);
		}
		games[0].continueLevel(games[0].getCurrentLevel());
		games[0].damage(50 * Math.random());
		games[0].damage(50 * Math.random());
		games[0].damage(50 * Math.random());
		games[0].continueLevel(games[0].getCurrentLevel());
	}
}
