define([ 'jquery',
		'SearchMenu','ListMenu','ListMedia' ], function($, SearchMenu, ListMenu,ListMedia) {
	return {
		init : function() {
			var searchMenu = new SearchMenu({
				el : $(".searchLayout"),
				liveUrl : "sign?logon&userCode="
			});
			
			var listMenu = new ListMenu({
				el: $(".listMenuLayout")
			});
			
			var listMedia = new ListMedia({
				el: $(".listMovieLayout")
			});
		}
	};
});