/*
 * I18Utils.java 2012-11-12
 * 
 * Copyright 2012 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.util;

import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;

/**
 * @description  
 * @author AndyHun
 *
 * @Version 1.0
 */
public class I18nUtils {
	private static Log log = LogFactory.getLog(I18nUtils.class);
	
	/**
	 * default locale language
	 */
	private static Locale LOCALE_DEFAULT = Locale.CHINA;
	
	@Value("#{corePojo[com.gtc.LANGUAGE_SEPARATOR]?-}")
	private static final String LOCAL_SEPARATOR = null;
	
	public static Locale getLocale(String locale) {
		try {
			Assert.hasText(locale, "locale can't be empty");
			String[] splits = locale.split(LOCAL_SEPARATOR);
			return new Locale(splits[0], splits[1]);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return null;
		}
	}
	
	public static String translate(String key) {
		return "";
	}
	
	public static void main(String[] args){
		System.out.println(I18nUtils.getLocale(""));
	}
}
