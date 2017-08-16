package com.test.tpg.ace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Class implementation for a Test class having some
 * methods with varied duration to be measured.
 * 
 */
public class TestClass {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestClass.class);
	
	/**
	 * This a test method that returns an int value
	 * @return an int value to return, just a loop count value:100
	 */
	public int testMethodA(){
		LOGGER.debug("Start of testMethodA...");
		int ret = 0;
		for(int i=0; i<9000000; i++){
			ret = i;
		}
		LOGGER.debug("End of testMethodA.");
		return ret;
	}
	
	/**
	 * This a test method that returns an long value; this method finished longer
	 * than the previous test methods due to some 500ms delay
	 * @return an long value to return, just fixed at 100L for testing purposes
	 */
	public long testMethodB(){
		LOGGER.debug("Start of testMethodB...");
		long ret = 100L;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			LOGGER.error("An exception occurred: "+e.getMessage());
			//e.printStackTrace();
		}
		LOGGER.debug("End of testMethodB.");
		return ret;
	}
}
