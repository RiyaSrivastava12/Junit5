package test;

import org.junit.jupiter.api.Test;

public class RepeatedDemoTest {
	
	@org.junit.jupiter.api.RepeatedTest(2)
	public void repeatedTestMethod() {
		System.out.println("I am executing this test multiple times.");
	}
	
	@org.junit.jupiter.api.RepeatedTest(value=3)
	public void repeatedTestMethod1() {
		System.out.println("I am executing this repeatedTestMethod1 multiple times.");
	}
}
