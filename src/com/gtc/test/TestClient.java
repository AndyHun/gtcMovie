/**
 * TestClient.java Nov 9, 2012
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
public class TestClient extends Thread {
	private String name;
	public TestClient(String name){
		this.name=name;
	}
	public void run(){
		User user=(User)Test.session.get();
		System.out.println(name+":"+user.getUserCode());
		user.setUserCode(name);
		System.out.println(name+":"+user.getUserCode());
	}
}
