package controller;


import dto.UserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.signInAuthenticator;



/**
 *
 * @author Dell
 */
public class signInChecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("sign.html");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String r_username = request.getParameter("r_username");
        //System.out.println(r_username);
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        String branch = request.getParameter("branch");
        String p_year = request.getParameter("p_year");
        String city = request.getParameter("city");
        String r_password = request.getParameter("r_password");
        String c_password = request.getParameter("c_password");
        
        UserDTO user = new UserDTO();
        user.setR_username(r_username);
        user.setEmail(email);
        user.setPhone(phone);
        user.setGender(gender);
        user.setBranch(branch);
        user.setP_year(p_year);
        user.setCity(city);
        user.setR_password(r_password);
        user.setC_password(c_password);
        
        signInAuthenticator authenticator = new signInAuthenticator();
        boolean signin = authenticator.isSignIn(user);
        
        if(signin)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", r_username);
            session.setAttribute("email", email);
            session.setAttribute("branch", branch);
            session.setAttribute("p_year", p_year);
            session.setAttribute("city", city);
            response.sendRedirect("profile.jsp");
        }
        else
        {
            response.sendRedirect("sign.html");
        }
                
        
    }
}
