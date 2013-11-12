/*
 * StingUtils.java Oct 23, 2013
 * 
 * Copyright 2013 General TECH , Inc. All rights reserved.
 */
package com.gtc.core.util;

import java.util.Random;

/**
 * @description  
 * @author AndyHun
 *
 * @Version 1.0
 */
public class StringUtils {
	
	public static String getRandomLetter(int length){
		Random random = new Random();
		StringBuffer randomLetter = new StringBuffer();
		for(int i=0; i< length; i++){
			int initialType = random.nextInt(2)%2 == 0? 65 : 97;
			randomLetter.append((char)(initialType+random.nextInt(26)));
		}
		return randomLetter.toString();	
	}
	
	public static void main(String[] args){
		System.out.println(StringUtils.getRandomLetter(5));
	}
}
