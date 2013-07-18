/**
 * UserSession.java Nov 22, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.secure;

import java.util.Locale;

import com.gtc.os.model.User;

/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public class UserSession {
	/**
	 * Login User
	 */
	private User user;
	/**
	 * User choose locale
	 */
	private Locale locale;
	
	
	
	
	
	
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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
