package com.augmentis.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

	ClockTime clocktime = new ClockTime();
		
	@Test
	public void get10returnX() throws Exception {
		assertEquals("X", clocktime.printRomanNum(10));
		
	}
	
	@Test
	public void get11returnXI() throws Exception {
		assertEquals("XI", clocktime.printRomanNum(11));
		
	}

	@Test
	public void get12returnXII() throws Exception {
		assertEquals("XII", clocktime.printRomanNum(12));
		
	}
	
	@Test
	public void get4returnIV() throws Exception {
		assertEquals("IV", clocktime.printRomanNum(4));
		
	}
	
	@Test
	public void get1returnI() throws Exception {
		assertEquals("I", clocktime.printRomanNum(1));
		
	}

	@Test
	public void get2returnII() throws Exception {
		assertEquals("II", clocktime.printRomanNum(2));
		
	}
	
	@Test
	public void get3returnIII() throws Exception {
		assertEquals("III", clocktime.printRomanNum(3));
		
	}
	@Test
	public void get5returnV() throws Exception {
		assertEquals("V", clocktime.printRomanNum(5));
		
	}
	@Test
	public void get6returnVI() throws Exception {
		assertEquals("VI", clocktime.printRomanNum(6));
		
	}
	@Test
	public void get7returnVII() throws Exception {
		assertEquals("VII", clocktime.printRomanNum(7));
		
	}
	@Test
	public void get8returnVIII() throws Exception {
		assertEquals("VIII", clocktime.printRomanNum(8));
		
	}
	@Test
	public void get9returnIX() throws Exception {
		assertEquals("IX", clocktime.printRomanNum(9));
		
	}
	@Test
	public void get30returnXXX() throws Exception {
		assertEquals("XXX", clocktime.printRomanNum(30));
		
	}
	@Test
	public void get39returnXXXIX() throws Exception {
		assertEquals("XXXIX", clocktime.printRomanNum(39));
		
	}
	@Test
	public void get49returnIL() throws Exception {
		assertEquals("IL", clocktime.printRomanNum(49));
		
	}
	
	@Test
	public void get60returnLX() throws Exception {
		assertEquals("LX", clocktime.printRomanNum(60));
		
	}
	
	@Test
	public void get59returnLIX() throws Exception {
		assertEquals("LIX", clocktime.printRomanNum(59));
		
	}
	
}
