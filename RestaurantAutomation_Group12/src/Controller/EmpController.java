package Controller;

import DBConnection.*;
import java.sql.*;
import java.util.ArrayList;

public class EmpController {

    public static ArrayList<String>[] updateEmployeeList()
    {
        Connection conn = DatabaseConnection.getConnection();
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM Employee");
        ArrayList[] emp = new ArrayList[2];
        emp[0] = new ArrayList();
        emp[1] = new ArrayList();
        try {
            while (result.next()) {
                emp[0].add(result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
                emp[1].add(result.getString(1));
            }
        } catch (Exception ex) {}
        DatabaseConnection.closeConnection(conn);
        return emp;
    }

    public static String[] getEmployee(int id)
    {
        Connection conn = DatabaseConnection.getConnection();
        String[] toReturn = new String[8];
        ResultSet result = DatabaseConnection.executeQuery(conn, "SELECT * FROM Employee WHERE idEmployee = " + id);
        try
        {
            while (result.next()) {
                toReturn[0] = (result.getString(2));
                toReturn[1] = (result.getString(3));
                toReturn[2] = (result.getString(4));
                toReturn[3] = (result.getString(5));
                toReturn[4] = (result.getString(6));
                toReturn[5] = (result.getString(7));
                toReturn[6] = (result.getString(8));
                toReturn[7] = (result.getString(9)); 
            }
        }
        catch (Exception e) {  }
        finally{
            DatabaseConnection.closeConnection(conn);
            return toReturn;
        }
    }

    public static int addEmployee(String fname, String mname, String lname, long SSN, double wage, String username, String password, String type){
        int count = DatabaseConnection.executeInsert("INSERT INTO Employee" 
                +"( FirstName , MiddleInitial , LastName , Wage , Username , Password , SSN , Type )"
                + " VALUES " 
                + "('" + fname + "','" + mname + "','" 
                + lname + "'," + wage + ",'" + username + "','" 
                + password + "'," + SSN + ",'" + type + "')");
        
        return count;
    }

    public static int editEmployee(String fname, String mname, String lname, long SSN, double wage, String username, String password, String type, int id){
        
        int count = DatabaseConnection.executeInsert("UPDATE Employee SET FirstName = '" + fname 
                + "', MiddleInitial = '" + mname
                + "', LastName = '" + lname
                + "', Wage = " + wage
                + ", Username = '" + username
                + "', Password = '" + password
                + "', Type = '" + type
                + "', SSN = " + SSN
                + " WHERE idEmployee = " + id);
        
        return count;
    }
    
    public static int deleteEmployee(int id){
        
        int count = DatabaseConnection.executeInsert("DELETE FROM employee WHERE idEmployee =" +id);       
        return count;
    }    
}
