
package model;

import db.DBConnector;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class LoginAuthenticator 
{
    public boolean isLogin(UserDTO user)
    {
        String username = user.getUsername();
        String password = user.getPassword();
        String tablePassword ="";
        String tableUser ="";
        String branch ="";
        String p_year ="";
        String city ="";
        
        try
        {
            Statement st = DBConnector.getStatement();
            String query = "SELECT userPassword, userName,branch,passingYear,userCIty FROM user WHERE userId = '"+username+"'";
            System.out.println("Query = "+query);
            
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                tablePassword = rs.getString(1);
                tableUser = rs.getString(2);
                branch = rs.getString(3);
                p_year = rs.getString(4);
                city = rs.getString(5);
                
                user.setTableUser(tableUser);
                user.setBranch(branch);
                user.setP_year(p_year);
                user.setCity(city);
                
                //System.out.println(tableUser);
            }
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablePassword))
        {
            return true;
        }
        return false;
    }
}
