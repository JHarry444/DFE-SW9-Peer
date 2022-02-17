package com.qa.peer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DoggoTest {

	private Doggo competition = new Doggo();

	@Test
	public void testLength() {
		assertEquals(99, this.competition.compete(44).size());
	}

	@Test
	public void testNotContains() {
		assertFalse(this.competition.compete(44).contains("44th"));
	}

	@Test
	public void testFirst() {
		assertTrue(this.competition.compete(44).contains("21st"));
	}

	@Test
	public void testSecond() {
		assertTrue(this.competition.compete(44).contains("32nd"));
	}

	@Test
	public void testThird() {
		assertTrue(this.competition.compete(44).contains("33rd"));
	}

	@Test
	public void testFourth() {
		assertTrue(this.competition.compete(55).contains("44th"));
	}

	@Test
	public void testEleventh() {
		assertTrue(this.competition.compete(55).contains("11th"));
	}

	@Test
	public void testTwelve() {
		assertTrue(this.competition.compete(55).contains("12th"));
	}

	@Test
	public void testThirteen() {
		assertTrue(this.competition.compete(55).contains("13th"));
	}

	@Test
	public void testZero() {
		assertNull(this.competition.compete(0));
	}

	@Test
	public void test101() {
		assertNull(this.competition.compete(101));
	}
}
