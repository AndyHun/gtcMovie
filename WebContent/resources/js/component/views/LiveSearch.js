define([ 'jquery', 'backbone', 'underscore',
		'text!component/templates/LiveSearch.html', 'GtcView','jqLiveSearch' ], function($,
		Backbone, _, viewTemplate, GtcView,jqLiveSearch) {
	return GtcView.extend({
		defaults : {
			liveUrl : null,
			liveEl : "liveSearch",
			liveBtn : "liveSearchBtn"
		},
		initialize : function() {
			console.debug("LiveSearch.initialize");
			GtcView.prototype.initialize.apply(this, arguments);
			this.render();
		},
		render : function() {
			console.debug("LiveSearch.render");
			$(this.el).html(this.template());
			/*$("#" + this.liveEl).liveSearch({
				url : this.liveUrl,
				btnId : this.liveBtn
			});*/
			$('#search').liveSearch({url: 'sign?logon&userCode=',btnId:'searchBtn'});
		},
		template : _.template(viewTemplate),
		events : {
			'click #searchBtn' : 'doSearch'
		},
		doSearch : function(event) {
		}
	});
});