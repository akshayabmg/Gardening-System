package Controller;
import DBConnection.*;
import java.sql.*;
import java.util.ArrayList;

public class TableStatusController {

    public static ArrayList[] getTables()
    {
        Connection conn = DatabaseConnection.getConnection();
        ArrayList[] toReturn = new ArrayList[4];
        for(int c = 0; c < 4; c++)
        {
            toReturn[c] = new ArrayList();
        }
        ResultSet result = DatabaseConnection.executeQuery (conn, "SELECT * FROM Tables");

        try {
            
            while (result.next()) {
                toReturn[0].add(result.getString(1));
                toReturn[1].add(result.getString(2));
            }
            
        } catch (Exception e) {}
        finally{
            DatabaseConnection.closeConnection(conn);
            return toReturn;
        }
    }
    
    public static int updateStatus(int tableID, String status)
    {
        int count = DatabaseConnection.executeInsert("UPDATE Tables SET status = '" + status
                + "' WHERE idTable = " + tableID);
        
        return count;
    }

}
