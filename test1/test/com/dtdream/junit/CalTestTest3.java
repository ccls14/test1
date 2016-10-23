package com.dtdream.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalTestTest3 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after ");
	}

	@Test
	public void testAdd() {
	System.out.println("this is test");
	}

	@Test
	public void testSubstract() {
		
		System.out.println("this is test2");
	}

	@Test
	public void testDivide() {
	
		System.out.println("this is test3");
	}

}
