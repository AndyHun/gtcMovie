define(['jquery', 'backbone', 'mediator', 'underscore','corePackage','text!widget/panel/template/ClassifyMenuPanel.html'],function($, Backbone,Mediator, _, core, Template){
	return core.Panel.extend({
		defaults : {
		},
		events: {
			"click .classifyList >li>span": "swithClassifyDropdown"
		},
		initialize : function(){
			this.set(core.Panel.prototype.defaults);/* inherit parent defaults */
			core.Panel.prototype.initialize.apply(this, arguments);
			this.loadCss("widget/panel/css/ClassifyMenuPanel.css");
		},
		render: function(){
			$(this.el).html(_.template(Template, this._getTemplateParameter()));
		},
		swithClassifyDropdown : function(ev){
			/*console.debug($(ev.target).parent().parent().find(".classifyDropdown"));*/
			console.debug($(ev.target));
			if($(ev.target).next().hasClass("off")){
				console.debug("swithClassifyDropdown off");
				$(".classifyDropdown.open").removeClass("open").addClass("off");//off current opened .classifyDropdown
				$(ev.target).next().removeClass("off").addClass("open");
				Backbone.Mediator.sub("BODY_CLICK", this.offClassifyDropdown, this);
			}else if($(ev.target).next().hasClass("open")){
				console.debug("swithClassifyDropdown open");
				$(".classifyDropdown.open").removeClass("open").addClass("off");//off current opened .classifyDropdown
				Backbone.Mediator.unsubscribe("BODY_CLICK", this.offClassifyDropdown, this);
			}
		},
		offClassifyDropdown: function(ev){
			console.debug("offClassifyDropdown");
			if($(ev.target).filter("[data-pancakes]").get(0) != ev.target){
				$(".classifyDropdown.open").removeClass("open").addClass("off");
				Backbone.Mediator.unsubscribe("BODY_CLICK", this.offClassifyDropdown, this);
			}
		}
	});
});