<%-- 
    Document   : index
    Created on : 07-oct-2018, 22:39:49
    Author     : eog
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
if(request.getParameter("registro") != null) {
%>
<jsp:forward page="registro.jsp"></jsp:forward>    
<%
  return;
}
else if(request.getParameter("login") != null) {
%>
<jsp:forward page="jsp/login.jsp"></jsp:forward>    
<%
  return;
}
else if(request.getParameter("invitado") != null) {
%>
<jsp:forward page="jsp/invitado.jsp"></jsp:forward>    
<%
  return;
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head><title>Edusite Home</title></head>
  <body>
    <form action="index.jsp">
        <input type="submit" name="registro" value="Crear Cuenta">
        <input type="submit" name="login" value="Iniciar Sesion">
        <input type="submit" name="invitado" value="Consultar usuario">
    </form>
  </body>
</html>