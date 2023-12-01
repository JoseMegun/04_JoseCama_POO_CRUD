package config;

import java.sql.Connection;
import java.sql.DriverManager;
import vista.Principal;

/**
 *
 * @author jose_
 */
public class Conexion {
    
    public static void main(String[] args){
        Principal objetoformulario = new Principal();
        objetoformulario.setVisible(true);
    }
    
    Connection con;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/S17?characterEncoding=UTF-8", "root", "jmegun23");
        } catch (Exception e) {
            System.out.println("ERROR CONEXION " + e);
        }
        
    }
    
    public Connection getConnection() {
        return con;
    }
    
}
