package com.dk.training.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCaltest {

	@Test
    public void addTest()
    {
	  JenkinsCalculator myCalc = new JenkinsCalculator();
	  assertEquals(10,myCalc.addNumbers(5,5));
		
    }
	
	@Test
    public void subtractTest()
    {
	  JenkinsCalculator myCalc = new JenkinsCalculator();
	  assertEquals(5,myCalc.subtractNumbers(10,5));
		
    }
}
