package javaapplicationypareo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carole
 */
public class DriveManager
{
    public void getConnection()
    {
        Connection conn = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/baseYpareo";
            conn = DriverManager.getConnection(url, "user", "mdp");
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Driver non trouvé!");
            e.printStackTrace();
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
        }
        finally
        {
            if(conn != null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}