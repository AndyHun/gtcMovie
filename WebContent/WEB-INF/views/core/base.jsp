<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@page import="org.springframework.web.servlet.i18n.SessionLocaleResolver"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String local = request.getLocale().toString();
	if(request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME)!=null){
		local =request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME).toString();
		//System.out.println("=======================LOCALE TWO======================"+local);
	}
	//System.out.println("=======================LOCALE ONE======================"+local);
	
	//set to attribute
	request.setAttribute("basePath",basePath);
	request.setAttribute("local",local);
	//System.out.println("=======================LOCALE======================"+local);
	//System.out.println("=======================BASEPATH======================"+basePath);
%>
<base href="<%=basePath%>">	
<link rel="stylesheet" type="text/css" href="resources/css/base.css" />
<script>
	var basePath = '<%=basePath%>';
</script>
<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="dwr/util.js"></script>
</head>


