package Controller;

import DBConnection.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class OrderManagerController {

    public static String[] updateMenuDetail(String FoodName)
    {
        Connection conn = DatabaseConnection.getConnection();
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM Menu WHERE FoodName='"+FoodName+"'");
        String[] detail = new String[2];
        try {
            while (result.next()){
                detail[0] = result.getString(3);
                detail[1] = result.getString(4);
            }
        } catch (Exception ex) {}
        DatabaseConnection.closeConnection(conn);
        return detail;
    }

    public static String[] updateOrderList(javax.swing.JList orderIdList)
    {
        DefaultListModel guiIdList = (DefaultListModel)orderIdList.getModel();
        Connection conn = DatabaseConnection.getConnection();
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT Status FROM Orders WHERE "
                + "idOrder >= " + Integer.parseInt(guiIdList.firstElement().toString()) + " AND "
                + "idOrder <= " + Integer.parseInt(guiIdList.lastElement().toString()));
        String[] orders = new String[50];
        int i = 0;
        try
        {
            while (result.next()) {
                orders[i] = result.getString(4) + " - " + result.getString(2);
                i++;
            }
        } catch (Exception ex) {}
        DatabaseConnection.closeConnection(conn);
        return orders;
    }
    
    public static boolean submitOrder(Object[] orders, javax.swing.JList idList, Integer id)
    {
        DefaultListModel idModel = (DefaultListModel)idList.getModel();
        try
        {
            if ( orders.length != 0 ) 
            {
                int i = 0;
                while ( orders.length != i )  
                {
                    DatabaseConnection.executeInsert("INSERT INTO Orders ( Name , Status , quantity, idEmployee )"
                            + " VALUES ('" + orders[i].toString().substring(4) + "'," + 0 + ","
                            + Integer.parseInt(orders[i].toString().substring(0, 1)) + "," + id + ")");
                    
                    Connection conn = DatabaseConnection.getConnection();
                    ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM Orders");
                    while (result.next())
                    {
                        if ( result.isLast() )                        
                            idModel.addElement(result.getString(1));
                    }
                    i++;
                }
            }
        }
        catch(Exception e){return false;}
        return true;
    }
    

    public static boolean cancelOrder (javax.swing.JList OrderedList, javax.swing.JList orderIdList)
    {
        try
        {
            DefaultListModel guiIdList = (DefaultListModel)orderIdList.getModel();
            List id = OrderedList.getSelectedValuesList();
            Connection conn = DatabaseConnection.getConnection();
            ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT Status FROM Orders WHERE "
                    + "idOrder >= " + Integer.parseInt(guiIdList.firstElement().toString()) + " AND "
                    + "idOrder <= " + Integer.parseInt(guiIdList.lastElement().toString()));
            while (result.next())
            {
                if ( result.getString(1).equalsIgnoreCase("Starting") == false )
                {
                    int i = 0;
                    while( id.isEmpty() != true )
                    {
                        DatabaseConnection.executeInsert("DELETE FROM Orders WHERE"
                                + " idOrder = " + Integer.parseInt(guiIdList.get(i).toString()));
                        id.remove(0);
                        i++;
                    }
                }
            }
        }
        catch(Exception e){e.printStackTrace();return false;}
        
        return true;
    }

    public static boolean updateQuantity (javax.swing.JList OrderedList, String menuItem, int qty, String change)
    {
        DefaultListModel orderModel = (DefaultListModel)OrderedList.getModel();
        try
        {
            if ( change.equalsIgnoreCase("Select Quantity") )
                orderModel.addElement(qty + " - " + menuItem);
            else if ( change.equalsIgnoreCase("Change Quantity") )
            {
                String replaceOrder = qty + " - " + OrderedList.getSelectedValue().toString().substring(4);
                orderModel.setElementAt(replaceOrder, orderModel.indexOf(OrderedList.getSelectedValue()));
            }
        }
        catch(Exception e){return false;}
        
        return true;
    }
    
    public static ArrayList[] getOrderList()
    {
        Connection conn = DatabaseConnection.getConnection();
        ArrayList[] toReturn = new ArrayList[6];
        for(int c = 0; c < 6; c++)
        {
            toReturn[c] = new ArrayList();
        }
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM Menu");
        try
        {
            while (result.next()) {
                toReturn[0].add(result.getString(1));
                toReturn[1].add(result.getString(2));
                toReturn[2].add(result.getString(3));
                toReturn[3].add(result.getString(4));
                toReturn[4].add(result.getString(6));
                toReturn[5].add(result.getString(7));
                toReturn[6].add(result.getString(8));
                
            }
        }
        catch (Exception e) {  }
        finally{
            DatabaseConnection.closeConnection(conn);
            return toReturn;
        }
    }
    
    public static ArrayList getOrders()
    {
        Connection conn = DatabaseConnection.getConnection();
        ArrayList toReturn = new ArrayList();
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM orders");
        try
        {
            while (result.next()) {
                ArrayList temp = new ArrayList();
                String status = result.getString(3);
                switch (status) {
                    case "0":
                        temp.add("Pending");
                        break;
                    case "1":
                        temp.add("Preparing");
                        break;
                    case "2":
                        temp.add("Cooking");
                        break;
                    case "3":
                        temp.add("Done");
                        break;
                }
                
                temp.add(result.getString(5)); 
                temp.add(result.getString(2)); 
                temp.add(result.getString(4)); 
                temp.add(result.getString(5)); 
                toReturn.add(temp);
            }
        }
        catch (Exception e) {}
        finally{
            DatabaseConnection.closeConnection(conn);
            return toReturn;
        }
    }

    public static int updateStatus(int id, int status)
    {
        try {
            Connection conn = DatabaseConnection.openConnection();
        } catch (Exception ex) {}
        int count = DatabaseConnection.executeInsert("UPDATE Orders SET Status = " + status
                    + " WHERE idOrder = " + id);
        return count;
    }
}
