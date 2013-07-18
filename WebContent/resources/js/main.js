require.config({
	baseUrl : 'resources/js',
	paths : {
		jquery : 'lib/jquery',
		underscore : 'lib/underscore',
		backbone : 'lib/backbone',
		jqCarousel : 'plugins/cloud-carousel.1.0.5',
		jqCorner : 'plugins/jquery.corner',
		jqLiveSearch : 'plugins/jquery.liveSearch',
		jqNoConflict : 'core/JqueryNoConflict',
		text : 'lib/text',
		GtcView : 'core/views/GtcView'
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

require([ 'modules/home/HomeApp' ], function(homeApp) {
	homeApp.init();
});