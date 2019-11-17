<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="../assets/css/materialize.min.css" >
    <script  src="../assets/js/materialize.min.js" ></script>
</head>
<body>
<jsp:include page="../menu.jsp"/>
<table>
    <thead>
    <tr>
        <th> Descrição</th>
        <th> # </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${itemList}" var="corrente"  >
        <tr>
            <td>${corrente.descricao}</td>
            <td> <a href="editar?id=${corrente.id }">
                editar
            </a>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>