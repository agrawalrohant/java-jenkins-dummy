package com.apk.trainings.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalculatorTest {

	@Test
	public void addTest() {
		JenkinsCalculator muCalc = new JenkinsCalculator();
		assertEquals(10, muCalc.addNumbers(5, 5));
	}
	
	@Test
	public void substractTest() throws InterruptedException {
		String tempVar = "dummyString";
		Thread.sleep(15);
		
		JenkinsCalculator muCalc = new JenkinsCalculator();
		assertEquals(5, muCalc.substractNumbers(10, 5));
	}

}
