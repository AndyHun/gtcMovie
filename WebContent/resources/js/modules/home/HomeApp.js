define([ 'jquery', 'modules/home/models/LoginUser',
		'component/views/LiveSearch' ], function($, LoginUser, LiveSearch) {
	return {
		init : function() {
			var loginUser = new LoginUser;
			loginUser.set({
				name : 'AndyHun'
			});
			var liveSearch = new LiveSearch({
				el : $("#header-search"),
				liveUrl : "sign?logon&userCode="
			});
		}
	};
});