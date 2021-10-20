<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.Random" %>
<html>
<head>
<meta charset="UTF-8">
<title>Check JSP tags</title>

</head>
<body style="background: #e2e2;">

<%@include file="index.jsp" %>

	<h1 style="color: blue">This page purpuse is chech all jsp tags</h1>

	<%!
	int num = 20;
	int num2 = 40;
	String name2 = "My name is Talib";

	public int doSum() {
	return num + num2;

 }

%>

	<%
out.println("First number: " + num);
out.println("<br>");
out.println("Second number: " + num2);
out.println("<br>");
out.println("<h1>Sum to number: " + doSum() + "</h1>");
out.println("<br>");
out.println(name2);

%>



<%


out.println("<br>");
Random r = new Random();
int rn = r.nextInt(133);

out.println("<h1>Rendom number is:" + rn+ "</h1>");
%>

<h1><a href="index.jsp">submit</a></h1>

</body>
</html>