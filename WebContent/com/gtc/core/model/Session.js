/**
 * Example: require(['path-Session'],function(Session){ var session = new
 * Session()| Session.getInstance(); // First use example var session2 =
 * Session.getInstance; // Use secondly example });
 */
define([ 'jquery', 'backbone', 'core/util/ObjectUtil', 'core/util/StringUtil',
		'core/model/Setting', 'core/model/Content','core/model/Config' ], function($, Backbone,
		ObjectUtil, StringUtil, Setting, Content, Config) {
	var singleton = null;
	var REGULAR_CONFIG = /^config.*$/;
	var REGULAR_CONTENT = /^content.*$/;

	var Session = Backbone.Model.extend({
		constructor : function() {
			if (singleton !== null) {
				throw new Error("Cannot instantiate more than one Session.");
			}
			Backbone.Model.prototype.constructor.apply(this, arguments);
			singleton = this;
		},
		defaults : {
			setting : null,
			content : null
		},
		initialize : function() {
			this.set("setting", new Setting());
			this.set("content", new Content());
			console.debug("Session initialize");
		},
		getSetting : function(key, defaultValue) {
			console.debug("Session getSetting");
			if(!ObjectUtil.isNull( this.get("setting"))){
				return ObjectUtil.isNull(this.get("setting").get(key)) ? defaultValue : this.get("setting").get(key);
			}
			return defaultValue;
		},
		reloadSetting: function(){
			var jsonValue = Config.getInstance().toJSON();
			for(var key in jsonValue){
				if(REGULAR_CONFIG.test(key)){
					this.get("setting").set(key.substring(Config.CONFIG_PREFIX.length), jsonValue[key]);
				}
			}
		},
		reloadContent: function(){
			
		},
		destroy : function() {
			this.get("setting").destroy();
			this.get("content").destroy();
			singleton = null;
			console.debug("Session destroy");
		}
	});

	Session.getInstance = function() {
		if (singleton == null) {
			singleton = new this();
		}
		return singleton;
	}
	return Session;
});