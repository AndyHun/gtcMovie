define(['jquery', 'backbone', 'underscore', 'core/view/View'],function($, Backbone, _, View){
	return View.extend({
		defaults: {
			
		},
		initialize : function(){
			this.set(View.prototype.defaults);/*inherit parent defaults*/
			View.prototype.initialize.apply(this, arguments);
		}
	});
});