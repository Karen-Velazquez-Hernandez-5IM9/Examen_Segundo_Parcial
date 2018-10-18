<%-- 
    Document   : invitado
    Created on : 14-oct-2018, 17:14:25
    Author     : eog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consulta de usuario</h1>
        <form method="post" action="ConsultaServlet">
            <br>
            Nombre <input type="text" name="Nom">
            <br>
            Apellido paterno <input type="text" name="Ap">
            <br>
            Apellido materno <input type="text" name="Am">
            <br>
            <input type="submit" value="Buscar">
        </form>
    </body>
</html>
