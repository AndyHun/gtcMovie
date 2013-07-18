/**
 * Message.java Nov 21, 2012
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
public interface Message {

	/**
	 * add all metaMsgList
	 * @param metaMsgList
	 */
	public void addMsgs(List<MetaMsg> metaMsgList);

	/**
	 * add single metaMsg
	 * @param metaMsg
	 */
	public void addMsg(MetaMsg metaMsg);
	
	/**
	 * add INFO Level message
	 * @param msgBody
	 */
	public MetaMsg addInfo(String msgBody);
	
	/**
	 * add INFO Level message
	 * @param msgBody
	 */
	public MetaMsg addInfo(String title, String msgBody);
	
	/**
	 * add INFO Level message
	 * @param msgBody
	 */
	public MetaMsg addInfo(String title, String msgBody, Object obj);

	/**
	 * 
	 * @return List<MetaMsg>
	 */
	public List<MetaMsg> getMsgs();

	/**
	 * add ERROR Level message
	 * @param e
	 */
	public void addError(Throwable e);
	
	/**
	 * add ERROR Level message
	 * @param e
	 */
	public void addError(String title,Throwable e);

	/**
	 * 
	 * @return List<MetaMsg>
	 */
	public List<MetaMsg> getErrors();

	/**
	 * clear all message
	 */
	public void clearMsgs();
	
	/**
	 * clear all ERROR Level messages
	 */
	public void clearErrors();
}
