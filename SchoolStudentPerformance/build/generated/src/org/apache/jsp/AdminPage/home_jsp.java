package org.apache.jsp.AdminPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/AdminPage/../adminpageparts/header.jsp");
    _jspx_dependants.add("/AdminPage/../adminpageparts/menu.jsp");
    _jspx_dependants.add("/AdminPage/../adminpageparts/footer.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>School Management System</title>\n");
      out.write("               <link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write(" <style>\n");
      out.write("     body{\n");
      out.write("         margin: 0;\n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     #mix{\n");
      out.write("         height:1000px;\n");
      out.write("         width:100%;\n");
      out.write("        \n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     #menu\n");
      out.write("     {\n");
      out.write("         height:auto;\n");
      out.write("         width:15%;\n");
      out.write("         text-align: left;\n");
      out.write("     }\n");
      out.write("     #content{\n");
      out.write("         width:83%;\n");
      out.write("         height:auto;\n");
      out.write("         text-align:center;\n");
      out.write("         float:left;\n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     \n");
      out.write(" </style>\n");
      out.write("    <body onload=\"\">\n");
      out.write("        \n");
      out.write("            <div id=\"header\">\n");
      out.write("                ");
  String uid="";
        try{
        uid=session.getAttribute("Email").toString();
       
        }catch(NullPointerException e){ 
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/home.jsp \");</script>");
        }
        if(uid.length()==0){ out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");}
 
      out.write("\n");
      out.write(" <div>\n");
      out.write("\n");
      out.write("<div class=\"right_heading\">\n");
      out.write("    <h1>Adminstration Page</h1>\n");
      out.write("</div>\n");
      out.write("     <div class=\"user_name\">\n");
      out.write("    <br/>\n");
      out.write("    <b>You are login As\"");
      out.print(session.getAttribute("Email"));
      out.write("\"</b>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"mix\">\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 15%;\n");
      out.write("  background-color:#003153;;\n");
      out.write("  position: absolute;\n");
      out.write("  height: 1001px;\n");
      out.write("  overflow: auto;\n");
      out.write("  float:left;\n");
      out.write("  color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  padding: 8px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #555;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("  <li><a href=\"../AdminPage/home.jsp\">Home</a></li>\n");
      out.write("  <li><a href=\"../AdminPage/AddStudent.jsp\">Add Student</a></li>\n");
      out.write("  <li><a href=\"../AdminPage/AddTeacher.jsp\">Add Staff</a></li>\n");
      out.write("   <li><a href=\"../AdminPage/Admin.jsp\">Add User</a></li>\n");
      out.write("  <li><a href=\"../AdminPage/listTeacher.jsp\">List Staff</a></li>\n");
      out.write("  <li><a href=\"../AdminPage/liststudent.jsp\">List Student</a></li>\n");
      out.write("  <li><a href=\"../logout.jsp\">Logout</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content\" style=\"padding:1px 16px;height:1000px;\">\n");
      out.write("             <h1>School Management System</h1>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                ");
      out.write("<style>\n");
      out.write(".footer-link\n");
      out.write("{\n");
      out.write("    text-align:center;\n");
      out.write("    font-size:30px;\n");
      out.write("}    \n");
      out.write("</style>\n");
      out.write("<span class=\"footer-link\">\n");
      out.write("    All rights are Reserved     \n");
      out.write("</span>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  ");
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
