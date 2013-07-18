/**
 * MsgTitle.java Nov 21, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.msg.support;

/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public enum MsgTitleKey {
	
	WARNING("com.gtc.core.msg.title.warning"),
	INFO("com.gtc.core.msg.title.info"),
	ERROR("com.gtc.core.msg.title.error");
	
	private String description;
	
	MsgTitleKey(String description){
		this.description = description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
