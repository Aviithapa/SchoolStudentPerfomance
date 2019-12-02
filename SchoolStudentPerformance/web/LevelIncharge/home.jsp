<%-- 
    Document   : home
    Created on : Aug 25, 2019, 7:24:49 PM
    Author     : Lenovo
--%>

<%@page import="include.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>School Management System</title>
   
        <link href="../assets/css/style.css" rel="stylesheet" type="text/css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("button").click(function(){
    $("dis").toggle();
  });
});
</script>
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
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");
        }
        if(uid.length()==0){ out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");}
 %>

<div class="right_heading">
    <h1>Level Incharge</h1>
</div>
    
            </div>  
 <div id="menu">
                   <ul>
                  
                  <li><a href="../logout.jsp">Logout</a></li>
                 </ul> </div>
            <div id="contents">
                
            <%
      DBConnection db=new DBConnection();

%>

     
<fieldset><legend>Teacher Details</legend> 
    <div>
        <form>
            <div><table><td>Enter Teacher Name </td><td></td><td><input type="text" name="searchValue"></td><td><input type="submit" name="Action" value="Search"></td></table></div>
        </form>
        
    </div><br>
        <table border="1">
            <th>S.N</th>
            <th>User Type</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Level</th>
            <th>Gender</th>
            <th>Date Of Birth</th>
            <th>Qualification</th>
            <th>Email</th>
            <th>Contact</th>
            <th>Address</th>
            <th>Status</th>
            <th>UserName</th>
            <th>Remarks</th>
            <th>Action</th>
            </tr>
     <%
        String sqlQuery="";
        String level= session.getAttribute("level").toString();
        String tec="Teacher";
       String value="";
        try{    
           
        if(request.getParameter("Action").equalsIgnoreCase("Search")){
             String searchValue=request.getParameter("searchValue");
             sqlQuery="select * from teacher where level = '"+level+"' and user= '"+tec+"' and firstname like '%"+searchValue+"%'"; 
            
        }else{
            sqlQuery="Select * from teacher where level = '"+level+"' and user= '"+tec+"'";  
            }
        }catch(Exception e){sqlQuery="Select * from teacher where level = '"+level+"'and user= '"+tec+"'";}
           try{ 
            db.st.executeQuery(sqlQuery);
          //  out.print(sql);
            db.rs=db.st.executeQuery(sqlQuery);
    for(int i=1;db.rs.next();i++)
    {
        
     out.print("<tr><td>"+i+"</td><td>"+db.rs.getString(2)+"</td><td>"+db.rs.getString(3)+"</td><td>"+db.rs.getString(4)+"</td><td>"+db.rs.getString(14)+"</td><td>"+db.rs.getString(9)+"</td>" 
         + "<td>"+db.rs.getString(8)+"</td><td>"+db.rs.getString(5)+
            "</td><td>"+db.rs.getString(6)+"</td><td>"+db.rs.getString(13)+"</td><td>"+db.rs.getString(12)+"</td><td>"+db.rs.getString(10)+"</td><td>"
            +db.rs.getString(7)+"</td><td>"+db.rs.getString(11)+"</td><td><a href='class.jsp?Action=Edit&id" + db.rs.getString(1) + "'>Allocate Class</a></td></tr>");
              session.setAttribute("id",db.rs.getString(1)); 
         
            
            
    }
   }catch(Exception e){out.print(e);}
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
  