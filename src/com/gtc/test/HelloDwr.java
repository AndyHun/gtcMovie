/**
 * HelloDwr.java Oct 26, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.test;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Value;

import com.gtc.os.service.UserService;
import com.gtc.os.vo.LogonVO;

/**
 * @description
 * 
 * @author AndyHun
 * @version 1.0
 */
@RemoteProxy(name="helloDwr")
public class HelloDwr {
	private Log log = LogFactory.getLog(HelloDwr.class);
	
	@Resource
	private UserService userService;
	
	@Value("#{pojo['com.gtc.os.web.controller.fromView']}")
	private String fromView;

	/**
	 * 
	 * @param name
	 * @return
	 */
	@RemoteMethod
	public String hello(@Valid List list, List<List<LogonVO>> list2) {
		//log.info("Hello " + logonVO.getUserCode());
		return "Hello ";// + logonVO.getUserCode();
	}
	
	@RemoteMethod
	public String hello2(String name) {
		//log.info("Hello " + logonVO.getUserCode());
		return "Hello "+name;// + logonVO.getUserCode();
	}
	
	/**
	 * private method is useless
	 * @param name
	 * @return
	 */
	@RemoteMethod
	private String privateHello(String name) {
		return "Private Hello " + name;
	}
}
