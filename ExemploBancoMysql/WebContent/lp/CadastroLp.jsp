<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="form1" method="post" action="/ExemploBancoMysql/inserirLp">
	<table>
		<tr>
			<td>Nome do disco:</td>
			<td><input type="text" name="nome" /></td>
		</tr>
		<tr>
			<td>Cantor:</td>
			<td><input type="text" name="cantor"/></td>
		</tr>
		<tr>
			<td>Ano de lançamento: </td>
			<td><input type="text" name="ano"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Cadastrar"/>&nbsp;
				<input type="reset" value="Limpar"/>
			</td>
		</tr>
	</table>

</form>

</body>
</html>