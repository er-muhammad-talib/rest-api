<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body
	style="background: url(images/register.jpg); background-size: cover; background-attachment: fixed;">

	<div class="container">

		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">


						<h3 style="margin-top: 10px;" class="center-align">Register
							here</h3>

						<div class="form center-align">

							<form action="Register" method="post" center-align>
								<input type="text" name="user_name"
									placeholder="Enter user name"> <input type="email"
									name="user_email" placeholder="Enter user email"> <input
									type="password" name="user_password"
									placeholder="Enter password">

								<button type="submit" class="btn  blue">Submit</button>

							</form>
						</div>

						<div class="loader center-align" style="margin-top: 10px; display: none;">

							<div class="preloader-wrapper big active">
							<div class="spinner-layer spinner-blue-only">
								<div class="circle-clipper left">
									<div class="circle"></div>
								</div>
								<div class="gap-patch">
									<div class="circle"></div>
								</div>
								<div class="circle-clipper right">
									<div class="circle"></div>
								</div>
							</div>
						</div>
						
						<h5>Please wait...</h5>






					</div>






				</div>

			</div>
		</div>




	</div>

	</div>





</body>
</html>