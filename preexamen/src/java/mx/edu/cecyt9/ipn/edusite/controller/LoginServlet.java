/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cecyt9.ipn.edusite.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mx.edu.cecyt9.ipn.edusite.utils.Conexion;

/**
 *
 * @author eog
 */
public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usu;
        String pass;

        //recuperamos los datos del formulario
        usu = request.getParameter("USER");
        pass = request.getParameter("PASSWORD");

        HttpSession sesion = request.getSession();
        sesion.setAttribute("claveSesion", usu + pass);
        sesion.setAttribute("Usuario", usu);
        sesion.setAttribute("Contra", pass);

        response.setContentType("text/html");
        String titulo = null;

        Conexion cone = new Conexion();

        //Pedimos el atributo, y verificamos si existe
        String claveSesion = (String) sesion.getAttribute("claveSesion");
        String user = (String) sesion.getAttribute("Usuario");
        String contra = (String) sesion.getAttribute("Contra");
        
        RequestDispatcher rdObj = null;

        if (cone.Con(user, contra).equals("Oka")) {
            PrintWriter out = response.getWriter();
            out.println("Cuenta Valida");
            out.println("<br>");
            request.getSession().setAttribute("Usuario", user);
            
            if (cone.Con(usu, pass).equals("Oka")) {
                String Rol = "No";
                if (cone.Rol(usu, pass).equals("No hay rol")) {
                    Rol = "No";
                } else {
                    Rol = cone.Rol(usu, pass);
                    sesion.setAttribute("Rol", Rol);
                    
                    if(Rol.equals("1"))
                        response.sendRedirect("/preexamen/jsp/profesor.jsp");
                    else{
                        if(Rol.equals("2"))
                            response.sendRedirect("/preexamen/jsp/alumno.jsp");
                        else
                            response.sendRedirect("/preexamen/jsp/invitado.jsp");
                    }
                        
                        
                }
            }

        } else {
            rdObj=request.getRequestDispatcher("registro.jsp");
            rdObj.include(request, response);
        }
        
        
            
        cone.Con(titulo, claveSesion);
    }
}
