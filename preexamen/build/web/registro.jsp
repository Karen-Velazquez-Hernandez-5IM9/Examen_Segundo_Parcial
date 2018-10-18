<%-- 
    Document   : Registro
    Created on : 14-oct-2018, 16:34:26
    Author     : eog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        <h1>Registro de Usuarios</h1>
        <form method="POST" action='RegistroServlet'>
            <BR>
            <BR>
            <center>
                Introduzca su nombre y pulse el bot&oacute;n de enviar<BR>
                <BR>Nombre<input type=text name=Nom>
                <BR>
                <BR>Apellido paterno<input type=text name=Ap>
                <BR>
                <BR>Apellido materno<input type=text name=Am>
                <BR>
                <BR>Nombre de usuario<input type=text name=Usu>
                <BR>
                <BR>Contraseña<input type=password name=Con>
                <BR>
                <BR>Correo electrónico<input type=text name=Cor>
                <BR>
                <BR>Teléfono<input type=text name=Tel>
                <BR>
                <BR>Escuela<input type=text name=Esc>
                <BR>
                <BR>Materia favorita<input type=text name=MFav>
                <BR>
                <BR>Deporte favorito<input type=text name=DFav>
                <BR>
                <BR>Rol (<input type=number name=Rol>
                <BR>
                <BR><input type=submit value="Registrarse">
                <input type=reset value="Borrar">
            </center>
        </form>
    </body>
</html>
