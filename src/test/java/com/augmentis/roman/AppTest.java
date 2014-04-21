package com.augmentis.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

	@Test
	public void playerAWinFirstballShouldReturnFifteenZero() throws Exception {
		tennisGame.currentscore(0,0);
		
		score = tennisGame.getScore(15,0);
		assertEquals("Fifteen Zero", score);
	}

}
