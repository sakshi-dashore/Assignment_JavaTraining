package com.sd.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import com.sd.Money;

public class Test {

	Money usd30;
	Money usd70;
	Money usd100;
	@Before
	public void setUp() throws Exception {
System.out.println("Set up called");
		
		usd30 = new Money(30,"USD");
		usd70 = new Money(70,"USD");
	    usd100 = new Money(100,"USD");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear down called");
	}

	@org.junit.Test
	public void testAddMoney() {
		System.out.println("Testing addMoney...");
		Money result = usd30.addMoney(usd70);
		assertTrue(result.equals(usd100));
	}

}
