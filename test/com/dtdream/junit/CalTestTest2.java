package com.dtdream.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTestTest2 {


	@Test
	public void testAdd() {
		assertEquals(6, new CalTest().add(3, 3));
	}


	@Test
	public void testSubstract() {
		assertEquals(-2, new CalTest().substract(1, 3));
	}
	@Test
	public void testDivide() {
		assertEquals(1, new CalTest().divide(1, 1));
	}
}
