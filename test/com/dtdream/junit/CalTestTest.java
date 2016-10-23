package com.dtdream.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTestTest {

	@Test
	public void testAdd() {
		assertEquals(6, new CalTest().add(3, 3));
	}
}
