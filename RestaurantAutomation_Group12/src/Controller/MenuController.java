package Controller;

import DBConnection.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;

public class MenuController {
     
    public static ArrayList[] getMenuList()
    {
        Connection conn = DatabaseConnection.getConnection();
        ArrayList[] toReturn = new ArrayList[2];
        for(int c = 0; c < 2; c++)
        {
            toReturn[c] = new ArrayList();
        }
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM Menu");
        try
        {
            while (result.next()) {
                toReturn[0].add(result.getString(1));
                toReturn[1].add(result.getString(2));
            }
        }
        catch (Exception e) {}
        finally{
            DatabaseConnection.closeConnection(conn);
            return toReturn;
        }
    }

    public static String[] updateMenuDetails(int id)
    {
        Connection conn = DatabaseConnection.getConnection();
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM Menu WHERE idMenu='"+id+"'");
        String[] details = new String[3];
        try {
            while (result.next()){
                details[0] = result.getString(3);
                details[1] = result.getString(4);
                details[2] = result.getString(8);
            }
        } catch (Exception ex) {}
        DatabaseConnection.closeConnection(conn);
        return details;
    }
     
    public static int editMenu(int id, String foodName, String price, String description){
        
        int count = DatabaseConnection.executeInsert("UPDATE Menu SET FoodName = '" + foodName
                + "', Price = '" + price
                + "', Description = '" + description
                + "' WHERE idMenu = " + id);
        return count;
    }

   public static int addMenu(String foodName, String price, String description){
        int count = DatabaseConnection.executeInsert("INSERT INTO Menu" 
                +"( FoodName , Price , Description)"
                + " VALUES " 
                + "('" + foodName + "','" + price + "','" 
                + description+ "')");      
        return count;
    }
     
     public static int removeMenu(int id)
     {
         int count = DatabaseConnection.executeInsert("DELETE FROM Menu WHERE idMenu = " + id);
         return count;
     }
}
