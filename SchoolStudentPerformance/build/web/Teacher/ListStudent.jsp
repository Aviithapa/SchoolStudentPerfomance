<%-- 
    Document   : ListStudent
    Created on : Aug 26, 2019, 8:05:01 PM
    Author     : Lenovo
--%>

<%@page import="include.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Declaration</title>
               <link href="../assets/css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body onload="">
        <div id="wrapper">
             <div id="header">
                <%@include file="../teacherpageparts/header.jsp"%>
            </div>
            <div id="menu">
                     <%@include file="../teacherpageparts/menu.jsp"%> </div>
            <div id="content">
<%
    DBConnection db=new DBConnection();
 %>

    <h1><legend>Student Details</legend> </h1> 
    <b>Here  is your class "<%=session.getAttribute("classes")%>" Student List </b>

<fieldset>
    <div>
       </div><br>
        <table border="1">
           
            <tr>
            <th>S.N</th>
            <th>Student Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Gender</th>
            <th>Date of Birth</th>
            <th>Email</th>
            <th>Address</th>
            <th>Contact</th>
            <th>Father Name</th>
            <th>Father Contact Number</th>
            <th>Action</th>
            </tr>
     <%
        String sqlQuery="";
        try{  
           String Class="",section="";
           Class=session.getAttribute("classes").toString();
           
            sqlQuery="Select * from student where class='"+Class+"'";  
            db.st.executeQuery(sqlQuery);
          //  out.print(sql);
            db.rs=db.st.executeQuery(sqlQuery);
    for(int i=1;db.rs.next();i++)
    {
    out.print("<tr><td>"+i+"</td><td>"+db.rs.getString(2)+"</td><td>"+db.rs.getString(3)+"</td><td>"+db.rs.getString(4)+"</td>" 
         + "<td>"+db.rs.getString(8)+"</td><td>"+db.rs.getString(6)+"</td><td>"+db.rs.getString(7)+"</td><td>"+db.rs.getString(5)
            +"</td><td>"+db.rs.getString(9)+"</td><td>"+db.rs.getString(10)+"</td><td>"+db.rs.getString(11)+"</td><td> <a href='AddRating.jsp?Action=Edit&id=" + db.rs.getString(1) + "'>Rate</a></td></tr>");
           session.setAttribute("ids", db.rs.getString(1));
            session.setAttribute("first", db.rs.getString(3));
             
   }
   }catch(Exception e){}
  %>
        
        </table>
  </fieldset> 
 </div>
            <br/>
            <div id="footer">
                <%@include file="../adminpageparts/footer.jsp"%>
            </div>
        </div>
    </body>
</html>
