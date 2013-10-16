define([ 'jquery', 'backbone', 'underscore',
		'text!widget/panel/template/ListMenu.html', 'corePackage','mediator' ], function($,
		Backbone, _, viewTemplate, core,Mediator) {
	return core.View.extend({
		defaults : {
			
		},
		template : _.template(viewTemplate),
		events : {
			
		},
		initialize : function() {
			console.debug("ListMenu.initialize");
			this.loadCss('widget/panel/css/ListMenu.css');
			core.View.prototype.initialize.apply(this, arguments);
			this.render();
		},
		render : function() {
			console.debug("ListMenu.render");
			$(this.el).html(this.template());
		}
	});
});