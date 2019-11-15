var app = angular.module("myApp", []);
		app.controller("appController",function($scope, $http) {
			$scope.ip = 'http://10.33.56.76:8081';
			$scope.catagory = [];
			refreshCatagoryData();
			function refreshCatagoryData() {
				$http({
					method : 'GET',
					url : $scope.ip+'/allCatagory'
				}).then(function(response) {
					$scope.catagory = response.data;
					console.log($scope.catagory);
				});
			}				
});
		
		//http://10.33.56.76:8081/allCatagory
		//http://rms.rootdine.com:8081/allCatagory
		
		
		