package test;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutsTest {
	
	@Test
	@Timeout(3)
	public void timeoutTest() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Test Passed within time");
	}
	
	@Test
	@Timeout(6)
	public void timeoutTest1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Test Passed within time.");
	}
}
