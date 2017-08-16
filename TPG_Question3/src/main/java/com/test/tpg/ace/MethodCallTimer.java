package com.test.tpg.ace;

import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Class implementation for TPG Question no. 3
 * 
 */
public class MethodCallTimer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodCallTimer.class);
	
	/**
	 * This is the primary business method that prints the duration of the invoked 
	 * method
	 * @param task
	 * @return
	 */
	public static <T> T printTime(Callable<T> task) {
	    T call = null;
	    try {
	        long startTime = System.currentTimeMillis();
	        call = task.call();
	        //System.out.print("The method call duration is:"+(System.currentTimeMillis() - startTime) / 1000d + "sec\n");
	        LOGGER.debug("##### The method call duration is:"+(System.currentTimeMillis() - startTime) / 1000d + "sec\n");
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return call;
	}
}
