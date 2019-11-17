<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<meta charset="UTF-8">
<link rel="stylesheet" href="../assets/css/materialize.min.css">
<script src="../assets/js/materialize.min.js"></script>
</head>
<body>
<jsp:include page="../menu.jsp"/>
	<c:if test="${gravado}">
		<h1>Item gravado com sucesso!</h1>
	</c:if>
<div class="row" >

	<form action="gravar" method="post">
		<input type="hidden" name="item.id" value="${entidade.ID}">
		<div class="row">
			<div class="input-field col s12">
				<input type="text" name="item.descricao" 
				value="${entidade.descricao}" class="validate" >
				<label >Descrição</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col">
				<input type="submit" class="btn" value="Gravar">
			</div>
		</div>


	</form>
</div>
</body>
</html>