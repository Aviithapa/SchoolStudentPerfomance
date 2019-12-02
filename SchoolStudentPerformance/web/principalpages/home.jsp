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

    </head>
    <style>
           
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 15%;
  
  position: absolute;
  height: auto;
  overflow: auto;
  
}

li a {
  display: block;
  color: black;
  padding: 8px 16px;
  text-decoration: none;
  color:blue;
}

li a.active {
  background-color: #4CAF50;

}

li a:hover:not(.active) {
  background-color: #555;

}
ul li ul
{
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 15%;
  
  position: absolute;
  height: auto;
  overflow: auto;
}

 ul li ul li
{
	float: none;
	margin: 10px 0 0 -40px;
}

 ul li ul li a 
{
	width: 100px;
	display: block;
	margin: 10px 0 0 0;
}

ul li:hover> ul
{
	display: block;
}




        </style>
    <body onload="">
        <div id="wrapper">
            <div id="header">
                <%  String uid="";
        try{
        uid=session.getAttribute("Email").toString();
       
        }catch(NullPointerException e){ 
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/home.jsp \");</script>");
        }
        if(uid.length()==0){ out.print("<script>window.location.assign(\""+request.getContextPath()+"/home.jsp \");</script>");}
 %>

<div class="right_heading">
    <h1>Principal Page</h1>
</div>
    
            </div>
            <div id="menu">
                <ul>
                  <li><a href="home.jsp">Home</a></li>
                  <li><a href="ListStudent.jsp"> List Student</a></li>
                  <li><a href="ListTeacher.jsp">List Teacher</a></li>
                  <li><a href="listLevelIncharge.jsp">List Level Incharge</a></li>
                  <li><a href="../logout.jsp">Logout</a></li>
                 </ul>
            </div>
            <div id="content">
                <h1 style="text-align: center;">Principal Page</h1>
            </div>
            <br/>
            <div id="footer">
                <%@include file="../adminpageparts/footer.jsp"%>
            </div>
    
        </div>
    </body>
</html>
  