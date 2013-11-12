define(['jquery'], function($){
	return {
		isNull: function(obj){
			if(typeof obj === "undefined" || obj === null){
				return true;
			}
			return false;
		}
	}
});