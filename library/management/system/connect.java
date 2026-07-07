
package library.management.system;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


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
