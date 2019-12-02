<%-- 
    Document   : home
    Created on : May 21, 2017, 12:45:01 PM
    Author     : Abhishek
--%>
<%@page import="include.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>School Management System</title>
   
        <link href="../assets/css/style.css" rel="stylesheet" type="text/css"/>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>
    </head>
    <body onload="">
        <div id="wrapper">
            <div id="header">
                <%@include file="../teacherpageparts/header.jsp"%>
            </div>
            <div id="menu">
                    <%@include file="../teacherpageparts/menu.jsp"%>
            </div>
            <div id="content">
                <%
               DBConnection db=new DBConnection();%>
               <h1>Class Assigned for Academic Year</h1>
                <table>
    <tr>
      <th>S.N</th>
      <th>Class</th>
      <th>Section</th>
      <th>Subject</th>
      <th>Action</th>
     </tr>
      <%
          try{  
             String sqlQuery="";
             String tchid=session.getAttribute("id").toString();
             sqlQuery="select class ,section, subject from classallocation where teacherid = '"+tchid+"'";
             db.st.executeQuery(sqlQuery);
             db.rs=db.st.executeQuery(sqlQuery);
   for(int i=1;db.rs.next();i++)
             {
             out.print("<tr><td>"+i+"</td><td>"+db.rs.getString(1)+"</td><td>"+db.rs.getString(2)+"</td><td>"+db.rs.getString(3)
            +"</td><td> <a href='ListStudent.jsp?Action=Edit&id=" + db.rs.getString(1) + "'>List Student</a>");
             session.setAttribute("classes",db.rs.getString(1));
             session.setAttribute("section",db.rs.getString(2));
             }
            
        }catch(Exception e){}
          
        %>
    </table>
              
            </div>
            <br/>
            <div id="footer">
                <%@include file="../adminpageparts/footer.jsp"%>
            </div>
        </div>
    </body>
</html>
  