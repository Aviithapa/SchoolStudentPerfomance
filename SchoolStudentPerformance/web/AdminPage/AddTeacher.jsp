
<%-- 
    Document   : AddTeacher
    Created on : Jul 30, 2019, 9:06:04 PM
    Author     : Lenovo
--%>

<%@page import="include.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>School Management</title>
               <link href="../assets/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
 <style>
.button {
  border: none;
  color: white;
  padding: 15px 125px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
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
             
            DBConnection db = new DBConnection();
            String sql = "";
            String btnValue = "Save";
            String firstname = "",  lastname = "", Qualification="", Email="",username="",  dob = "", gender = "", level="",status = "", Remarks = "", address = "",  tchId = "",user="", contact="";
             try {

                if (request.getParameter("Action").equalsIgnoreCase("save")) {
                    try {
                        firstname = request.getParameter("firstname");
                        lastname=request.getParameter("lastname");
                        Qualification=request.getParameter("qualification");
                        Email=request.getParameter("email");
                        username=request.getParameter("username");
                        dob = request.getParameter("dob");
                        gender = request.getParameter("gender");
                        status = request.getParameter("status");
                        try {
                            if (!status.equalsIgnoreCase("Y")) {
                                status = "N";
                            }
                        } catch (Exception e) {
                            status = "N";
                        }
                        Remarks = request.getParameter("remarks");
                        address = request.getParameter("address");
                        user=request.getParameter("user");
                        contact=request.getParameter("contact");
                         level=request.getParameter("level");
                        sql = "insert into teacher VALUES(null,'" + user + "','"  + firstname + "','"+ lastname +  "','" + Qualification + "','" + Email + "','" + username + "','" + dob + "','" + gender + "','" + status + "','" + Remarks + "','" + address  +"','"+contact+"','"+level+"')";
                        //out.print(sql);
                        int row = db.st.executeUpdate(sql);
                        out.print("<script>alert('Data Saved');window.location.assign('?');</script>");
                    } catch (Exception e) {
                        out.print(e.getMessage());
                    }
                } else if (request.getParameter("Action").equalsIgnoreCase("Update")) {
                    try {
                        user=request.getParameter("user");
                        firstname = request.getParameter("firstname");
                        lastname = request.getParameter("lastname");
                        Qualification=request.getParameter("qualification");
                        Email=request.getParameter("email");
                        username=request.getParameter("username");
                        dob = request.getParameter("dob");
                        gender = request.getParameter("gender");
                        status = request.getParameter("status");
                        Remarks=request.getParameter("remarks");
                        address = request.getParameter("address");  
                        user=request.getParameter("user");
                        contact=request.getParameter("contact");
                        level=request.getParameter("level");
          
                        try {
                            if (!status.equalsIgnoreCase("Y")) {
                                status = "N";
                            }
                        } catch (Exception e) {
                            status = "N";
                        }
                        sql = "update student  set user='" + user + "',firstname='" + firstname + "',lastname='" + lastname + "',email='" + Email + "',username='" + username +
                                 "',dob='" + dob +"',gender='" + gender + "',status='" + status + "',remarks='" + Remarks + "',address='" + address +  "',contact='"+contact+"',level='"+level+"' where id='" + tchId + "'";
                        //out.print(sql);
                        int row = db.st.executeUpdate(sql);
                        out.print("<script>alert('Updated');window.location.assign(\""+request.getContextPath()+"/page/listStudent.jsp \");</script>");
                    } catch (Exception e) {
                        out.print(e.getMessage());
                    }
                } else if (request.getParameter("Action").equalsIgnoreCase("Edit")) {

                    try {
                        tchId = request.getParameter("id");
                        btnValue = "Update";
                        sql = "select * from teacher where id='" + tchId + "'";
                        db.rs = db.st.executeQuery(sql);
                        db.rs.next();
                        user = db.rs.getString(2);
                        firstname = db.rs.getString(3);
                        lastname=db.rs.getString(4);
                        Qualification=db.rs.getString(5);
                        Email = db.rs.getString(6);
                        username = db.rs.getString(7);
                        dob = db.rs.getString(8);
                        gender = db.rs.getString(9);
                        status = db.rs.getString(10);
                        if (status.equalsIgnoreCase("Y")) {
                            status = "checked";
                        } else {
                            status = "";
                        }
                        Remarks = db.rs.getString(11);
                        address = db.rs.getString(12);
                       
                        contact=db.rs.getString(13);
                       level=db.rs.getString(14);
                        
                       

                    } catch (Exception e) {
                    }

                } else {
                    firstname = "";
                    lastname="";
                     
                    Qualification="";
                    Email="";
                    username="";
                    dob = "";
                    gender = "";
                    status = "";
                    Remarks = "";
                    address = "";
                    tchId = "";
                    user="";
                    contact="";
                    level="";
                   
                }
            } catch (Exception e) {
                    firstname = "";
                    lastname="";
                    
                    Qualification="";
                    Email="";
                    username="";
                    dob = "";
                    gender = "";
                    status = "";
                    Remarks = "";
                    address = "";
                    tchId = "";
                    user="";
                    contact="";
                    level="";
            }%>   
            <h1><legend>Add User</legend></h1>
            <fieldset>
        
        <form method="get">
            <input type="hidden" name="tchId" value="<%=tchId%>"/>
            
                <div id="first"style=" height:auto;width:50%;float:left;text-align:left;font-size:30px;">
                     <tr><td> User Type </td><td>:</td><td><select name="user" style="margin-left:21%;font-size:20px;"><option size="30">--Choose--</option>
                           <option value="Teacher">Teacher</option>
                            <option value="Levelincharge">Leval Incharge</option>
                        </select> </td></tr><br/>
               First Name :<input size="30" type="text" name="firstname" value="<%=firstname%>" style="margin-left:20%;margin-top:30px;"><br/>
               Last Name : <input size="30" type="text" name="lastname" value="<%=lastname%>" style="margin-left:19%;margin-top:30px;"><br/>
               Qualification : <input size="30" type="text" name="qualification" value="<%=Qualification%>" style="margin-left:15%;margin-top:30px;"><br/>
                Contact : <input size="30" type="text" name="contact" value="<%=contact%>"style="margin-left:24%;margin-top:30px;"><br/>
                 Email :<input size="30" type="text" name="email" value="<%=Email%>"style="margin-left:28%;margin-top:30px;"><br/>
                 Address :<input size="30" type="text" name="address" value="<%=address%>"style="margin-left:24%;margin-top:30px;"><br/>
                
                </div><div id="second"style="height:auto;width:50%;float:left;text-align:left;font-size:30px;">
                  Level: <select name="level" style="margin-left:28%;font-size:20px;"><option size="30">--Choose--</option>
                           <option value="Primary">Primary </option>
                            <option value="lowerSecondary">Lower Secondary</option>
                            <option value="Secondary">Secondary </option>
                            </select><br/>
                UserName :<input size="30" type="text" name="username" value="<%=username%>"style="margin-left:20%;margin-top:30px;"><br/>
              DOB :<input type="text" size="30" name="dob" value="<%=dob%>"style="margin-left:29%;margin-top:30px;"><br/>
                Gender :<select name="gender"style="margin-left:25.5%;margin-top:30px;"><option><%=gender%></option>
                            <option value="M">Male</option>
                            <option value="F">Female</option></select> <br/>
              Status :<input type="checkbox" size="30" value="Y" name="status"  <%=status%>style="margin-left:28%;margin-top:30px;">&nbsp;In-Active<br/>
              Remarks :<input type="text" size="30" name="remarks" value="<%=Remarks%>"style="margin-left:23%;margin-top:30px;"><br/>
                </div>
             <div id="button" style="float:left;height:auto;width:100%;margin-top:80px;margin-left:-30%;">
                <input style="background:green; " type="submit" class="button" value="Save" name="Action">
                <input style="background: red;" type="reset" class="button" value="Cancel" name="Action">
                </div>
        </form>
            </fieldset>
            </div>
            <br/>
            <div id="footer">
                <%@include file="../adminpageparts/footer.jsp"%>
            </div>
        </div>
    </body>
</html>