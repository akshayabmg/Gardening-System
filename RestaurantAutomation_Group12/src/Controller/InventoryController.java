
package Controller;

import DBConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InventoryController {
    public static ArrayList[] getInventoryList()
    {
        Connection conn = DatabaseConnection.getConnection();
        ArrayList[] toReturn = new ArrayList[3];
        for(int c = 0; c < 3; c++)
        {
            toReturn[c] = new ArrayList();
        }
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM Inventory");
        try
        {
            while (result.next()) {
                toReturn[0].add(result.getString(1));
                toReturn[1].add(result.getString(2));
                toReturn[2].add(result.getString(3));
            }
        }
        catch (Exception e) {  }
        finally{
            DatabaseConnection.closeConnection(conn);
            return toReturn;
        }
    }
    
    public static int editInventory(int id, String stock){
        
        int count = DatabaseConnection.executeInsert("UPDATE Inventory SET Stock = " + Integer.parseInt(stock)
                + " WHERE idInventory = " + id);
        return count;
    }
    
    public static int removeInventory(int id){
         int count = DatabaseConnection.executeInsert("DELETE FROM Inventory WHERE idInventory = " + id);
         return count;
     }
    
    public static int addInventory(String inventoryName, String inventoryAmount){
        int count = DatabaseConnection.executeInsert("INSERT INTO Inventory" 
                +"( Name , Stock )"
                + " VALUES " 
                + "('" + inventoryName + "'," + inventoryAmount + ")");
        
        return count;
    }
}
