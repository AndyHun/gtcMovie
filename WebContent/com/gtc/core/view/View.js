define([ 'jquery', 'backbone', 'underscore' ], function ($, Backbone, _) {
	var View = Backbone.View.extend({
		defaults : {
			width: 100,
			height: 100,
			lengthUnit: "px", /*px|pt|em|....*/
		},
		initialize : function(){
			this.set(arguments[0]);
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
			link.href = this.getPath(cssPath);
			document.getElementsByTagName("head")[0].appendChild(link);
		},
		getPath: function(filePath){
			return require.toUrl(filePath);
		}
		/*
		 * , //Js 无法实现子类通过父类的_super调用被子类覆盖的方法，例如 // _super.initialize() 会造成死循环
		 * _super: function(){return this}
		 */
	});
	return View;
});