<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String login=(String) request.getAttribute("login");
String pw =(String) request.getAttribute("pw");
%>
<p>Bonjour <br/> vous avez tap� comme login:<%=login %> et comme mot de passe <%=pw %>


</body>
</html>