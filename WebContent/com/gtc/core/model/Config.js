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
			"config.widgetPath" : "com/gtc/widget/",
		    "config.mediaPath" : "resources/mediaImage",
		    "content.test": "content-Test"
		},
		setSetting: function(key, value){
			this.set(Config.CONFIG_PREFIX+key, value);
		},
		setContent: function(key){
			this.set(Config.CONTENT_PREFIX+key, value);
		}
	});
	Config.CONFIG_PREFIX = "config.";
	Config.CONTENT_PREFIX = "content.";
	
	Config.getInstance = function(){
		if(singleton == null){
			singleton = new this();
		}
		return singleton;
	}
	return Config;
});