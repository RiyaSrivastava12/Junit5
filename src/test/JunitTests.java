package test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import day11.Calculator;

public class JunitTests {
	
	@Test
	@DisplayName("Adding 2 Positive Numbers")
	public void testMethod1()
	{
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("The total is : "+ sum);
	}
	
	@Test
	@DisplayName("Adding 2 Negative Numbers")
	@Disabled("Not executing as the functionality is not working")
	public void testMethod2() {
		Calculator calc = new Calculator();
		int sum = calc.add(-10, -20);
		System.out.println("The total is : "+ sum);
		
	}
}