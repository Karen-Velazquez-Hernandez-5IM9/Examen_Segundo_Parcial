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
 * @author eog
 */
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Conexion cone= new Conexion();
        
        String nombre=request.getParameter("Nom");
        String apellidoPaterno= request.getParameter("Ap");
        String apellidoMaterno= request.getParameter("Am");
        String telefono=request.getParameter("Tel");
        String correo=request.getParameter("Cor");
        String escuela=request.getParameter("Esc");
        String materiaFavorita=request.getParameter("MFav");
        String deporteFavorito=request.getParameter("DFav");
        String rol=request.getParameter("Rol");
        String usuario= request.getParameter("Usu");
        String contraseña=request.getParameter("Con");
        
        PrintWriter out = response.getWriter();
        out.println("<h1>"+cone.Insert(usuario, contraseña, correo, nombre, apellidoPaterno, apellidoMaterno, telefono,escuela,materiaFavorita,deporteFavorito,rol)+"</h1>");
        
        response.sendRedirect("/preexamen/index.jsp");
        
    }
}