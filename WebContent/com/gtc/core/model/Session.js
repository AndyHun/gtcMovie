/**
 * Example:
 * require(['path-Session'],function(Session){
 * 	  var session = new Session()| Session.getInstance(); // First use example
 *    var session2 = Session.getInstance; // Use secondly example
 * });
 */
define([ 'jquery', 'backbone','core/model/Setting'], function($, Backbone, Setting) {
	var singleton = null;
	
	var Session = Backbone.Model.extend({
		constructor: function(){
			if (singleton !== null) {
                throw new Error(
                    "Cannot instantiate more than one Session.");
            }
			Backbone.Model.prototype.constructor.apply(this,arguments);
            singleton = this;
		},
		defaults: {
			setting: null,
			content: null
		},
		initialize: function(){
			this.set('setting', new Setting());
			console.debug("Session initialize");
		},
		getSetting: function(key, defaultValue){
			console.debug("Session getSetting");
			//if(Util.ObjectUtil.isNull())
		},
		destroy: function(){
			this.get("setting").destroy();
			singleton = null;
			console.debug("Session destroy");
		}
	});
	
	Session.getInstance = function(){
		if(singleton == null){
			singleton = new this();
		}
		return singleton;
	}
	return Session;
});