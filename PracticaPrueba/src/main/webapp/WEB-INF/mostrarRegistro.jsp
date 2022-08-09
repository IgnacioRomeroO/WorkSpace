<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 07-07-2022
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">
    <title>mostrarRegistros</title>
</head>
<body>
<div class="container">

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">id</th>
            <th scope="col">Estudiante</th>
            <th scope="col">Nota</th>
            <th scope="col">Numero de preguntas</th>
            <th scope="col">Duracion</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="prueba" items="${pruebasCapturadas}" >
            <tr>
                <th>id</th>
                <th scope="row">${prueba.id}</th>
                <td>${prueba.estudiante}</td>
                <td>${prueba.nota}</td>
                <td>${prueba.numeroPreguntas}</td>
                <td>${prueba.duracion}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
