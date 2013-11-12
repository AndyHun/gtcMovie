define([ 'jquery', 'backbone', 'underscore','core/util/StringUtil','core/util/ObjectUtil','text!core/view/template/Panel.html' ], function ($, Backbone, _, StringUtil, ObjectUtil, PanelTemplate) {
	var View = Backbone.View.extend({
		defaults : {
			panelTitle: "Panel Title",
			width: '100%',
			height: '100%',
			lengthUnit: "px", /*px|pt|em|....*/
		},
		initialize : function(){
			this.reloadDefaults(arguments[0]);
			this.loadCss('core/view/css/Panel.css');
		},
		render : function() {
			$(this.el).html(_.template(PanelTemplate, this._getTemplateParameter()));
		},
		get : function(key){
			return this.defaults[key];
		},
		set: function(jsonObj){
			for (var key in jsonObj){
				this.defaults[key] = jsonObj[key];
			}
		},
		reloadDefaults: function(jsonObj){
			if(ObjectUtil.isNull(jsonObj)){
				return;
			}
			for(var key in this.defaults){
				if(!StringUtil.isNull(jsonObj[key])){
					this.defaults[key] = jsonObj[key]
				}
			}
		},
		loadCss : function(cssPath) {
			console.debug("loadCss:"+cssPath);
			var link = document.createElement("link");
			link.type = "text/css";
			link.rel = "stylesheet";
			link.href = this.getPath(cssPath);
			document.getElementsByTagName("head")[0].appendChild(link);
		},
		getPath: function(filePath){
			return require.toUrl(filePath);
		},
		_getTemplateParameter: function(){
			return {
				panelTitle: this.get("panelTitle")
			}
		}
		/*
		 * , //Js 无法实现子类通过父类的_super调用被子类覆盖的方法，例如 // _super.initialize() 会造成死循环
		 * _super: function(){return this}
		 */
	});
	return View;
});