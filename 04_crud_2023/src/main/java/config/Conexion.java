
package config;

import java.sql.DriverManager;
import java.sql.Connection;
import vistas.principal;

/**
 *
 * @author jose_
 */
public class Conexion {
    
    public static void main(String[] args){
        principal objetoformulario = new principal();
        objetoformulario.setVisible(true);
    }
    
    Connection con;
    
    // Parámetros de conexión a la base de datos
    String url = "jdbc:mysql://localhost:3306/demo1?characterEncoding=UTF-8";
    String usuario = "root";
    String contraseña = "jmegun23";
    
    public Conexion() {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            System.out.println("Error Conexion" + e);
        }
    }
    
    public Connection getConnection() {
        return con;
    }
}
