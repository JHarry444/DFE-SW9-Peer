package com.qa.peer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;

public class BearTest {

	private BearNecessities necessities = new BearNecessities();

	@Test
	public void testValidInput() {
		List<String> input = List.of("100 80", "30 50", "130 60", "90 70", "150 85", "120 70", "200 100", "110 90");
		List<Integer> expectedOutput = List.of(2, 5);

		List<Integer> actualOutput = this.necessities.checkPlaces(input);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testNull() {
		assertNull(this.necessities.checkPlaces(null));
	}

	@Test
	public void testShortList() {
		assertNull(this.necessities.checkPlaces(List.of("100 80")));
	}
}
