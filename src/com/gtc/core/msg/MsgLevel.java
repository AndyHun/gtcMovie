/**
 * MessageLevel.java Nov 21, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.msg;

/**
 * @description
 * 
 * @author AndyHun
 * @version 1.0
 */
public enum MsgLevel {
	DEBUG("DEBUG"), 
	INFO("INFO"), 
	WARN("WARN"), 
	ERROR("ERROR"), 
	FATAL("FATAL");

	private String description;

	MsgLevel(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
