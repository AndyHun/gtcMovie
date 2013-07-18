/**
 * SystemKey.java Nov 9, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.key;

/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public enum SystemKey {
	RUN_MODE("RUN_MODE"),
	DEBUG_MODE("DEBUG_MODE");
	
	private String description;

	SystemKey(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
