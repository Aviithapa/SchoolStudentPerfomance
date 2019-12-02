<%-- 
    Document   : class
    Created on : Aug 27, 2019, 7:55:13 AM
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
     
    </head>

 <style>
.button {
  border: none;
  color: white;
  padding: 15px 15px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  margin-top: 20px;
}

</style>
<div id="dis">
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
    <h1>Level Incharge</h1>
</div>
    
            </div><div id="menu">
                   <ul>
                  
                  <li><a href="../logout.jsp">Logout</a></li>
                 </ul> </div>
            
            <div id="content" style="text-align:left;">
               <%
            DBConnection db = new DBConnection();
            String sql = "";
            String btnvalue="Save";
            String tchId=session.getAttribute("id").toString();
            String teacherId="",firstname="",Subject="",Class="",Section="",stdid="",lastname="",btnValue="Save";
           if (request.getParameter("Action").equalsIgnoreCase("Save")) {
                      
                try{
                    sql="select * from teacher where id='" + tchId + "'";
                         db.rs = db.st.executeQuery(sql);
                         db.rs.next();
                    firstname = db.rs.getString(3);
                    lastname=db.rs.getString(4);
                    teacherId = db.rs.getString(1);
                    Class=request.getParameter("Class");
                    Section=request.getParameter("Section");
                    Subject=request.getParameter("Subject");
                        
          

                        sql = "insert into classallocation VALUES(null,'"+ teacherId + "','" + firstname + "','"+ lastname +"','" + Class +"','" + Section +"','" + Subject +"')";
                        //out.print(sql);
                        int row = db.st.executeUpdate(sql);
                        out.print("<script>alert('Inserted');window.location.assign(\""+request.getContextPath()+"/LevelIncharge/home.jsp \");</script>");
                    } catch (Exception e) {
                        out.print(e.getMessage());
                    } 

            } 
            else {
                    sql="select * from teacher where id='" + tchId + "'";
                         db.rs = db.st.executeQuery(sql);
                         db.rs.next();
                         teacherId =db.rs.getString(1);
                         firstname=db.rs.getString(3);
                         lastname=db.rs.getString(4);
                         
                }
            %>   
            <fieldset><legend>Add Subject</legend>
          
           <form method="get">
             <table>
                 
                <%String level=session.getAttribute("level").toString();
                    if(level.equals("Primary")){%>
                <tr><td>Class </td><td>:</td><td><select name="Class" style="font-size:20px;"><option size="30">--Choose--</option>
                           <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <%}else if(level.equals("lowerSecondary")){%>
                            <tr><td>Class </td><td>:</td><td><select name="Class" style="font-size:20px;"><option size="30">--Choose--</option>
                           <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            
                            <%}else {%>
                            <tr><td>Class </td><td>:</td><td><select name="Class" style="font-size:20px;"><option size="30">--Choose--</option>
                           <option value="9">9</option>
                            <option value="10">10</option>
                            
                            <%}%>
                        </select><br/>
                               <tr><td>Section </td><td>:</td><td><select name="Section" style="font-size:20px;"><option size="30">--Choose--</option>
                           <option value="A">A</option>
                            <option value="B">B</option>
                            <option value="C">C</option>
                            <option value="D">D</option>
                 <tr><td>Subject </td><td>:</td><td><select name="Subject" style="font-size:20px;"><option size="30">--Choose--</option>
                           <option value="English">English</option>
                            <option value="Mathmatics">Mathmatics</option>
                            <option value="Science">Science</option>
                            <option value="Nepali">Nepali</option>
                            <option value="Social">Social</option>
                            <option value="Computer">Computer</option>
                            <option value="Optional Math">Optional Math</option>
                            <option value="Health">Health</option>
                <tr><td> <input style="background:green; " type="submit" class="button" value="Save" name="Action">
                <input style="background: red;" type="reset" class="button" value="Cancel" name="Action"></td></tr>
               
               
            </table>
        </form>
            </fieldset>
            </div>
            <br/>
            <div id="footer">
                <%@include file="../adminpageparts/footer.jsp"%>
            </div>
            </div>
        </div>
    </body>
</html>