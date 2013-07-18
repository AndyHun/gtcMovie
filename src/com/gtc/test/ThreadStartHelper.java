/**
 * ThreadStartHelper.java Nov 12, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.test;

/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public class ThreadStartHelper extends Thread {
	public void run(){
		TestThread thread = new TestThread();
		thread.run();
	}
}
