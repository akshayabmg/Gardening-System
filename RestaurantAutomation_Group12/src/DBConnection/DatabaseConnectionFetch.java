
package DBConnection;

import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseConnectionFetch {
    
    private static ArrayList<java.sql.Connection>  connections = new ArrayList();
    
    public DatabaseConnectionFetch getInstance()
    {
        return this;
    }
    
    public static java.sql.Connection aquireConnection() throws SQLException
    {
        for(java.sql.Connection conn:connections)
        {
            if(conn.isClosed())
            {
                conn = DatabaseConnection.openConnection();
                return conn;
            }
        }
        java.sql.Connection conn = DatabaseConnection.openConnection();
        connections.add(conn);
        return conn;
    }
    
    public static void releaseConnection(java.sql.Connection reusable)
    {
        int index = connections.indexOf(reusable);
        reusable = DatabaseConnection.closeConnectionHelper(reusable);
        connections.set(index, reusable);
    }
}
