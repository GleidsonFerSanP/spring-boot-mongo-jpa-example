angular.module('user', [])
.constant('Const',{
    "baseUrl": "http://localhost:8080"
})
.controller('UserCtrl', function($scope, User) {
	
	$scope.insert = function(user) {
		
		User.insert(user, function(response) {
			
			console.log(response);
			
		}, function() {
			console.log(response);
		});
	}
	
})
.factory('User', function($http, Const) {
	
	return {
		insert : function(obj, callbackSucesso, callbackErro) {
			
			$http({
				method : "POST",
				url : Const.baseUrl+"/users",
				data: obj
			}).then(function success(response) {
				callbackSucesso(response);
			}, function error(response) {
				callbackErro(response);
			});
			
		}
	}
});