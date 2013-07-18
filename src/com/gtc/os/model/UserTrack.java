/**
 * UserTrack.java Nov 7, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.os.model;

import java.util.Date;

import com.gtc.core.povo.PO;

/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public class UserTrack extends PO {
	
	/**
	 * foreign key from table user
	 */
	private String userCode;
	
	private String logonIp;

	private Date logonDate;

	
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
	 * @return the logonIp
	 */
	public String getLogonIp() {
		return logonIp;
	}

	/**
	 * @param logonIp the logonIp to set
	 */
	public void setLogonIp(String logonIp) {
		this.logonIp = logonIp;
	}

	/**
	 * @return the logonDate
	 */
	public Date getLogonDate() {
		return logonDate;
	}

	/**
	 * @param logonDate the logonDate to set
	 */
	public void setLogonDate(Date logonDate) {
		this.logonDate = logonDate;
	}
	
}
