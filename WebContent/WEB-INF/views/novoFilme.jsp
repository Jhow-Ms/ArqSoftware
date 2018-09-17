<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Novo FIlme</title>
<style>

	input{
	
		display: block;			
	}
	
</style>
</head>
<body>
	
	<h1> Cadastre um novo filme </h1>

	<form action="inserir" method="post">
		
		<label>Nome do filme </label>
		<input type="text" name="nome">
		<br>
		
		<label>Diretor </label>
		<input type="text" name="diretor"> 
		<br>
		
		<label>Descrição do filme </label>
		<input type="text" name="descricao">
		<br>			
		
		<select name="genero.id">
			<c:forEach var="genero" items="${generos}">
				<option value="${genero.id}">${genero.nome}</option>
			</c:forEach>
		</select>
		
		
		<label>Data de lancamento </label>
		<input type="date" name="dataLancamento">
		<br>
		
		<label>PosterPath </label>
		<input type="text" name="posterPath">
		<br>
		
		<label>popularidade </label>
		<input type="number" name="popularidade" >
		<br>
		
		<button type="submit">Cadastrar </button>
	
	</form>


</body>
</html>