/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cecyt9.ipn.edusite.utils;

/**
 *
 * @author eog
 */
import java.sql.*;
import java.util.ArrayList;
public class Conexion {
    String url;
    String User;
    String Pass;
    Connection con;
    Statement sta;
    ResultSet res;
    
    public Conexion(){
        url="jdbc:mysql://localhost/examen";
        User="root";
        Pass="n0m3l0";
    }
    
    public String Con(String nombre, String contra){
        String ok="No";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where usua='"+nombre+"' and contra='"+contra+"';");
            if(res.next()){
                ok="Oka";
            }
            else{
                ok="Falso";
            }
        }
        
        catch(Exception e){
            ok=e.getMessage();
            System.out.println(e.getMessage());
        }
         
        return ok;
    }
    
    public String Insert(String Usu,String Contra, String Cor, String Nom, String Ap, String Am, String tel, String esc, String mFav, String dFav, String rol){
        String ok="No funciona esta cosa";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            sta.executeUpdate("insert into Usuario values('"+Usu+"','"+Contra+"','"+Cor+"','"+Nom+"','"+Ap+"','"+Am+"','"+tel+"','"+esc+"','"+mFav+"','"+dFav+"','"+rol+"');");
            ok="Usuario Dado de alta";
        }
        
        catch(Exception e){
            ok=e.getMessage();
            System.out.println(e.getMessage());
        }
        return ok;
    }
    
    public String Consulta(String Nom, String Ap, String Am){
        String Rol="No hay rol";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, User, Pass);
            sta=con.createStatement();
            
            res=sta.executeQuery("select * from Usuario where Nom='"+Nom+"' and ApeP='"+Ap+"' and ApeM='"+Am+"';");
            if(res.next()){
                String usuario = res.getString("usua");
                Rol="La persona es: \n" +
                        Nom+ " \n" + 
                        Ap+ " \n" + 
                        Am+ " \n" + 
                        usuario + " \n";
            }
            else
                Rol="Persona no encontrada";
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
         
        return Rol;
    }
}
