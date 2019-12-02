package org.apache.jsp.LevelIncharge;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import include.DBConnection;

public final class class_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>School Management System</title>\n");
      out.write("   \n");
      out.write("       <link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write(" <style>\n");
      out.write(".button {\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 15px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  margin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<div id=\"dis\">\n");
      out.write("    <body onload=\"\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("             <div id=\"header\">\n");
      out.write("                ");
  String uid="";
        try{
        uid=session.getAttribute("Email").toString();
       
        }catch(NullPointerException e){ 
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/home.jsp \");</script>");
        }
        if(uid.length()==0){ out.print("<script>window.location.assign(\""+request.getContextPath()+"/home.jsp \");</script>");}
 
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"right_heading\">\n");
      out.write("    <h1>Level Incharge</h1>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("            </div><div id=\"menu\">\n");
      out.write("                   <ul>\n");
      out.write("                  \n");
      out.write("                  <li><a href=\"../logout.jsp\">Logout</a></li>\n");
      out.write("                 </ul> </div>\n");
      out.write("            \n");
      out.write("            <div id=\"content\" style=\"text-align:left;\">\n");
      out.write("               ");

            DBConnection db = new DBConnection();
            String sql = "";
            String btnvalue="Save";
            String tchId=session.getAttribute("id").toString();
            String teacherId="",firstname="",Subject="",Class="",Section="",stdid="",lastname="",btnValue="Save";
           if (request.getParameter("Action").equalsIgnoreCase("Save")) {
                      
                try{
                    sql="select * from teacher where id='" + tchId + "'";
                         db.rs = db.st.executeQuery(sql);
                         db.rs.next();
                    firstname = db.rs.getString(3);
                    lastname=db.rs.getString(4);
                    teacherId = db.rs.getString(1);
                    Class=request.getParameter("Class");
                    Section=request.getParameter("Section");
                    Subject=request.getParameter("Subject");
                        
          

                        sql = "insert into classallocation VALUES(null,'"+ teacherId + "','" + firstname + "','"+ lastname +"','" + Class +"','" + Section +"','" + Subject +"')";
                        //out.print(sql);
                        int row = db.st.executeUpdate(sql);
                        out.print("<script>alert('Inserted');window.location.assign(\""+request.getContextPath()+"/LevelIncharge/home.jsp \");</script>");
                    } catch (Exception e) {
                        out.print(e.getMessage());
                    } 

            } 
            else {
                    sql="select * from teacher where id='" + tchId + "'";
                         db.rs = db.st.executeQuery(sql);
                         db.rs.next();
                         teacherId =db.rs.getString(1);
                         firstname=db.rs.getString(3);
                         lastname=db.rs.getString(4);
                         
                }
            
      out.write("   \n");
      out.write("            <fieldset><legend>Add Subject</legend>\n");
      out.write("          \n");
      out.write("           <form method=\"get\">\n");
      out.write("             <table>\n");
      out.write("                 <h1>Here is Mr/Miss ");
out.print(firstname);
      out.write("</h1>\n");
      out.write("                ");
String level=session.getAttribute("level").toString();
                    if(level.equals("Primary")){
      out.write("\n");
      out.write("                <tr><td>Class </td><td>:</td><td><select name=\"Class\" style=\"font-size:20px;\"><option size=\"30\">--Choose--</option>\n");
      out.write("                           <option value=\"1\">1</option>\n");
      out.write("                            <option value=\"2\">2</option>\n");
      out.write("                            <option value=\"3\">3</option>\n");
      out.write("                            <option value=\"4\">4</option>\n");
      out.write("                            <option value=\"5\">5</option>\n");
      out.write("                            ");
}else if(level.equals("lowerSecondary")){
      out.write("\n");
      out.write("                            <tr><td>Class </td><td>:</td><td><select name=\"Class\" style=\"font-size:20px;\"><option size=\"30\">--Choose--</option>\n");
      out.write("                           <option value=\"6\">6</option>\n");
      out.write("                            <option value=\"7\">7</option>\n");
      out.write("                            <option value=\"8\">8</option>\n");
      out.write("                            \n");
      out.write("                            ");
}else {
      out.write("\n");
      out.write("                            <tr><td>Class </td><td>:</td><td><select name=\"Class\" style=\"font-size:20px;\"><option size=\"30\">--Choose--</option>\n");
      out.write("                           <option value=\"9\">9</option>\n");
      out.write("                            <option value=\"10\">10</option>\n");
      out.write("                            \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select><br/>\n");
      out.write("                               <tr><td>Section </td><td>:</td><td><select name=\"Section\" style=\"font-size:20px;\"><option size=\"30\">--Choose--</option>\n");
      out.write("                           <option value=\"A\">A</option>\n");
      out.write("                            <option value=\"B\">B</option>\n");
      out.write("                            <option value=\"C\">C</option>\n");
      out.write("                            <option value=\"D\">D</option>\n");
      out.write("                 <tr><td>Subject </td><td>:</td><td><select name=\"Subject\" style=\"font-size:20px;\"><option size=\"30\">--Choose--</option>\n");
      out.write("                           <option value=\"English\">English</option>\n");
      out.write("                            <option value=\"Mathmatics\">Mathmatics</option>\n");
      out.write("                            <option value=\"Science\">Science</option>\n");
      out.write("                            <option value=\"Nepali\">Nepali</option>\n");
      out.write("                            <option value=\"Social\">Social</option>\n");
      out.write("                            <option value=\"Computer\">Computer</option>\n");
      out.write("                            <option value=\"Optional Math\">Optional Math</option>\n");
      out.write("                            <option value=\"Health\">Health</option>\n");
      out.write("                <tr><td> <input style=\"background:green; \" type=\"submit\" class=\"button\" value=\"Save\" name=\"Action\">\n");
      out.write("                <input style=\"background: red;\" type=\"reset\" class=\"button\" value=\"Cancel\" name=\"Action\"></td></tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("            </table>\n");
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
