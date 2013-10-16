require.config({
	baseUrl : 'com/gtc',
	paths : {
		jquery : '../../lib/jquery',
		underscore : '../../lib/underscore',
		backbone : '../../lib/backbone',
		mediator : "../../lib/backbone-mediator",
		jqCarousel : '../../lib/cloud-carousel.1.0.5',
		jqCorner : '../../lib/jquery.corner',
		jqLiveSearch : '../../lib/jquery.liveSearch',
		jqNoConflict : 'core/JqueryNoConflict',
		corePackage : 'core/corePackage',
		text : '../../lib/text'
	},
	shim : {
		jqCarousel : {
			deps : [ 'jquery' ]
		},
		jqCorner : {
			deps : [ 'jquery' ]
		},
		jqLiveSearch : {
			deps : [ 'jquery' ]
		},
		underscore : {
			exports : '_', //only useble for non-AMD lib,
			init : function(){
				return this._.noConflict();
			}
		},
		backbone : {
			deps : [ 'underscore', 'jquery' ],
			exports : 'Backbone',
			init : function(_, $){
				return this.Backbone.noConflict();
			}
		}
	},
	map : {
		// '*' means all modules will get 'jquery-private'
		// for their 'jquery' dependency.
		'*' : {
			'jquery' : 'jqNoConflict'
		},
		// 'jquery-private' wants the real jQuery module
		// though. If this line was not here, there would
		// be an unresolvable cyclic dependency.
		'jqNoConflict' : {
			'jquery' : 'jquery'
		}
	}
});

require(['app/HomeApp', 'corePackage'], function(homeApp, core) {
	new core.Panel({width:200,count:89});
	//new core.View({width:200});
	//homeApp.init();
});