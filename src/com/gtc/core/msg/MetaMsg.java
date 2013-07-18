/**
 * MetaMessage.java Nov 21, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.msg;

import java.util.List;

/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public class MetaMsg {
	
	private List<String> receiver;
	
	private String sender;
	
	private String title;

	private String body;

	private Object data;
	
	private MsgLevel msgLevel;
	
	/**
	 * @return the receiver
	 */
	public List<String> getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(List<String> receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the sender
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * @param sender the sender to set
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the msgLevel
	 */
	public MsgLevel getMsgLevel() {
		return msgLevel;
	}

	/**
	 * @param msgLevel the msgLevel to set
	 */
	public void setMsgLevel(MsgLevel msgLevel) {
		this.msgLevel = msgLevel;
	}
	
}
