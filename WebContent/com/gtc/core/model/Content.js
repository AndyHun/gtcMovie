define(['jquery', 'backbone'],function($, Backbone){
	var singleton = null;
	
	return Backbone.Model.extend({
		constructor: function(){
			if (singleton !== null) {
                throw new Error(
                    "Cannot instantiate more than one Content.");
            }
			Backbone.Model.prototype.constructor.apply(this,arguments);
            singleton = this;
		},
		defaults: {
			
		},
		initialize: function(){
			console.debug("Content initialize");
		},
		destroy: function(){
			singleton = null;
			console.debug("Setting destroy");
		}
	});
});