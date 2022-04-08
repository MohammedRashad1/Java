package com.ibs.junit.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {
	
	@Test
	public void testMessage(){
		System.out.println("Let's check..");
		String str = "Let's check..";
		assertEquals("Let's check..",str);
	}

}
