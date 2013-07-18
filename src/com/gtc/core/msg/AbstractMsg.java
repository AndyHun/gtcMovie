/**
 * AbstractMsg.java Nov 21, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.msg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.sun.org.apache.xml.internal.security.utils.I18n;


/**
 *@description  
 *
 * @author AndyHun
 * @version 1.0
 */
public abstract class AbstractMsg implements Message {
	
	@Value("#{corePojo[com.gtc.core.msg.MINI_BODY_SIZE] ? : 20}")
	private int MINI_BODY_SIZE;
	
	private List<MetaMsg> msgList = new ArrayList<MetaMsg>();

	private List<MetaMsg> errorList = new ArrayList<MetaMsg>();

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#addMsgs(java.util.List)
	 */
	@Override
	public void addMsgs(List<MetaMsg> metaMsgList) {
		this.msgList.addAll(metaMsgList);
		I18n a;
	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#addMsg(com.gtc.core.msg.MetaMsg)
	 */
	@Override
	public void addMsg(MetaMsg metaMsg) {
		this.msgList.add(metaMsg);
	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#addInfo(java.lang.String)
	 */
	@Override
	public MetaMsg addInfo(String msgBody) {
		MetaMsg metaMsg = new MetaMsg();
		return null;
		//TODO
	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#addInfo(java.lang.String, java.lang.String)
	 */
	@Override
	public MetaMsg addInfo(String title, String msgBody) {
		// TODO Auto-generated method stub
		return null;

	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#getMsgs()
	 */
	@Override
	public List<MetaMsg> getMsgs() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#addError(java.lang.Throwable)
	 */
	@Override
	public void addError(Throwable e) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#addError(java.lang.String, java.lang.Throwable)
	 */
	@Override
	public void addError(String title, Throwable e) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#getErrors()
	 */
	@Override
	public List<MetaMsg> getErrors() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#clearMsgs()
	 */
	@Override
	public void clearMsgs() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.gtc.core.msg.Message#clearErrors()
	 */
	@Override
	public void clearErrors() {
		// TODO Auto-generated method stub

	}

}
