package factory;

/**
 *
 * @author rafael
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/bd_exemplo","root","051968");
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}
