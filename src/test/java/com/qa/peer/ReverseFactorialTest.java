package com.qa.peer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseFactorialTest {

	private ReverseFactorial factorial = new ReverseFactorial();

	@Test
	public void test150() {
		String expected = "NONE";
		String actual = this.factorial.reverse(150);
		assertEquals(expected, actual);
	}

	@Test
	public void test120() {
		String expected = "5!";
		String actual = this.factorial.reverse(120);
		assertEquals(expected, actual);
	}

	@Test
	public void testLessThanZero() {
		String expected = "NONE";
		String actual = this.factorial.reverse(-1);
		assertEquals(expected, actual);
	}

	@Test
	public void testLessZero() {
		String expected = "NONE";
		String actual = this.factorial.reverse(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testOne() {
		String expected = "1!";
		String actual = this.factorial.reverse(1);
		assertEquals(expected, actual);
	}
}
