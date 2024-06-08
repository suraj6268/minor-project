/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.UserDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class signInAuthenticator 
{
    public boolean isSignIn(UserDTO user)
    {
        String r_username = user.getR_password();
        String email = user.getEmail();
        String phone = user.getPhone();
        String gender = user.getGender();
        String branch = user.getBranch();
        String p_year = user.getP_year();
        String city = user.getCity();
        String r_password = user.getR_password();
        String c_password = user.getC_password();
        
        if(r_password.equals(c_password))
        {
            try
            {
                Statement st = DBConnector.getStatement();
                String query = "Insert INTO user values('"+email+"','"+r_username+"','"+gender+"','"+branch+"','"+p_year+"','"+city+"','"+r_password+"','"+phone+"')";
                System.out.println("query ="+query);

                int i = st.executeUpdate(query);

                if(i>0)
                {
                    System.out.println(i+"Record Inserted ...");
                    return true;
                }
                
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
        
        return false;
        
    }
}
