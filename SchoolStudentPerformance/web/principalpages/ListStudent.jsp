<%-- 
    Document   : liststudent
    Created on : Aug 30, 2019, 10:43:39 AM
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
   

 %>

    <h1><legend>Student Details</legend> </h1> 
    
<fieldset>
    <div>
        <form>
            <div><table><td>Enter Class</td><td></td><td><input type="text" name="searchValue"></td><td><input type="submit" name="Action" value="Search"></td></table></div>
        </form>
        
    </div><br>
    
        <table border="1">
           
            <tr>
            <th>S.N</th>
            <th>Student ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Address</th>
            <th>Date of Birth</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Contact</th>
            <th>Father_Name</th>
            <th>Father_Contact_Number</th>
            <th>Action</th>
            </tr>
     <%
        String sqlQuery="";
       
         try{    
        if(request.getParameter("Action").equalsIgnoreCase("Search")){
             String searchValue=request.getParameter("searchValue");
             sqlQuery="select * from student where class like '%"+searchValue+"%'"; 
            }
            
       
            db.st.executeQuery(sqlQuery);
          //  out.print(sql);
            db.rs=db.st.executeQuery(sqlQuery);
    for(int i=1;db.rs.next();i++)
    {
    out.print("<tr><td>"+i+"</td><td>"+db.rs.getString(2)+"</td><td>"+db.rs.getString(3)+"</td><td>"+db.rs.getString(4)+"</td>" 
         + "<td>"+db.rs.getString(5)+"</td><td>"+db.rs.getString(6)+"</td><td>"+db.rs.getString(7)+"</td><td>"+db.rs.getString(8)
            +"</td><td>"+db.rs.getString(9)+"</td><td>"+db.rs.getString(10)+"</td><td>"+db.rs.getString(11)+"</td><td> <a href='../viewreport.jsp?Action=Edit&id=" + db.rs.getString(1) + "'>View Progress Report</a></td></tr>");
           session.setAttribute("id", db.rs.getString(1));
           session.setAttribute("firstname", db.rs.getString(2));
           session.setAttribute("lastname",db.rs.getString(3));        
    
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
