package org.apache.jsp.Teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import include.DBConnection;

public final class AddRating_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>School Management</title>\n");
      out.write("               <link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("               <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("  <style>\n");
      out.write(".button {\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 25px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <body onload=\"\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"header\">\n");
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
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");
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
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"../logout.jsp\">Logout</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content\" style=\"text-align:left;\">\n");
      out.write("               ");

           DBConnection db = new DBConnection();
            String sql = "";
            String btnvalue="Save";
            String StudentId="",StudentName="",Rating="",Class="",Section="",stdid="",btnValue="Save";

             stdid=request.getParameter("id").toString();
            if (request.getParameter("Action").equalsIgnoreCase("Save")) {
                      
                try{
                    StudentName = session.getAttribute("firstname").toString();
                    StudentId = session.getAttribute("id").toString();
                    Class=session.getAttribute("classes").toString();
                    Section=session.getAttribute("section").toString();
                    Rating=request.getParameter("Rating");
                        
          

                    sql = "insert into studentrating VALUES(null,'" + StudentId + "','"+ StudentName +"','" + Class +"','" + Section +"','" + Rating +"')";
                    //out.print(sql);
                    int row = db.st.executeUpdate(sql);
                    out.print("<script>alert('Inserted');window.location.assign(\""+request.getContextPath()+"ListStudent.jsp \");</script>");
                    } catch (Exception e) {
                        out.print(e.getMessage());
                    } 

            } 
            else {
                
                         sql="select * from student where id='" + stdid + "'";
                         db.rs = db.st.executeQuery(sql);
                         db.rs.next();
                         StudentId =db.rs.getString(1);
                         StudentName=db.rs.getString(2);
                         Class=db.rs.getString(13);
                         Section=db.rs.getString(12);
                }
            
      out.write("   \n");
      out.write("            <fieldset><legend>Add Rating</legend>\n");
      out.write("         You have selected Mr/Miss  ");
      out.print(session.getAttribute("firstname"));
      out.write(" from class ");
      out.print(session.getAttribute("class"));
      out.write(" based on the student activities\n");
      out.write("          during his/her class time allocate  \n");
      out.write("           the below grades that exactly match the report of the student.<br/><br>\n");
      out.write("           <form method=\"get\">\n");
      out.write("             \n");
      out.write("                 <input type=\"Radio\" name=\"Rating\" value=\"1\" checked> A+\n");
      out.write("                 <input type=\"Radio\" name=\"Rating\" value=\"2\"> A\n");
      out.write("                 <input type=\"Radio\" name=\"Rating\" value=\"3\"> B\n");
      out.write("                 <input type=\"Radio\" name=\"Rating\" value=\"4\"> C\n");
      out.write("                 <input type=\"Radio\" name=\"Rating\" value=\"5\"> D<br>\n");
      out.write("                 <div id=\"button\" style=\"float:left;height:auto;width:100%;margin-top:20px;\">\n");
      out.write("                <input style=\"background:green; \" type=\"submit\" class=\"button\" value=\"Save\" name=\"Action\">\n");
      out.write("                <input style=\"background: red;\" type=\"reset\" class=\"button\" value=\"Cancel\" name=\"Action\">\n");
      out.write("                </div>\n");
      out.write("        </form>\n");
      out.write("            </fieldset>\n");
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
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
