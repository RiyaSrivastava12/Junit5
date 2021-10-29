package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
	/**
	 * 1. Condition on Operating System
	 * 2. Condition on particular JRE. 
	 * 3. Condition on System Properties
	 */
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void conditionOnOs() {
		System.out.println("Execute this test only in WINDOWS machine");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	public void conditionOnJRE() {
		System.out.println("Execute this test only for Java 11.");
	}
	
	@Test
	@EnabledIfSystemProperty(named="user.dir", matches= "G://eclipse-workspace//Junit5")
	public void conditionOnSystemProperty() {
		System.out.println(System.getProperty("user.dir"));
	}

}
