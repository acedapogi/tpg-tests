package com.test.tpg.ace;

public class TestClass {

	public int testMethodA(){
		int ret = 0;
		for(int i=0; i<9000000; i++){
			ret = i;
		}
		return ret;
	}
	
	public long testMethodB(){
		long ret = 100L;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}
