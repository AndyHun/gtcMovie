<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/core/base.jsp"%>

<html>
<head>

<!-- You can load the jQuery library from the Google Content Network.
Probably better than from your own server. -->
<script type="text/javascript" src="resources/js/common/jquery-1.9.1.js"></script>

<!-- Load the CloudCarousel JavaScript file -->
<script type="text/javascript" src="resources/js/plugins/cloud-carousel.1.0.5.js"></script>

<script>
$(document).ready(function(){
						   
	// This initialises carousels on the container elements specified, in this case, carousel1.
	$("#carousel1").CloudCarousel(		
		{			
			xPos: 128,
			yPos: 32,
			buttonLeft: $("#left-but"),
			buttonRight: $("#right-but"),
			altBox: $("#alt-text"),
			titleBox: $("#title-text")
		}
	);
});
 
</script>

</head>
<body>
	Welcome to miniGTC ${userVO.userCode} sfsdfsdf
	<!-- This is the container for the carousel. -->
	<div id="carousel1" style="width: 500px; height: 300px; background-image:url('resources/image/bg.jpg'); overflow: scroll;">
		<!-- All images with class of "cloudcarousel" will be turned into carousel items -->
		<!-- You can place links around these images -->
		<img class="cloudcarousel" src="resources/image/flag1.png" height="150" width="160" alt="Flag 1 Description" title="Flag 1 Title" /> 
		<img class="cloudcarousel" src="resources/image/flag2.png" height="150" width="160" alt="Flag 2 Description" title="Flag 2 Title" /> 
		<img class="cloudcarousel" src="resources/image/flag3.png" height="150" width="160" alt="Flag 3 Description" title="Flag 3 Title" /> 
		<img class="cloudcarousel" src="resources/image/flag4.png" height="150" width="160" alt="Flag 4 Description" title="Flag 4 Title" />
	</div>

	<!-- Define left and right buttons. -->
	<input id="left-but" type="button" value="Left" />
	<input id="right-but" type="button" value="Right" />

	<!-- Define elements to accept the alt and title text from the images. -->
	<p id="title-text"></p>
	<p id="alt-text"></p>
</body>
</html>
