/**
 * LogonController.java Nov 7, 2012
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.os.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gtc.os.service.UserService;
import com.gtc.os.vo.LogonVO;
import com.gtc.os.vo.UserVO;

/**
 * @description
 * 
 * @author AndyHun
 * @version 1.0
 */
@Controller
@RequestMapping("sign")
public class SignController {
	Log log = LogFactory.getLog(SignController.class);
	@Value("#{view.home}")
	private String fromView;
	@Value("#{view.index}")
	private String successView;

	@Resource
	private UserService userService;

	/*
	 * If active this method and cancel the ClassLevel RequestMaping, 
	 * we can cancel the welcome-file-list config in web.xml
	 * 
	 * @RequestMapping({"/","/home"}) 
	 * public String view(LogonVO logonVO) { 
	 * 	return this.fromView; 
	 * }
	 */

	@RequestMapping(params = "logon")
	public String logon(@Valid LogonVO logonVO, BindingResult bindingResult, Model model, HttpServletRequest request) {
		log.info("Access logon");
		if(bindingResult.hasErrors()){
			return this.fromView;
		}

		UserVO userVO = new UserVO();
		userVO.setUserCode(logonVO.getUserCode());
		model.addAttribute(userVO);
		return this.successView;
	}

	@RequestMapping(params = "logout")
	public String logout() {
		return this.fromView;
	}

}
