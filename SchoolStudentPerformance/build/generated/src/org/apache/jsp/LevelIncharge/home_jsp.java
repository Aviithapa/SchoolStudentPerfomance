package org.apache.jsp.LevelIncharge;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import include.DBConnection;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/LevelIncharge/../adminpageparts/footer.jsp");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>School Management System</title>\n");
      out.write("   \n");
      out.write("        <link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("  $(\"button\").click(function(){\n");
      out.write("    $(\"dis\").toggle();\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("           \n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 15%;\n");
      out.write("  position: absolute;\n");
      out.write("  height: auto;\n");
      out.write("  overflow: auto;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  padding: 8px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  color:blue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #555;\n");
      out.write("\n");
      out.write("}\n");
      out.write("ul li ul\n");
      out.write("{\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 15%;\n");
      out.write("  position: absolute;\n");
      out.write("  height: auto;\n");
      out.write("  overflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" ul li ul li\n");
      out.write("{\n");
      out.write("\tfloat: none;\n");
      out.write("\tmargin: 10px 0 0 -40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" ul li ul li a \n");
      out.write("{\n");
      out.write("\twidth: 100px;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin: 10px 0 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul li:hover> ul\n");
      out.write("{\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    <body onload=\"\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                ");
  String uid="";
        try{
        uid=session.getAttribute("Email").toString();
       
        }catch(NullPointerException e){ 
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");
        }
        if(uid.length()==0){ out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");}
 
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"right_heading\">\n");
      out.write("    <h1>Level Incharge</h1>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("            </div>  \n");
      out.write(" <div id=\"menu\">\n");
      out.write("                   <ul>\n");
      out.write("                  \n");
      out.write("                  <li><a href=\"../logout.jsp\">Logout</a></li>\n");
      out.write("                 </ul> </div>\n");
      out.write("            <div id=\"contents\">\n");
      out.write("                \n");
      out.write("            ");

      DBConnection db=new DBConnection();


      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("<fieldset><legend>Teacher Details</legend> \n");
      out.write("    <div>\n");
      out.write("        <form>\n");
      out.write("            <div><table><td>Enter Teacher Name </td><td></td><td><input type=\"text\" name=\"searchValue\"></td><td><input type=\"submit\" name=\"Action\" value=\"Search\"></td></table></div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </div><br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <th>S.N</th>\n");
      out.write("            <th>User Type</th>\n");
      out.write("            <th>First Name</th>\n");
      out.write("            <th>Last Name</th>\n");
      out.write("            <th>Level</th>\n");
      out.write("            <th>Gender</th>\n");
      out.write("            <th>Date Of Birth</th>\n");
      out.write("            <th>Qualification</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Contact</th>\n");
      out.write("            <th>Address</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("            <th>UserName</th>\n");
      out.write("            <th>Remarks</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("     ");

        String sqlQuery="";
        String level= session.getAttribute("level").toString();
        String tec="Teacher";
       
        try{    
           
        if(request.getParameter("Action").equalsIgnoreCase("Search")){
             String searchValue=request.getParameter("searchValue");
             sqlQuery="select * from teacher where level = '"+level+"' and user= '"+tec+"' and firstname like '%"+searchValue+"%'"; 
            }else{
            sqlQuery="Select * from teacher where level = '"+level+"' and user= '"+tec+"'";  
            }
        }catch(Exception e){sqlQuery="Select * from teacher where level = '"+level+"'and user= '"+tec+"'";}
           try{ 
            db.st.executeQuery(sqlQuery);
          //  out.print(sql);
            db.rs=db.st.executeQuery(sqlQuery);
    for(int i=1;db.rs.next();i++)
    {
     out.print("<tr><td>"+i+"</td><td>"+db.rs.getString(2)+"</td><td>"+db.rs.getString(3)+"</td><td>"+db.rs.getString(4)+"</td><td>"+db.rs.getString(14)+"</td><td>"+db.rs.getString(9)+"</td>" 
         + "<td>"+db.rs.getString(8)+"</td><td>"+db.rs.getString(5)+
            "</td><td>"+db.rs.getString(6)+"</td><td>"+db.rs.getString(13)+"</td><td>"+db.rs.getString(12)+"</td><td>"+db.rs.getString(10)+"</td><td>"
            +db.rs.getString(7)+"</td><td>"+db.rs.getString(11)+"</td><td> <a href='class.jsp?Action=Edit&id=" + db.rs.getString(1) + "'>Allocate Class</a></td></tr>"); 
            session.setAttribute("id",db.rs.getString(1));
    }
   }catch(Exception e){out.print(e);}
  
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("  </fieldset> \n");
      out.write(" </div>\n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("  \n");
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
