<%--
  Created by IntelliJ IDEA.
  User: Camilo
  Date: 27/11/2023
  Time: 06:52 p. m.
  To change this template use File | Settings | File Templates.
--%>
<!-- dashboard.jsp -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
    <!-- Agrega tus estilos y scripts aquí si es necesario -->
    <html>
    <head>
        <title>Registro de Mesas</title>
        <!-- Agrega tus estilos y scripts aquí si es necesario -->
    </head>
    <body>

    <h2>Registro de Mesas</h2>

    <form action="/dashboard" method="post">  <!-- Ajusta la acción según tu lógica -->
        <label>Número de Mesa:</label>
        <input type="text" name="numeroMesa" required>

        <label>Capacidad:</label>
        <input type="text" name="capacidad" required>

        <input type="submit" value="Registrar Mesa">
    </form>

    </body>
    </html>
