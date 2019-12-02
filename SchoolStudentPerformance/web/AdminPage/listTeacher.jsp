<%-- 
    Document   : listTeacher
    Created on : Jul 30, 2019, 9:14:04 PM
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
    </head>
    <body onload="">
        <div id="wrapper">
            <div id="header">
                <%@include file="../adminpageparts/header.jsp"%>
            </div>
            <div id="menu">
                    <%@include file="../adminpageparts/menu.jsp"%>
            </div>
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

     
<fieldset><legend>User Details</legend> 
    <div>
        <form>
            <div><table><td>Enter User Name </td><td></td><td><input type="text" name="searchValue"></td><td><input type="submit" name="Action" value="Search"></td></table></div>
        </form>
        
    </div><br>
        <table border="1" style="padding:20px;">
            <tr style="height:50px;width:30px;">
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
        try{    
        if(request.getParameter("Action").equalsIgnoreCase("Search")){
             String searchValue=request.getParameter("searchValue");
             sqlQuery="select * from teacher where user like '%"+searchValue+"%'"; 
            }else{
            sqlQuery="Select * from teacher";  
            }
        }catch(Exception e){sqlQuery="Select * from teacher";}
           try{ 
            db.st.executeQuery(sqlQuery);
          //  out.print(sql);
            db.rs=db.st.executeQuery(sqlQuery);
    for(int i=1;db.rs.next();i++)
    {
    out.print("<tr><td>"+i+"</td><td>"+db.rs.getString(2)+"</td><td>"+db.rs.getString(3)+"</td><td>"+db.rs.getString(4)+"</td><td>"+db.rs.getString(14)+"</td><td>"+db.rs.getString(9)+"</td>" 
         + "<td>"+db.rs.getString(8)+"</td><td>"+db.rs.getString(5)+
            "</td><td>"+db.rs.getString(6)+"</td><td>"+db.rs.getString(13)+"</td><td>"+db.rs.getString(12)+"</td><td>"+db.rs.getString(10)+"</td><td>"
            +db.rs.getString(7)+"</td><td>"+db.rs.getString(11)+"</td><td> <a href='AddTeacher.jsp?Action=Edit&id=" + db.rs.getString(1) + "'>Edit</a> | <a href='?Action=Delete&id="+db.rs.getString(1)+"'onclick='return confirm('Do you really want to delete ??')'>Delete</a></td></tr>");
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