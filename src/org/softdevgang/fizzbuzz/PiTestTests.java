package org.softdevgang.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PiTestTests {

	@Test
	public void testLessThanSign() {
		assertEquals("high", NumberUtilities.isHigher(3.11));
		assertEquals("low", NumberUtilities.isHigher(3.1));
	}

	@Test
	public void testLessThanSignInt() {
		assertEquals("high", NumberUtilities.isHigher(3));
		assertEquals("low", NumberUtilities.isHigher(1));
	}

	@Test
	public void testLessThanOrEqualSign() {
		// does not check lower boundaries on doubles
		assertEquals("high", NumberUtilities.isHigherOrEqual(3.1));
		assertEquals("low", NumberUtilities.isHigherOrEqual(2.01));
	}

	@Test
	public void testStringCompares() throws Exception {
		assertTrue(NumberUtilities.contains("sleepy"));
		assertFalse(NumberUtilities.contains("tired"));
	}
}
