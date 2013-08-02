require.config({
	baseUrl : 'modules/component',
	paths : {
		jquery : '/modules/lib/jquery',
		underscore : '/modules/lib/underscore',
		backbone : '/modules/lib/backbone',
		mediator : "/modules/lib/backbone-mediator",
		jqCarousel : '/modules/plugins/cloud-carousel.1.0.5',
		jqCorner : '/modules/plugins/jquery.corner',
		jqLiveSearch : '/modules/plugins/jquery.liveSearch',
		jqNoConflict : '/modules/core/JqueryNoConflict',
		text : '/modules/lib/text',
		GtcView : '/modules/core/views/GtcView'
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

require([ '/modules/app/HomeApp' ], function(homeApp) {
	homeApp.init();
});