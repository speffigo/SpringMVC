<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<% 
int i=(int)request.getAttribute("answer");
%>
<h3><%= i%></h3>

</body>
</html>