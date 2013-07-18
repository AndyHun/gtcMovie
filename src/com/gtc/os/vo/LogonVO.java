/*
 * LogonVO.java 2012-11-12
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.os.vo;

import java.util.Locale;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.directwebremoting.annotations.DataTransferObject;

/**
 * @description  
 * @author AndyHun
 *
 * @Version 1.0
 */
@DataTransferObject
public class LogonVO {
	@NotNull(message="userCode can't be null!")
	@Size(min=3,message="The min length is 3!")
	private String userCode;

	private String password;
	
	private Locale locale;

	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * @param locale the locale to set
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
}
