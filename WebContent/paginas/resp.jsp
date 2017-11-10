<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="model.PalavraDB"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- String palavra =(String)session.getAttribute("palavraT");
	String de =(String)session.getAttribute("deT");
	String para =(String)session.getAttribute("paraT"); -->
	<%String res =(String)session.getAttribute("r");
	String palavra =(String)session.getAttribute("p");
	%>
	 Tradução: <%=palavra%> é <%=res%>
</body>
</html>