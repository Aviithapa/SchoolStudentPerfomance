<%-- 
    Document   : logout
    Created on : Jul 30, 2019, 8:56:41 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



        <%
      session.invalidate();
    pageContext.forward("index.jsp");
     out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");
    %>    
