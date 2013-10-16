define([ 'jquery', 'backbone', 'underscore',
		'text!widget/panel/template/ListMedia.html', 'corePackage','mediator' ], function($,
		Backbone, _, viewTemplate, core,Mediator) {
	return core.View.extend({
		defaults : {
			isLoadCss : true
		},
		template : _.template(viewTemplate),
		events : {
			
		},
		initialize : function() {
			console.debug("ListMenu.initialize");
			if(this.get("isLoadCss")){
				this.loadCss('widget/panel/css/ListMedia.css');
			}
			core.View.prototype.initialize.apply(this, arguments);
			this.render();
		},
		render : function() {
			console.debug("ListMenu.render");
			$(this.el).html(this.template());
		}
	});
});