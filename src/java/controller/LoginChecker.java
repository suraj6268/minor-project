
package controller;

import dto.UserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;


/**
 *
 * @author Dell
 */
public class LoginChecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("login.html");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        UserDTO user = new UserDTO();
        user.setUsername(username);
        user.setPassword(password);
        
        LoginAuthenticator authenticator = new LoginAuthenticator();
        boolean login = authenticator.isLogin(user);
        
        
        if(login)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", user.getTableUser());
            session.setAttribute("email", username);
            session.setAttribute("branch", user.getBranch());
            session.setAttribute("p_year", user.getP_year());
            session.setAttribute("city", user.getCity());
             
            response.sendRedirect("profile.jsp");
        }
        else
        {
            response.sendRedirect("login.html");
        }
    }
}
