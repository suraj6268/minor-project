package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>ALUMNUS-PROFILE</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap 5 CSS file -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("        integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("        integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("    <!--Swippers CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\" rel=\"stylesheet\" />\n");
      out.write("    <!-- MDB -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/5.0.0/mdb.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- CUSTOM CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"profile.css\">\n");
      out.write("    <!-- CUSTOM CSS END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body class=\"main\">\n");
      out.write("\n");
      out.write("    <!-- nav section start -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <header class=\"top \">\n");
      out.write("\n");
      out.write("        <div class=\"container \">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2 logo\">\n");
      out.write("                    <h1 id=\"logo\">ALUMNUS</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 \">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-2 sign\">\n");
      out.write("                    YOUR PROFILE\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"header-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"container header-container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-8 nav-item\">\n");
      out.write("                    <li><a href=\"index.jsp\" class=\"active\">Home</a></li>\n");
      out.write("                    <li><a href=\"#\">Students</a></li>\n");
      out.write("                    <li><a href=\"home.jsp\">Alumni</a></li>\n");
      out.write("                    <li><a href=\"#\">Careers</a></li>\n");
      out.write("                    <li><a href=\"#\">Events & Notice</a></li>\n");
      out.write("                    <li><a href=\"contact.html\">Contact us</a></li>\n");
      out.write("                    <li><a href=\"#about-us\">About us</a></li>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-2 nav-search\">\n");
      out.write("                    <input type=\"text\" name=\"search\" id=\"search\" placeholder=\"search\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- navbar end -->\n");
      out.write("\n");
      out.write("    <!-- alumni profile section start -->\n");
      out.write("\n");
      out.write("    <section class=\"profile-section\">\n");

            String username = (String)session.getAttribute("username");
            String email = (String)session.getAttribute("email");
            String branch = (String)session.getAttribute("branch");
            String p_year = (String)session.getAttribute("p_year");
            String city = (String)session.getAttribute("city");
            
            System.out.println(username);
            if(username==null)
            {
                response.sendRedirect("login.html");
            }

      out.write("\n");
      out.write("        <div class=\"member-profile\">\n");
      out.write("            <h1>Member Profile</h1>\n");
      out.write("            <img src=\"shail_group.png\" alt=\"\">\n");
      out.write("            <p class=\"member-name\"><h3>");
      out.print(username);
      out.write("</h3></p>\n");
      out.write("            <p class=\"member-email\">");
      out.print(email);
      out.write("</p>\n");
      out.write("            <p class=\"about-member\"></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr width=\"75%\" size=\"5\">\n");
      out.write("\n");
      out.write("        <div class=\"other-information-section\">\n");
      out.write("\n");
      out.write("            <div  class=\"about-section\">\n");
      out.write("                 <p>Branch</p>\n");
      out.write("                <p>");
      out.print(branch);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("                <hr class=\"h-row\"  size=\"5\">\n");
      out.write("            \n");
      out.write("            <div class=\"about-section\">\n");
      out.write("                <p>Graduation year</p>\n");
      out.write("                <p>");
      out.print(city);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("                <hr class=\"h-row\" size=\"5\">\n");
      out.write("\n");
      out.write("            <div class=\"about-section\">\n");
      out.write("                \n");
      out.write("                <p>Location</p>\n");
      out.write("                <p>");
      out.print(branch);
      out.write("</p>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("                <hr class=\"h-row\" size=\"5\">\n");
      out.write("\n");
      out.write("            <div class=\"about-section\">\n");
      out.write("                <p>Skills</p>\n");
      out.write("                <p>c,c++,java</p>\n");
      out.write("            </div>\n");
      out.write("                <hr class=\"h-row\" size=\"5\">\n");
      out.write("            \n");
      out.write("            <div class=\"about-section\">\n");
      out.write("                <p>Language</p>\n");
      out.write("                <p>English</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- alumni profile section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- footer section  -->\n");
      out.write("       <footer>\n");
      out.write("   \n");
      out.write("        <div class=\"footer-section\">\n");
      out.write("            <div class=\"about-institute-section\">\n");
      out.write("                <img src=\"image/iist logo.jpg\" alt=\"\">\n");
      out.write("                <p class=\"about\">Indore Institute of Science and Technology, Indore was established 2003. IIST is recognized as a leading institute in the state of Madhya Pradesh.</p>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"useful-links\">\n");
      out.write("                <h2>UseFul links</h2>\n");
      out.write("                <div class=\"nav-links\">\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">HOME</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">ALUMNI</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">NEWS&EVENT</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">COMITEE</a></li>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"about useful-links\">\n");
      out.write("                <h2>about</h2>\n");
      out.write("                <div class=\"nav-links\">\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">SEARCH</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">SEARCH</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">JOb-POST</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">Contact</a></li>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"social-media\">\n");
      out.write("                <div class=\"Login-dashboard\">\n");
      out.write("                    login Dashboard\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                    <div class=\"social-handels\">\n");
      out.write("                        <i class=\"fa-brands fa-facebook\" class=\"icons\"></i>\n");
      out.write("                        <i class=\"fa-brands fa-instagram\" class=\"icons\"></i>\n");
      out.write("                        <i class=\"fa-brands fa-twitter\" class=\"icons\"></i>\n");
      out.write("                        <i class=\"fa-brands fa-linkedin\" class=\"icons\"></i>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("     \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <hr class=\"footer-row\"/>\n");
      out.write("\n");
      out.write("    <p class=\"copyright\">© 2022 IIST Alumni / All rights reserved</p>\n");
      out.write("\n");
      out.write("    <div class=\"end\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- footer section end  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--Bootstrap JS CND-->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
