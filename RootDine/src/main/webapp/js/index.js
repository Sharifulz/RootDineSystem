var app = angular.module("myApp", []);
app
		.controller(
				"appController",
				function($scope, $http) {
					$scope.ip = 'http://localhost:8081';
					$scope.isVisibleMenu1 = true;
					$scope.isVisibleMenu2 = false;
					$scope.isVisibleMenu3 = false;
					$scope.isVisibleMenu4 = false;
					$scope.myApi = [];
					refreshCatagoryData();
					function refreshCatagoryData() {
						$http({
							method : 'GET',
							url : $scope.ip + '/all'
						})
								.then(
										function(response) {
											$scope.myApi = response.data;
											console.log($scope.myApi);
											$scope.menu1 = [];
											for (var i = 0; i < $scope.myApi.length; i++) {
												$scope.menu1
														.push($scope.myApi[i]["catagoryName"]);
											}
											console.log($scope.menu1);
										});
					}
					$scope.foodList = [];
					$scope.ttb = function(x) {
						$scope.isVisibleMenu1 = false;
						localStorage.setItem("id_catagory", x);
						$scope.menu2 = $scope.myApi[x]["food"];
						$scope.foodList = [];
						for (var i = 0; i < $scope.menu2.length; i++) {
							$scope.foodList.push($scope.menu2[i]["foodName"]);
						}
						$scope.isVisibleMenu2 = true;
					}

					$scope.subFoodList = [];
					$scope.ttc = function(food_id) {
						$scope.isVisibleMenu2 = false;
						localStorage.setItem("id_food", food_id);
						$scope.subFoodList = [];
						var id_catagory = localStorage.getItem("id_catagory");
						$scope.menu3 = $scope.myApi[id_catagory]["food"][food_id]["foodSubCatagory"];
						for (var i = 0; i < $scope.menu3.length; i++) {
							$scope.subFoodList
									.push($scope.menu3[i]["subFoodDesc"]);
						}
						$scope.isVisibleMenu3 = true;
					}

					$scope.selectedList = {};

					$scope.order_list = {
						"catagory_name" : "",
						"food_name" : "",
						"food_price" : 0,
						"sub_menu_details" : []
					};
					$scope.submit = function() {
						$scope.isVisibleMenu3 = false;
						var catagory_id = localStorage.getItem("id_catagory");
						var food_id = localStorage.getItem("id_food");
						var choosenCatagory = $scope.myApi[catagory_id]["catagoryName"];
						var choosenFood = $scope.myApi[catagory_id]["food"][food_id]["foodName"];
						var choosenFoodPrice = $scope.myApi[catagory_id]["food"][food_id]["foodPrice"];
						var food_sub_menu = [];
						angular
								.forEach(
										$scope.selectedList,
										function(selected, subfood) {
											if (selected) {
												var sub_menu_item = {
													"item_name" : "",
													"item_price" : 0
												};
												sub_menu_item.item_name = $scope.myApi[catagory_id]["food"][food_id]["foodSubCatagory"][subfood]["subFoodDesc"];
												sub_menu_item.item_price = $scope.myApi[catagory_id]["food"][food_id]["foodSubCatagory"][subfood]["subFoodPrice"];
												$scope.order_list.sub_menu_details
														.push(sub_menu_item);
											}
										});
						$scope.order_list.catagory_name = choosenCatagory;
						$scope.order_list.food_name = choosenFood;
						$scope.order_list.food_price = choosenFoodPrice;
						console.log($scope.order_list);
						$scope.isVisibleMenu4 = true;
					};
				});
