define([ 'underscore', 'backbone' ], function(_, Backbone) {
	return Backbone.Model.extend({
		defaults : {
			name : null,
			pwd : null,
			local : 'zh-cn'
		},
		initialize : function() {
			this.bind("change:name", function() {
				console.log("name change to:" + this.get("name"));
			});
		}
	});
});