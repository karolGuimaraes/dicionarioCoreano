<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


</head>
<body style="font-family:Verdana;">
 <nav class="menu">
				<ul>
					<li><a href="../index.jsp">Home</a></li>
					<li><a href="paginas/login.jsp">Entrar</a></li>
				</ul>
			</nav>
<form action="LoginServlet" method="post">

<div class="login"> 
	<h2>Login Aqui</h2>
	<p class="login">Login</p>
	<p><input type="text" id="login" name="login" size="40"></p>
	<p class="login">Senha</p>
	<input type="password" id="senha" name="senha" size="40"><br><br>
	
	<input type="submit" value="Entrar" class="botao">


</div>
</form>
</body>
</html>