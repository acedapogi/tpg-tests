package com.test.tpg.main;

import com.test.tpg.ace.MethodCallTimer;
import com.test.tpg.ace.TestClass;

public class Main {

	public static void main(String[] atgs){
		System.out.println("Created by: ALVIN C. ESTANISLAO, a.c.e");
		System.out.println("=== Start of Test ===");
		TestClass test = new TestClass();
		int intReturnValue = MethodCallTimer.printTime(() -> test.testMethodA());
		System.out.println("Return Value:"+ intReturnValue);
		
		long longReturnValue = MethodCallTimer.printTime(() -> test.testMethodB());
		System.out.println("Return Value:"+longReturnValue);
		System.out.println("=== End of Test ===");
	}
}
