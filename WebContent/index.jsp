<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<div id="interface">
		 <nav class="menu">
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="paginas/login.jsp">Entrar</a></li>
				</ul>
			</nav>
			<h5>Dicionário</h5>
			<form action="TradutorServLet" method="post">
				<select name="de">
					<option value="portugues">Português</option>
					<option value="coreano">Coreano</option>
				</select><br><br>
				<input type="text" name="palavra">
				<br><br>
				<select name="para">
					<option value="portugues">Português</option>
					<option value="coreano">Coreano</option>
				</select><br><br>
				<input type="submit" value="Traduzir">
			</form>
		</div>
	</body>
</html>