function hello() {
	var logonVO = {userCode:11111};
	var arr = new Array([ logonVO,logonVO,logonVO ], [ logonVO,logonVO,logonVO ]); 
	
	helloDwr.hello(new Array(1,2,3),arr,function(data){
		alert(data);
	});
}

function privateHello() {
	helloDwr.privateHello("Andy", function(data) {
		alert(data);//中文
	});
}
/*
$(document).ready(function() {
	$('div.container').corner("");
	jQuery('#search').liveSearch({url: 'sign?logon&userCode=',btnId:'searchBtn'});
});*/
