<!DOCTYPE html>
<html lang="en">
<head>

</head>
<body ng-app="myApp" ng-controller="appController">
   <div class="container">
		<div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-danger">
				<div class="col-md-8">
					<a class="navbar-brand text-light" href="#">ROOT DINE</a>
				</div>
				<div class="col-md-4">
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item active"><a class="nav-link text-light"
								href="#">Home </a></li>
							<li class="nav-item active"><a class="nav-link text-light"
								href="#">About </a></li>
							<li class="nav-item active"><a class="nav-link text-light"
								href="#">Contact </a></li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle text-light" href="#"
								id="navbarDropdown" role="button" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false"> Career </a>
								<div class="dropdown-menu" aria-labelledby="navbarDropdown">
									<a class="dropdown-item" href="#">Action</a> <a
										class="dropdown-item" href="#">Another action</a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="#">Something else here</a>
								</div></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>
<div class="container mt-2">
<center>
	<div class="row">
	<div ng-repeat="cat in catagory">
	<div class="col-md-3 mt-1">
			<div class="card" style="width: 18rem;">
<!-- 				<img src="..." class="card-img-top" alt="image one"> -->
				<div class="card-body">
					<h5 class="card-title">{{cat.tx_catagory_name}}</h5>
					<a href="#" class="btn btn-primary">Explore Now</a>
				</div>
			</div>
		</div>
	</div>	
	</div>
	</center>
</div>
    <script type="text/javascript">
    
    </script>
</body>
</html>