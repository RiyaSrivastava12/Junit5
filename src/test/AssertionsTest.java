package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import day11.Calculator;

public class AssertionsTest {
	
	Calculator calc;
	
	@BeforeEach
	public void init() {
		calc=new Calculator();
	}
	
	@Test
	public void assertEqualsTest() {
		int sum = calc.add(2, 2);
		Assertions.assertEquals(3, sum ,"Test Failed as expected value is not equal to actual value");
	}
	
	@Test
	public void assertNotEqualsTest() {
		int sum = calc.add(2, 2);
		Assertions.assertNotEquals(2, sum ,"Test Failed as expected value is equal to actual value");
	}
	
	@Test
	public void assertArrayEqualsTest() {
		//Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
		//Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3,4});
		Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {4,7,9});
	}
	
	@Test
	public void assertNullTest() {
		String nullString = null;
		String notNullString = "junit5";
		Assertions.assertNull(notNullString);
	}
	
	@Test
	public void assertNotNullTest() {
		String nullString = null;
		String notNullString = "junit5";
		Assertions.assertNotNull(notNullString);
	}
	
	@Test
	public void assertTrueTest() {
		boolean trueValue = true;
		boolean falseValue = false;
		Assertions.assertTrue(falseValue);
	}
	
	@Test
	public void assertFalseTest() {
		boolean trueValue = true;
		boolean falseValue = false;
		Assertions.assertFalse(trueValue,"Test Failed as test expecting false but found true");
	}
}

