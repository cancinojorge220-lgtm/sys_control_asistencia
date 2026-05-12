/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author alvar
 */
public class BDConexion {
    
    //atributos de la cadena de conexion
    String base = "bd_logistica_norte";
    String url="jdbc:mysql://localhost:3306/" + base;
    String user="root";
    String pass="root";
    
    //atributos de los objetos de conexion.
    private Connection cnx;

    // Método para conectar
    public Connection ConectarBD() {

        try {
            cnx = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");

        } catch (SQLException e) {
            System.out.println("Error de conexión");
            e.printStackTrace();
        }

        return cnx;
    }

    // Getter
    public Connection getCnx() {
        return cnx;
    }

}
