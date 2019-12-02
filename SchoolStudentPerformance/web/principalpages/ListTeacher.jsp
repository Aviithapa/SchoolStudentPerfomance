<%-- 
    Document   : ListTeacher
    Created on : Aug 26, 2019, 7:28:14 PM
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
      

<div class="right_heading">
    <h1>Principal Page</h1>
</div>
            </div>
            <div id="menu">
                   <ul>
                  <li><a href="home.jsp">Home</a></li>
                  <li><a href="ListStudent.jsp">List Student</a></li>
                  <li><a href="ListTeacher.jsp">List Teacher</a></li>
                  <li><a href="ListLevelIncharge.jsp">List Level Incharge</a></li>
                  <li><a href="../logout.jsp">Logout</a></li>
                 </ul> </div>
            <div id="content">

<%
      DBConnection db=new DBConnection();
try{
if(request.getParameter("Action").equals("Delete")){
  String sql="delete from teacher where id="+request.getParameter("id")+"";
   db.st.executeUpdate(sql);
  out.print("<script>alert('Data Deleted');window.location.assign('?');</script>");
  }

}catch(Exception e){e.getMessage();}

%>
<h1><legend>Teacher Details</legend> </h1>
      
<fieldset>
    <div>
        <form>
            <div><table><td>Enter User Name </td><td></td><td><input type="text" name="searchValue"></td><td><input type="submit" name="Action" value="Search"></td></table></div>
        </form>
        
    </div><br>
        <table border="1" style="padding:20px;">
            <tr style="height:50px;width:30px;">
            <th>S.N</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Gender</th>
            <th>Date Of Birth</th>
            <th>Qualification</th>
            <th>Email</th>
            <th>Contact</th>
            <th>Address</th>
            <th>Status</th>
            <th>UserName</th>
            <th>Remarks</th>
            </tr>
            

     <%
        String sqlQuery="";
        String tec="Teacher";
        try{    
        if(request.getParameter("Action").equalsIgnoreCase("Search")){
             String searchValue=request.getParameter("searchValue");
             sqlQuery="select * from teacher where user like '%"+searchValue+"%'"; 
            }else{
            sqlQuery="Select * from teacher where user ='"+tec+"'";  
            }
        }catch(Exception e){sqlQuery="Select * from teacher where user ='"+tec+"'";}
           try{ 
            db.st.executeQuery(sqlQuery);
          //  out.print(sql);
            db.rs=db.st.executeQuery(sqlQuery);
    for(int i=1;db.rs.next();i++)
    {
    out.print("<tr><td>"+i+"</td><td>"+db.rs.getString(3)+"</td><td>"+db.rs.getString(4)+"</td><td>"+db.rs.getString(9)+"</td>" 
         + "<td>"+db.rs.getString(8)+"</td><td>"+db.rs.getString(5)+
            "</td><td>"+db.rs.getString(6)+"</td><td>"+db.rs.getString(13)+"</td><td>"+db.rs.getString(12)+"</td><td>"+db.rs.getString(10)+"</td><td>"
            +db.rs.getString(7)+"</td><td>"+db.rs.getString(11)+"</td><td> </tr>");
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