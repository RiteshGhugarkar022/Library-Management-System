/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class connect {

    public static Connection Connection() {
        Connection con=null;
        
        try {
             con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/lms database","postgres","RG123");
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
}
