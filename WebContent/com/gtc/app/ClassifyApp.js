define([ 'jquery','backbone','mediator', 'widget/panel/MenuPanel', 'widget/panel/ClassifyMenuPanel' ], function($,Backbone,Mediator, MenuPanel, ClassifyMenuPanel) {
	return {
		init : function() {
			$(window.document).bind('click', this.pubBodyClick);
			var menuPanel = new MenuPanel({el:$(".headerMenu")});
			menuPanel.render();
			
			var classifyMenuPanel = new ClassifyMenuPanel({el:$(".classifyMenu")});
			classifyMenuPanel.render();
		},
		pubBodyClick: function(ev){
			Backbone.Mediator.publish("BODY_CLICK",ev);
		}
	};
});