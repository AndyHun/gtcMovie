/*
 * GtcException.java Apr 9, 2013
 * 
 * Copyright 2013 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @description  
 * @author AndyHun
 *
 * @Version 1.0
 */
public class BaseException extends RuntimeException {
	
	protected Log logger;
	
	public BaseException(String message) {
		super(message);
		logger=LogFactory.getLog(BaseException.class);
	}
}
