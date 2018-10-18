/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cecyt9.ipn.edusite.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.cecyt9.ipn.edusite.utils.Conexion;

/**
 *
 * @author Alumno
 */
public class ConsultaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Nombre = request.getParameter("Nom");
        String ApeP = request.getParameter("Ap");
        String ApeM = request.getParameter("Am");
        
        Conexion cone= new Conexion();
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Consulta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" +cone.Consulta(Nombre, ApeP, ApeM) +"</h1>");
            out.println("<a href=\"/preexamen/index.jsp\">Regresar al inicio</a><br>");
            out.println("</body>");
            out.println("</html>");
        
        
    }
}