define([ 'jquery', 'backbone', 'underscore',
		'text!widget/panel/template/SearchMenu.html', 'corePackage','jqLiveSearch','mediator' ], function($,
		Backbone, _, viewTemplate, core, jqLiveSearch,Mediator) {
	return core.View.extend({
		defaults : {
			liveUrl : null,
			liveEl : ".movieSearch",
			liveBtn : ".movieSearchBtn",
			borderDraw: "2px solid #CF005D",
			borderNone: "2px solid #D8D8D8",
			focus : false
		},
		template : _.template(viewTemplate),
		events : {
			'click .searchBtn' : 'doSearch',
			'mouseover .movieSearch' : 'doDraw',
			'mouseout .movieSearch' : 'removeDraw',
			'focus .movieSearch' : function(){Backbone.Mediator.pub("MovieSearch:focus", this);},
			'blur .movieSearch' : function(){Backbone.Mediator.pub("MovieSearch:blur",this);}
		},
		initialize : function() {
			console.debug("SearchMenu.initialize");
			this.loadCss('widget/panel/css/jquery.liveSearch.css');
			this.loadCss('widget/panel/css/SearchMenu.css');
			core.View.prototype.initialize.apply(this, arguments);
			Backbone.Mediator.sub("MovieSearch:focus", this.focus, this);
			Backbone.Mediator.sub("MovieSearch:focus", this.doDraw, this);
			Backbone.Mediator.sub("MovieSearch:blur", this.blur,this );
			Backbone.Mediator.sub("MovieSearch:blur", this.removeDraw, this);
			this.render();
		},
		render : function() {
			console.debug("SearchMenu.render");
			$(this.el).html(this.template());
			$(this.get("liveEl")).liveSearch({
				url : this.get("liveUrl"),
				button : this.get("liveBtn")
			});
		},
		doSearch : function(event) {
		},
		doDraw : function(event){
			$(".movieSearch").css("border",this.get("borderDraw"));
		},
		removeDraw : function(event){
			if(!this.get("focus")){
				$(".movieSearch").css("border",this.get("borderNone"));
			}
		},
		focus : function(event){
			this.set({"focus":true});
		},
		blur : function(){
			this.set({"focus":false});
		}
	});
});