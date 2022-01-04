package project;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author bedirhan
 */
public class ConnectionProvider {
   
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kres","root","1234");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
