<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
     prefix="c" %>
<html>
<head>
<link rel="stylesheet"
    href="../assets/css/materialize.min.css" >
    <script  src="../assets/js/materialize.min.js" ></script>
</head>
<body>
<jsp:include page="../menu.jsp"/>
<table>
	<thead>
	  <tr>
	    <th> Descri��o</th>
	    <th> # </th>
	  </tr>
	</thead>
	<tbody>
	  <c:forEach items="${itemList}" var="corrente"  >
	  	<tr>
	  	  <td>${corrente.descricao}</td>
	  	  <td> <a href="editar?id=${corrente.idItem }"> 
	  	  	editar
	  	  </a>
	  	</tr>
	  </c:forEach>
	</tbody>
</table>

</body>
</html>