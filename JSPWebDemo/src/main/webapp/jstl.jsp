<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exampel Taglip</title>
</head>
<body>

<h1>Taglib directive  totorial for example </h1>
<br>

<c:set var="name" value="Talib khan"></c:set>
<c:out value="${name}"> </c:out>

<c:if test="${3 > 4 }">  <h2>This is true condition</h2> </c:if>
</body>
</html>