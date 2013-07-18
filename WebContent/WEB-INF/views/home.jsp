<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/core/base.jsp"%>
<!-- 考虑使用 apache tiles -->

<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/home.css" />
<link rel="stylesheet" type="text/css" href="resources/css/plugins/jquery.liveSearch.css" />
<script type="text/javascript" src="dwr/interface/helloDwr.js"></script>
<!-- <script type="text/javascript" src="resources/js/plugins/jquery.corner.js"></script>
<script type="text/javascript" src="resources/js/plugins/jquery.liveSearch.js"></script> -->
<!-- <script type="text/javascript" src="resources/js/home.js"></script> -->
</head>

<body>
	<div class="container">
		<div class="header">
			<div class="header-bg">
				<img src="resources/image/home/header-bg.jpg">
			</div>
			<div class="header-logo">
				<img src="resources/image/gtc-logo.jpg">
			</div>
			<div id="header-search" class="header-search" >
				
			</div>
		</div>
		
		<div class="content">
			<div class="left">Left</div>
			<div class="right">
				Welcome to miniGTC <input type="button"
					value="HelloDwr" onClick="hello()" /> <input type="button"
					value="PrivateHelloDwr" onClick="privateHello()" /> </br> </br>
				<form action="sign?logon" method="post">
					name:<input type="text" name="userCode" /> pwd:<input type="text"
						name="password" /></br> local:<select name="locale">
						<option value="zh_cn">中文</option>
						<option value="en_us">English</option>
					</select> <input type="submit" />
				</form>
			</div>
			
		</div>
		<div class="footer">
		Copyright © 2013 GTC, Inc.
		[闽ICP备xxxx号]
		</div>
	</div>
</body>
<!-- A page can only have one the following script -->
<script data-main="resources/js/main" src="resources/js/lib/require.js"></script>

</html>