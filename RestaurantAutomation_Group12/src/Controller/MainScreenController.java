package Controller;
import DBConnection.*;
import java.sql.*;

public class MainScreenController {

    public static String[] authenticateUser(String user, String pass)
    {
        Connection conn = DatabaseConnection.getConnection();
        String [] toReturn = new String[2];
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT Type,idEmployee FROM Employee WHERE Username = '" + user + "' AND Password = '" + pass + "'");
        try {
            while (result.next()) {
                toReturn[0] = result.getString(1);
                toReturn[1] = result.getString(2);
            }
            
        } catch (Exception ex) {}
        finally{
            DatabaseConnection.closeConnection(conn);
            return toReturn;
        }
    }
}
