define([ 'jquery', 'backbone', 'underscore' ], function ($, Backbone, _) {
	return Backbone.View.extend({
		defaults : {},
		initialize : function(){
			console.debug("GtcView initialize");
			for(var key in this.defaults){
				this.defaults[key] = arguments[0][key];
			}
		},
		get : function(key){
			return this.defaults[key];
		},
		set: function(jsonObj){
			for (var key in jsonObj){
				this.defaults[key] = jsonObj[key];
			}
		}
		/*,
		//Js 无法实现子类通过父类的_super调用被子类覆盖的方法，例如
		// _super.initialize() 会造成死循环
		_super: function(){return this}*/
	});
});