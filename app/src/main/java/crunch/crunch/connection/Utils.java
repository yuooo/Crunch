package crunch.crunch.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jmgkal on 27/09/15.
 */
public class Utils {
    public static Connection connectToDB(){
        try {
            return DriverManager.getConnection("jdbc:mysql://104.236.206.190/crunch?user=surbhi&password=sirbeegoal");
        } catch (SQLException e) {
            System.err.println(e.toString());
            throw new RuntimeException(e);
        }
    }
    
}
