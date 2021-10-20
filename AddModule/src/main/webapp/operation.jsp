<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>

	<%
	String n1 = request.getParameter("num1");
	String n2 = request.getParameter("num2");
	//double a = Double.parseDouble(n1);
	//double b = Double.parseDouble(n2);
	//double dev = a / b;
	int a = Integer.parseInt(n1);
	int b = Integer.parseInt(n2);
	
	int dev = a / b ;

//	out.println("<h2> Result is: " + dev + "<h2");
	%>
	
	<h2> Result is: <%= dev %></h2>


</body>
</html>