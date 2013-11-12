define(['jquery', 'backbone', 'underscore','corePackage'],function($, Backbone, _, core){
	return core.Panel.extend({
		defaults : {
		},
		events: {
			
		},
		initialize : function(){
			this.set(core.Panel.prototype.defaults);/* inherit parent defaults */
			core.Panel.prototype.initialize.apply(this, arguments);
			this.loadCss("widget/panel/css/MediaPannel.css");
		},
		render: function(){
			$(this.el).html(_.template(MenuPanelTemplate, this._getTemplateParameter()));
		}
	});
});