/**
 * Test.java Nov 9, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.test;

import com.gtc.os.model.User;

/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public class Test {
	public static final ThreadLocal session = new ThreadLocal();
	
	
	public static void main(String[] args){
		User user =new User();
		Test.session.set(user);
		
		TestClient t1 = new TestClient("T1");
		TestClient t2 = new TestClient("T2");
		TestClient t3 = new TestClient("T3");
		t1.run();
		t2.run();
		t3.run();
		
	}
}





