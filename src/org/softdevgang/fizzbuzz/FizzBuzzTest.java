package org.softdevgang.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		assertEquals("1", FizzBuzz.print(1));
		assertEquals("Fizz", FizzBuzz.print(3));
		assertEquals("Buzz", FizzBuzz.print(5));
		assertEquals("FizzBuzz", FizzBuzz.print(15));
	}

}
