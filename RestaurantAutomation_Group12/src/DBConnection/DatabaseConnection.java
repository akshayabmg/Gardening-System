package DBConnection;
import java.sql.*;

public class DatabaseConnection {
    
    public static Connection openConnection()
    {   
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/group12", "root", "password");
            return conn;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static ResultSet executeQuery(Connection conn, String query)
    {
        ResultSet result = null;
        try
        {
            Statement s = conn.createStatement();
            result = s.executeQuery (query); 
        }
        catch (Exception e) { e.printStackTrace(); }
        finally{
            return result;
        } 
    }
    
    public static int executeInsert(String query)
    {
        Connection conn = openConnection();
        int count = 0;
        try
        {
            Statement s = conn.createStatement();
            count = s.executeUpdate(query); 
        }
        catch (Exception e) { e.printStackTrace(); }
        finally{
            closeConnection(conn);
            return count;
        }
    }

    public static Connection closeConnectionHelper(Connection conn)
    {
        if (conn != null)
        {
            try
            {
                conn.close ();
            }
            catch (Exception e) {}
        }
        return conn;
    }
    
    public static Connection getConnection()
    {
        try
        {
            return DatabaseConnectionFetch.aquireConnection();
        }
        catch (Exception e) {}
        return null;
    }
    
    public static boolean closeConnection(Connection conn)
    {
        if (conn != null)
        {
            try
            {
                 DatabaseConnectionFetch.releaseConnection(conn);
            }
            catch (Exception e) {return false;}
        }
        return true;
    }
}