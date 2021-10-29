package test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExecutionOrderTest {
	
	@Test
	@Order(4)
	public void test1() {
		System.out.println("This is test 1.");
	}
	
	@Test
	@Order(3)
	public void test2() {
		System.out.println("This is test 2.");
	}
	
	@Test
	@Order(2)
	public void test3() {
		System.out.println("This is test 3.");
	}
	
	@Test
	@Order(1)
	public void test4() {
		System.out.println("This is test 4.");
	}

}
