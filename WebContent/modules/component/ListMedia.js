define([ 'jquery', 'backbone', 'underscore',
		'text!templates/ListMedia.html', 'GtcView','mediator' ], function($,
		Backbone, _, viewTemplate, GtcView,Mediator) {
	return GtcView.extend({
		defaults : {
			isLoadCss : true
		},
		template : _.template(viewTemplate),
		events : {
			
		},
		initialize : function() {
			console.debug("ListMenu.initialize");
			if(this.get("isLoadCss")){
				this.loadCss('css/ListMedia.css');
			}
			GtcView.prototype.initialize.apply(this, arguments);
			this.render();
		},
		render : function() {
			console.debug("ListMenu.render");
			$(this.el).html(this.template());
		}
	});
});