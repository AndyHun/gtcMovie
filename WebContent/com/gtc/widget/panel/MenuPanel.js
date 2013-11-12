define(['jquery', 'backbone', 'underscore','corePackage','text!widget/panel/template/MenuPanel.html'],function($, Backbone, _, core, MenuPanelTemplate){
	return core.Panel.extend({
		defaults : {
		},
		events: {
			"click .menu_home": "goHomePage",
			"click .menu_hot": "goHotPage",
			"click .menu_classify": "goClassifyPage",
			"click .menu_latest": "goLatestPage"
		},
		initialize : function(){
			this.set(core.Panel.prototype.defaults);/* inherit parent defaults */
			core.Panel.prototype.initialize.apply(this, arguments);
			this.loadCss("widget/panel/css/MenuPanel.css");
		},
		render: function(){
			$(this.el).html(_.template(MenuPanelTemplate, this._getTemplateParameter()));
		},
		goHomePage: function(){
			alert("home");
		},
		goHotPage: function(){
			alert("hot");
		},
		goClassifyPage: function(){
			alert("classify");
		},
		goLatestPage: function(){
			alert("latest");
		}
	});
});