package org.apache.jsp.teacherpageparts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
