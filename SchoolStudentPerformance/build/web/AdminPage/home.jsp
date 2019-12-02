<%-- 
    Document   : home
    Created on : May 21, 2017, 12:45:01 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>School Management System</title>
               <link href="../assets/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
 <style>
     body{
         margin: 0;
         
     }
     #mix{
         height:1000px;
         width:100%;
        
         
     }
     #menu
     {
         height:auto;
         width:15%;
         text-align: left;
     }
     #content{
         width:83%;
         height:auto;
         text-align:center;
         float:left;
         
     }
     
 </style>
    <body onload="">
        
            <div id="header">
                <%@include file="../adminpageparts/header.jsp"%>
            </div>
            <div id="mix">
            <div id="menu">
                    <%@include file="../adminpageparts/menu.jsp"%>
            </div>
            <div id="content" style="padding:1px 16px;height:1000px;">
             <h1>School Management System</h1>
            </div>
            </div>
            <br/>
            <div id="footer">
                <%@include file="../adminpageparts/footer.jsp"%>
            </div>
        
    </body>
</html>
  