package com.test.tpg.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.tpg.ace.MethodCallTimer;
import com.test.tpg.ace.TestClass;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] atgs){
		//System.out.println("Created by: ALVIN C. ESTANISLAO, a.c.e");
		//System.out.println("=== Start of Test ===");
		LOGGER.debug("Created by: ALVIN C. ESTANISLAO, a.c.e");
		LOGGER.debug("=== Start of Test ===");
		
		TestClass test = new TestClass();
		int intReturnValue = MethodCallTimer.printTime(() -> test.testMethodA());
		//System.out.println("Return Value:"+ intReturnValue);
		LOGGER.debug("Return Value:"+ intReturnValue);
		
		long longReturnValue = MethodCallTimer.printTime(() -> test.testMethodB());
		//System.out.println("Return Value:"+longReturnValue);
		LOGGER.debug("Return Value:"+longReturnValue);
		
		
		//System.out.println("=== End of Test ===");
		LOGGER.debug("=== End of Test ===");
	}
}
