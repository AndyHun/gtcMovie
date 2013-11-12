define(['jquery', 'backbone'],function($, Backbone){
	var singleton = null;
	
	return Backbone.Model.extend({
		constructor: function(){
			if (singleton !== null) {
                throw new Error(
                    "Cannot instantiate more than one Setting.");
            }
			Backbone.Model.prototype.constructor.apply(this,arguments);
            singleton = this;
		},
		defaults: {
			widgetPath: null,
			mediaPath: null
		},
		initialize: function(){
			console.debug("Setting initialize");
		},
		destroy: function(){
			singleton = null;
			console.debug("Setting destroy");
		}
	});
});