
package javaapplicationypareo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProfDAO extends DAO<Prof>
{
    public Prof find(long idProf)
    {
        //...
        return new Prof();
    }
    
    public Prof create(Prof prof)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/baseYpareo";// + this.baseYPareo + "";
            Connection conn = DriverManager.getConnection(url, user, mdp);
            String rqsql = "INSERT INTO APP.PROFESSEURS(nom) VALUES (?)";
            PreparedStatement instruction = (PreparedStatement) conn.prepareStatement(rqsql);
            instruction.setString(1, prof.getNomProf());
            instruction.executeUpdate();
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Driver non trouvé!");
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //statement insert
        return null;
        //return prof;
    }
    
    public Prof update(Prof prof)
    {
            //...
    return prof;
    }
    
    public void delete(Prof prof)
    {
        //...
    }    
}