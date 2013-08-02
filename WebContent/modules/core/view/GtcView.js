define([ 'jquery', 'backbone', 'underscore' ], function ($, Backbone, _) {
	return Backbone.View.extend({
		defaults : {},
		initialize : function(){
			console.debug("GtcView initialize");
			for(var key in this.defaults){
				console.debug(key);
				if(arguments[0][key]!='' && arguments[0][key]!=null && arguments[0][key]!="undefined"){
					this.defaults[key] = arguments[0][key];
					console.debug("value:"+arguments[0][key]);
				}
			}
		},
		get : function(key){
			return this.defaults[key];
		},
		set: function(jsonObj){
			for (var key in jsonObj){
				this.defaults[key] = jsonObj[key];
			}
		},
		loadCss : function(cssPath) {
			console.debug("loadCss:"+cssPath);
			var link = document.createElement("link");
			link.type = "text/css";
			link.rel = "stylesheet";
			link.href = cssPath;
			document.getElementsByTagName("head")[0].appendChild(link);
		}
		/*
		 * , //Js 无法实现子类通过父类的_super调用被子类覆盖的方法，例如 // _super.initialize() 会造成死循环
		 * _super: function(){return this}
		 */
	});
});