package com.test.tpg.ace;

import java.util.concurrent.Callable;

public class MethodCallTimer {
	public static <T> T printTime(Callable<T> task) {
	    T call = null;
	    try {
	        long startTime = System.currentTimeMillis();
	        call = task.call();
	        System.out.print("The method call duration is:"+(System.currentTimeMillis() - startTime) / 1000d + "sec\n");
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return call;
	}
}
