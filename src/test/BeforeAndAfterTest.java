package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import day11.Calculator;

public class BeforeAndAfterTest {
	
	Calculator calc;
	
	@BeforeEach
	public void init() {
		 calc = new Calculator();
	}
	
	@Test
	@DisplayName("Adding 2 Positive Numbers")
	public void testMethod1()
	{
		int sum = calc.add(10, 20);
		System.out.println("The total is : "+ sum);
	}
	
	@Test
	@DisplayName("Adding 2 Negative Numbers")
	public void testMethod2() {
		
		int sum = calc.add(-10, -20);
		System.out.println("The total is : "+ sum);
		
	}
	@AfterEach
	public void tearDown() {
		calc=null;
		System.out.println("Test Method executed successfully");
	}

}
