package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collections.*;
import include.DBConnection;
import java.util.*;

public final class viewreport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(" \n");

DBConnection db=new DBConnection();
String sql="",stdid="";


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("       <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <title>Student Rating Chart</title>\n");
      out.write("  <body style=\"background-color:#D3D3D3;\">\n");
      out.write("      <div class=\"StudentSearch\" style=\"font-size:15px;;width: 30%;text-align: center;padding-top:20px;margin-left: 35%;\">\n");
      out.write("          <form style=\"margin-bottom: 10%; margin-top: 10%;margin-left: 10%;height:100px;\">\n");
      out.write("            <div><table><td>Enter Class </td><td></td><td><input type=\"text\" name=\"searchValue\"></td><td><input type=\"submit\" name=\"Action\" value=\"Search\"></td></table></div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    <div class=\"container\">\n");
      out.write("        \n");
      out.write("    <canvas id=\"myChart\"></canvas>\n");
      out.write("  <script type=\"text/javascript\"> \n");
      out.write("     $(document).ready(function()){\n");
      out.write("         $.ajex[\n");
      out.write("             {\n");
      out.write("                 url=\"http://localhost/phpmyadmin/sql.php?server=1&db=studentmanagementsystem&table=studentrating&pos=0\",\n");
      out.write("                 type :\"GET\",\n");
      out.write("                 sucess :function(data){\n");
      out.write("                     console.log(data);\n");
      out.write("                     \n");
      out.write("                 }\n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("         ]\n");
      out.write("         \n");
      out.write("     }\n");
      out.write(" let myChart = document.getElementById('myChart').getContext('2d');\n");
      out.write("\n");
      out.write("    // Global Options\n");
      out.write("    Chart.defaults.global.defaultFontFamily = 'Lato';\n");
      out.write("    Chart.defaults.global.defaultFontSize = 18;\n");
      out.write("    Chart.defaults.global.defaultFontColor = '#777';\n");
      out.write("\n");
      out.write("    let massPopChart = new Chart(myChart, {\n");
      out.write("      type:'line', // bar, horizontalBar, pie, line, doughnut, radar, polarArea\n");
      out.write("      fill:'false',\n");
      out.write("        data:{\n");
      out.write("        labels:['1', '2', '3', '4', '5','6','7','8', '9', '10', '11', '12','13','14','15', '16', '17', '18', '19','20','21','22', '23', '24', '25', '26','27','28'],\n");
      out.write("        datasets:[{\n");
      out.write("          label:'Rating',\n");
      out.write("          data:[\n");
      out.write("             \n");
      out.write("          1,\n");
      out.write("          5,\n");
      out.write("          1,\n");
      out.write("          4,\n");
      out.write("          5,\n");
      out.write("          0,\n");
      out.write("          2\n");
      out.write("          ],\n");
      out.write("          fill:false,\n");
      out.write("         backgroundColor:'#EF9A04',\n");
      out.write("         /* backgroundColor:[\n");
      out.write("            'rgba(255, 99, 132, 0.6)',\n");
      out.write("            'rgba(54, 162, 235, 0.6)',\n");
      out.write("            'rgba(255, 206, 86, 0.6)',\n");
      out.write("            'rgba(75, 192, 192, 0.6)',\n");
      out.write("            'rgba(153, 102, 255, 0.6)',\n");
      out.write("            'rgba(255, 159, 64, 0.6)',\n");
      out.write("            'rgba(255, 99, 132, 0.6)'\n");
      out.write("          ],*/\n");
      out.write("          borderWidth:1,\n");
      out.write("          borderColor:'#777',\n");
      out.write("          hoverBorderWidth:3,\n");
      out.write("          hoverBorderColor:'#000'\n");
      out.write("        }]\n");
      out.write("      },\n");
      out.write("  options:{\n");
      out.write("        title:{\n");
      out.write("          display:true,\n");
      out.write("          text:'Student Rating',\n");
      out.write("          fontSize:25\n");
      out.write("        },\n");
      out.write("         axisX:{\n");
      out.write("         display:true,\n");
      out.write("         text: 'Days',\n");
      out.write("           },\n");
      out.write("            legend:{\n");
      out.write("          display:true,\n");
      out.write("          position:'right',\n");
      out.write("          labels:{\n");
      out.write("            fontColor:'#000'\n");
      out.write("          }\n");
      out.write("        },\n");
      out.write("        layout:{\n");
      out.write("          padding:{\n");
      out.write("            left:50,\n");
      out.write("            right:0,\n");
      out.write("            bottom:0,\n");
      out.write("            top:0\n");
      out.write("          }\n");
      out.write("        },\n");
      out.write("        tooltips:{\n");
      out.write("          enabled:true\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("  \n");
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
