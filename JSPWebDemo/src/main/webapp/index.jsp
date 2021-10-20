<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <%@ page errorPage="error_page.jsp" %>
<%@ page import="java.util.Date" %>

<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>


<style>
*{
margin: 0px;
padding: 0px;
}
</style>
</head>
<body style="background: #e2e2">


<div style="background : #0099ff; color: red; padding:20px;">
	<h1>This is my first JSP page</h1>
	<p> Current Date is : <%= new Date()  %></p>
	
</div>
	<%!int firstNumber = 5;
	int secondNumber = 3;
	String name = "My name is Talib";

	public int addTwoNumber() {
		return firstNumber  / secondNumber;
	}

	public String reverse() {

		//StringBuffer br = new StringBuffer(name);
		//return br.reverse().toString();

		return name;

	}%>

	<%
	out.println(" First number is : " + firstNumber);

	out.println("<br>");

	out.println(" Second Number is : " + secondNumber);

	out.println("<br>");

	out.println("Sum is: " + addTwoNumber());

	out.println("<br>");
	out.println(reverse());
	%>

	<h1 style="color: blue">
		Sum is :
		<%=addTwoNumber()%></h1>
	<h2 style="color: green">This made by Muhammad Talib</h2>

<br>

</body>
</html>