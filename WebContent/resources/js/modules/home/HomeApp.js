define([ 'jquery', 'modules/home/models/LoginUser',
		'component/views/SearchMenu' ], function($, LoginUser, SearchMenu) {
	return {
		init : function() {
			var searchMenu = new SearchMenu({
				el : $(".searchLayout"),
				liveUrl : "sign?logon&userCode="
			});
		}
	};
});