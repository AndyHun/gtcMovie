define(['jquery'], function($){
	return {
		isNull: function(value){
			if(typeof value === "undefined" || value === null){
				return true;
			}
			return false;
		}
	}
});