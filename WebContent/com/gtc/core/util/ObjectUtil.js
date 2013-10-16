define(['jquery'], function($){
	return {
		isNull: function(obj){
			if(typeof obj === undefined || typeof obj === null){
				return true;
			}
			return false;
		}
	}
});