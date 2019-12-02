package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import include.DBConnection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>W3.CSS</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta content=\"text/html; charset=iso-8859-2\" http-equiv=\"Content-Type\">\n");
      out.write("<link href=\"../assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write(" \n");
      out.write(" font-family: \"Lato\", sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  border: 1px solid #e7e7e7;\n");
      out.write("  background-color: white;\n");
      out.write("  height: 90px;\n");
      out.write("  font-size: 20px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("  margin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color:black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  margin-left:100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("  color: white;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("#contentlogin\n");
      out.write("{\n");
      out.write("    float:right;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".album{\n");
      out.write("  position: relative;\n");
      out.write("  text-align: center;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top-right {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 8px;\n");
      out.write("  right: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".centered {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 20%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  font-size: 50px;\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("#footers\n");
      out.write("{\n");
      out.write("    width:94.5%;\n");
      out.write("    height:100px;\n");
      out.write("    background-color: #003153;\n");
      out.write("    color:white;\n");
      out.write("    padding-top:5px;\n");
      out.write("    padding-left:100px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("    <div class=\"header\" style=\"width:100%;height: 100px;background-color:#003153;\">\n");
      out.write("        <h1 style=\"color:white;margin-left:100px;padding-top:20px;font-size: 50px;\">School</h1>\n");
      out.write("    </div>\n");
      out.write("   <ul>\n");
      out.write("  <li><a class=\"active\" href=\"#home\">Home</a></li>\n");
      out.write("  <li><a href=\"#news\">News</a></li>\n");
      out.write("  <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("  <li><a href=\"#about\">About</a></li>\n");
      out.write("</ul>\n");
      out.write("<div class=\"album\">\n");
      out.write("    \n");
      out.write("  <img src=\"assets/img/788561.jpg\" alt=\"Snow\" style=\"width:100%; height:900px;\">\n");
      out.write("   <div class=\"top-right\">\n");
      out.write("  <div id=\"contentlogin\">\n");
      out.write("                \n");
      out.write("                    <form  method=\"post\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                 </td>  \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td style=\"font-size: 30px;\">User Name</td><br>\n");
      out.write("                                <td><input type=\"text\"  name=\"username\" id=\"username\" size=\"30\" maxlength=\"100\" required=\"\"/><span class=\"red\">*</span></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                              <td style=\"font-size: 33px;\">Password</td><br>\n");
      out.write("                                <td><input type=\"password\" name=\"password\" id=\"password\" size=\"31\" maxlength=\"100\" required=\"\"/><span class=\"red\">*</span></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                \n");
      out.write("                                <td  size=\"20\" align=\"rignt\" colspan=\"2\" >\n");
      out.write("                                    \n");
      out.write("                                    <input type=\"submit\" name=\"Action\" id=\"submit\" value=\"Login\" style=\"margin-left:26%; font-size: 20px;\"/>&nbsp;&nbsp;&nbsp;\n");
      out.write("                                    <input type=\"reset\" name=\"reset\" id=\"reset\" value=\"Clear\" style=\"font-size: 20px;\"/>\n");
      out.write("                                  \n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"centered\">WE'RE MAKING EVERY<br>CHILD'S WORLD BETTER</div>\n");
      out.write("\n");
      out.write("</div>\n");

    DBConnection db=new DBConnection();
    String emailId="",password="",sql="",status;
    int row=0;
      
    try{
        
    if(request.getParameter("Action").equalsIgnoreCase("login"))
    {
     
      try{
          emailId=request.getParameter("username");
          password=request.getParameter("password");
          if(emailId.equals("Admin"))
          {
               if(password.equals("Admin"))
               {
               out.print("<script>window.location.assign(\""+request.getContextPath()+"/AdminPage/home.jsp\");</script>");
               session.setAttribute("Email","Admin");
               }
                
          }
         
          
          else if(emailId.equals("principal"))
          {
              if(password.equals("principal"))
              {
              out.print("<script>window.location.assign(\""+request.getContextPath()+"/principalpages/home.jsp\");</script>");
              session.setAttribute("Email","Admin");
              }
          
          }
       else
          {
              sql="select firstname,lastname,email,status,dob,address,contact,id,user,level from teacher where firstname='"+emailId+"'";
              db.rs=db.st.executeQuery(sql);
              db.rs.next();
              String DatabasePass=db.rs.getString(2);
              out.print(DatabasePass);
              try{
               if(password.equalsIgnoreCase(DatabasePass)){
              status=db.rs.getString(4);
              out.print(status);
              if(!status.equalsIgnoreCase("Y")){
                out.print("<script>alert('Your Account is De-Active');window.location.assign('?');</script>");
             }
             session.setAttribute("firstname",db.rs.getString(1));
             session.setAttribute("email",db.rs.getString(3));
             session.setAttribute("dob",db.rs.getString(5));
             session.setAttribute("address",db.rs.getString(6));
             session.setAttribute("contact",db.rs.getString(7));
             session.setAttribute("address",db.rs.getString(6));
             session.setAttribute("id", db.rs.getString(8));
             session.setAttribute("user",db.rs.getString(9));
             session.setAttribute("level",db.rs.getString(10));
             String user=db.rs.getString(9);
             if(user.equals("Levelincharge"))
             {
             out.print("<script>window.location.assign(\""+request.getContextPath()+"/LevelIncharge/home.jsp\");</script>");
              session.setAttribute("Email","Admin");
             }
             else
             {
             out.print("<script>window.location.assign(\""+request.getContextPath()+"/Teacher/home.jsp\");</script>");
             }
               }
         
                row++;
                }catch(Exception e){out.print(e.getMessage());}
         }
      }catch(Exception e){out.print(e.getMessage());}
        
          
      if(row==0){
      out.print("<script>alert('Id Not Match');window.location.assign('?');</script>");
    }else{
        out.print("<script>alert('Password Not Match');window.location.assign('?');</script>");
        }
      }
     
    }catch(Exception e){}
    
  
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"footers\">\n");
      out.write("    <h2>ENROLL A CHILD</h2>\n");
      out.write("     <p>We provide the perfect education for your child every day</p>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
