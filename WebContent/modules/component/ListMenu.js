define([ 'jquery', 'backbone', 'underscore',
		'text!templates/ListMenu.html', 'GtcView','mediator' ], function($,
		Backbone, _, viewTemplate, GtcView,Mediator) {
	return GtcView.extend({
		defaults : {
			
		},
		template : _.template(viewTemplate),
		events : {
			
		},
		initialize : function() {
			console.debug("ListMenu.initialize");
			this.loadCss('css/ListMenu.css');
			GtcView.prototype.initialize.apply(this, arguments);
			this.render();
		},
		render : function() {
			console.debug("ListMenu.render");
			$(this.el).html(this.template());
		}
	});
});