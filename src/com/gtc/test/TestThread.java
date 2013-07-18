/**
 * TestThread.java Nov 12, 2012
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
public class TestThread extends Thread {
	public void run(){
		int i=0;
		
		while( true){
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			i++;
		}
	}
}
