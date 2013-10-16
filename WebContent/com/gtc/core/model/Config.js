define(["jquery", "backbone"],function($, Backbone){
	var singleton = null;
	var Config = Backbone.Model.extend({
		constructor: function(){
			if (singleton !== null) {
                throw new Error(
                    "Cannot instantiate more than one Settings.");
            }
			Backbone.Model.prototype.constructor.apply(this,arguments);
            singleton = this;
		},
		defaults:{
			"Session.config" : {widgetPath:"com/gtc/widget/"}
		}
	});
	
	Config.getInstance = function(){
		if(singleton == null){
			singleton = new this();
		}
		return singleton;
	}
	return Config;
});