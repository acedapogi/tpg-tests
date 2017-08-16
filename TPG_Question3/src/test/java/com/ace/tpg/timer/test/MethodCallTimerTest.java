package com.ace.tpg.timer.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.test.tpg.ace.MethodCallTimer;
import com.test.tpg.ace.TestClass;


public class MethodCallTimerTest {

	private TestClass test;
	
	@Before
	public void setUp() throws Exception {
		test = new TestClass();
	}

	@Test
	public void test() {
		int intReturnValue = MethodCallTimer.printTime(() -> test.testMethodA());
		System.out.println("Return Value:"+ intReturnValue);
		Assert.assertEquals(8999999, intReturnValue);
		long longReturnValue = MethodCallTimer.printTime(() -> test.testMethodB());
		System.out.println("Return Value:"+longReturnValue);
		Assert.assertEquals(100L, longReturnValue);
	}

}
