package org.apache.jsp.Teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import include.DBConnection;

public final class ListStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Teacher/../teacherpageparts/header.jsp");
    _jspx_dependants.add("/Teacher/../teacherpageparts/menu.jsp");
    _jspx_dependants.add("/Teacher/../adminpageparts/footer.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Declaration</title>\n");
      out.write("               <link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onload=\"\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("             <div id=\"header\">\n");
      out.write("                ");
      out.write("\n");
      out.write("<style>\n");
      out.write("   \n");
      out.write("  .button {\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 15px 25px;\n");
      out.write("  font-size: 24px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  text-align: right;\n");
      out.write("  text-decoration: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  box-shadow: 0 9px #999;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {background-color: #3e8e41}\n");
      out.write("\n");
      out.write(".button:active {\n");
      out.write("  background-color: #3e8e41;\n");
      out.write("  box-shadow: 0 5px #666;\n");
      out.write("  transform: translateY(4px);\n");
      out.write("}\n");
      out.write("    </style>\n");
  String uid="";
        try{
        uid=session.getAttribute("firstname").toString(); 
        }catch(NullPointerException e){ 
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/home.jsp \");</script>");
        }
        if(uid.length()==0){ out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");}
 
      out.write("\n");
      out.write("<div>\n");
      out.write("    <div class=\"user_name\" style=\"font-size: 20px;  width:auto;\">\n");
      out.write("    <b>Name    <b style=\"padding-left:20px;\">:");
      out.print(session.getAttribute("firstname"));
      out.write("<br> \n");
      out.write("    <b>DOB    <b style=\"padding-left:25px;\"> :");
      out.print(session.getAttribute("dob"));
      out.write("<br></b>\n");
      out.write("    <b>Address :");
      out.print(session.getAttribute("address"));
      out.write("<br></b>\n");
      out.write("    <b>Contact :");
      out.print(session.getAttribute("contact"));
      out.write("<br></b>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <a href=\"../logout.jsp\" style=\"align:right\">Logout</a>\n");
      out.write("   \n");
      out.write("</div>");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"../logout.jsp\">Logout</a>\n");
      out.write(" </div>\n");
      out.write("            <div id=\"content\">\n");

    DBConnection db=new DBConnection();
 
      out.write("\n");
      out.write("\n");
      out.write("    <h1><legend>Student Details</legend> </h1> \n");
      out.write("    <b>Here  is your class \"");
      out.print(session.getAttribute("class"));
      out.write("\" Student List </b>\n");
      out.write("\n");
      out.write("<fieldset>\n");
      out.write("    <div>\n");
      out.write("       </div><br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("           \n");
      out.write("            <tr>\n");
      out.write("            <th>S.N</th>\n");
      out.write("            <th>Student Id</th>\n");
      out.write("            <th>First Name</th>\n");
      out.write("            <th>Last Name</th>\n");
      out.write("            <th>Gender</th>\n");
      out.write("            <th>Date of Birth</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Address</th>\n");
      out.write("            <th>Contact</th>\n");
      out.write("            <th>Father Name</th>\n");
      out.write("            <th>Father Contact Number</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("     ");

        String sqlQuery="";
        try{  
           String Class="",section="";
           Class=session.getAttribute("class").toString();
           
            sqlQuery="Select * from student where class='"+Class+"'";  
            session.setAttribute("section",db.rs.getString(12));
            session.setAttribute("class",db.rs.getString(13));
    
            db.st.executeQuery(sqlQuery);
          //  out.print(sql);
            db.rs=db.st.executeQuery(sqlQuery);
    for(int i=1;db.rs.next();i++)
    {
    out.print("<tr><td>"+i+"</td><td>"+db.rs.getString(2)+"</td><td>"+db.rs.getString(3)+"</td><td>"+db.rs.getString(4)+"</td>" 
         + "<td>"+db.rs.getString(8)+"</td><td>"+db.rs.getString(6)+"</td><td>"+db.rs.getString(7)+"</td><td>"+db.rs.getString(5)
            +"</td><td>"+db.rs.getString(9)+"</td><td>"+db.rs.getString(10)+"</td><td>"+db.rs.getString(11)+"</td><td> <a href='AddRating.jsp?Action=Edit&id=" + db.rs.getString(1) + "'>Rate</a></td></tr>");
           session.setAttribute("id", db.rs.getString(1));
           session.setAttribute("firstname", db.rs.getString(2));
           
    
    }
   }catch(Exception e){}
  
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("  </fieldset> \n");
      out.write(" </div>\n");
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
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
