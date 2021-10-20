<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Add Module</title>
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<form action="operation.jsp">

					<div class="card">
						<div class="card-header bg-dark text-white">
							<h2>Provide me two numbers</h2>
						</div>
						<div class="card-body">


							<div class="form-group">
								<input name="num1" type="number" class="form-control"
									placeholder="Enter here">
							</div>
							<div class="form-group">
								<input name="num2" type="number" class="form-control"
									placeholder="Enter here">
							</div>

						</div>

						<div class="card-footer text-center bg-dark text-white">
							<button type="submit" class="btn btn-outline-light">GO</button>
							<button type="reset" class="btn btn-outline-light">reset</button>

						</div>




					</div>

				</form>
			</div>
		</div>


	</div>

</body>
</html>