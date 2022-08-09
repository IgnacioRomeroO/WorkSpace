<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 07-07-2022
  Time: 20:23
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

    <title>registroPrueba</title>
</head>
<body>
<div class="bg-success p-2 text-dark bg-opacity-10 border border-primary">
    <%--@elvariable id="prueba" type="java"--%>
    <form:form action="/prueba/guardar" method="post" modelAttribute="prueba">
        <h1>Ingrese datos de su evaluación.</h1>
        <br>
        <form:label path="estudiante" >Estudiante: </form:label>
        <br>
        <form:input path="estudiante"/>
        <br>
        <form:label path="nota">Nota: </form:label>
        <br>
        <form:input type="number" path="nota"/>
        <br>
        <form:label path="numeroPreguntas">Numero de Preguntas: </form:label>
        <br>
        <form:input type="number" path="numeroPreguntas"/>
        <br>
        <form:label path="duracion">Duración: </form:label>
        <br>
        <form:input path="duracion"/>
        <br>
        <br>
        <button type="submit" class="btn btn-primary" text-center>Registrar</button>
    </form:form>
</div>
</body>
</html>
