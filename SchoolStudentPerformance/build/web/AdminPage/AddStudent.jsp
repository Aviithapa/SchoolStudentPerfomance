<%-- 
    Document   : AddStudent
    Created on : Jul 30, 2019, 9:15:03 PM
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
            <div id="block">
            <div id="menu">
                    <%@include file="../adminpageparts/menu.jsp"%>
            </div>
            <div id="content" style="padding:1px 16px;height:1000px;">
               <%
            DBConnection db = new DBConnection();
            String sql = "";
            String btnValue = "Save";
            String StudentId = "", firstname = "",lastname = "", gender = "",address = "", stdid = "", Class="", section="",email="",contact="",Parent_Name="",Parent_Contact_Number="",dob="";
            try {

                if (request.getParameter("Action").equalsIgnoreCase("save")) {
       
                        try {
                        StudentId = request.getParameter("StudentId");
                        firstname = request.getParameter("firstname");
                        lastname = request.getParameter("lastname");
                        address = request.getParameter("address");
                        dob=request.getParameter("dob");
                        email=request.getParameter("email");
                        gender = request.getParameter("gender");
                        contact=request.getParameter("contact");
                        Parent_Name=request.getParameter("parent_name");
                        Parent_Contact_Number=request.getParameter("parent_contact_number");
                        Class=request.getParameter("class");
                        section=request.getParameter("section");  
                        sql = "insert into student VALUES(null,'" + StudentId + "','"+ firstname + "','"+ lastname + "','" + address +  "','" + dob + "','"+ email + "','"+ gender + "','" + contact + "','" + Parent_Name + "','" + Parent_Contact_Number + "','"+  section + "','" + Class + "')";                        
                        int row = db.st.executeUpdate(sql);
                        out.print("<script>alert('Data Saved');window.location.assign('?');</script>");
                 
                         } catch (Exception e) {
                        out.print(e.getMessage());
                    }
                        
                       
                        
                     
                } else if (request.getParameter("Action").equalsIgnoreCase("Update")) {
                    try {
                        stdid = request.getParameter("id");
                        StudentId = request.getParameter("StudentId");
                        firstname = request.getParameter("firstname");
                        lastname = request.getParameter("lastname");
                        address = request.getParameter("address");
                        dob=request.getParameter("dob");
                        email = request.getParameter("email");
                        gender=request.getParameter("gender");
                        contact = request.getParameter("contact");
                        Parent_Name = request.getParameter("parent_name");
                        Parent_Contact_Number = request.getParameter("parent_contact_number");
                       
                        Class=request.getParameter("class");
                        section=request.getParameter("section");
                        
                        
                        sql = "update student  set StudentId='" + StudentId +"'FirstName='" + firstname +"',LastName='" + lastname + "',Address='" + address +   "',DOB='" + dob +"',email='" + email + "',Gender='" + gender + "',Contact='" + contact
                                + "',Parent_Name='" + Parent_Name + "',Parent_Contact_Number='" + Parent_Contact_Number + "',Section='" + section +
                                "',Class='" + Class +"' where id='" + stdid + "'";
                        //out.print(sql);
                        int row = db.st.executeUpdate(sql);
                        out.print("<script>alert('Updated');window.location.assign(\""+request.getContextPath()+"/page/listStudent.jsp \");</script>");
                    } catch (Exception e) {
                        out.print(e.getMessage());
                    }
                } else if (request.getParameter("Action").equalsIgnoreCase("Edit")) {

                    try {
                        stdid = request.getParameter("id");
                        btnValue = "Update";
                        sql = "select * from student where id='" + stdid + "'";
                        db.rs = db.st.executeQuery(sql);
                        db.rs.next();
                        StudentId=db.rs.getString(2);
                        firstname = db.rs.getString(3);
                        lastname = db.rs.getString(4);
                        address = db.rs.getString(5);
                        
                        dob=db.rs.getString(6);
                        email = db.rs.getString(7);
                        gender=db.rs.getString(8);
                        contact = db.rs.getString(9);
                        Parent_Name = db.rs.getString(10);
                        Parent_Contact_Number = db.rs.getString(11);
                        section=db.rs.getString(12);
                        Class=db.rs.getString(13);
                       
                    } catch (Exception e) {
                    }

                } else {
                    StudentId = "";
                    firstname = "";
                    lastname = "";
                    address = "";
                   
                    dob="";
                    email = "";
                    gender="";
                    contact = "";
                    Parent_Name  = "";
                    Parent_Contact_Number= "";
                    Class="";
                    section="";
                }
            } catch (Exception e) {
                    StudentId = "";
                    firstname = "";
                    lastname = "";
                    address = "";
                    
                    dob="";
                    email = "";
                    gender="";
                    contact = "";
                    Parent_Name  = "";
                    Parent_Contact_Number= "";
                    Class="";
                    section="";
            }%>   
            <h1><legend>Add Student</legend></h1>
            <fieldset style="text-size:20px;">
         
           <form method="get">
            <input type="hidden" name="stuid" value="<%=stdid%>"/>
         
                <div id="first" style="height:auto;width:50%;float:left;text-align:left;font-size:30px;">
                   Student ID    :<input type="text" name="StudentId"  size="30" value="<%=StudentId%>"style="margin-left:80px;"><br/>
                    First Name    :<input type="text" name="firstname"  size="30" value="<%=firstname%>"style="margin-left:80px;margin-top:30px;"><br/>
                    Last Name    :<input type="text" name="lastname"  size="30" value="<%=lastname%>"style="margin-left:80px;margin-top:30px;"><br/>
                   
                    Address :<input type="text" name="address" size="30" value="<%=address%>" style="margin-left:113px;margin-top:30px;"><br/>
                    Contact :<input type="text" name="contact" size="30" value="<%=contact%>" style="margin-left:118px;margin-top:30px;"><br/>
                    Email   :<input type="text" name="email" size="30" value="<%=email%>" style="margin-left:139px;margin-top:30px;"><br/>
                    
                    
                </div>
                  <div id="second"style="height:400px;width:50%;float:left;text-align:left;font-size:30px;">
                      Gender  :<select  name="gender" style="margin-left:140px;"><option><%=gender%></option>
                            <option value="M">Male</option>
                            <option value="F">Female</option></select> </td></tr><br/>
                      DOB    :<input type="text" name="dob" size="30" value="<%=dob%>"style="margin-left:160px;margin-top:30px;"><br/>
                      Class      :<input type="text" name="class" size="30" value="<%=Class%>" style="margin-left:160px;margin-top:30px;"><br/>
                      Section    :<input type="text" name="section" size="30" value="<%=section%>" style="margin-left:135px;margin-top:30px;"><br/>
                     Parent Name :<input type="text" name="parent_name"size="30" value="<%=Parent_Name%>" style="margin-left:70px;margin-top:30px"><br>
                       Contact Number :<input type="parent_contact_number" size="30" name="parent_contact_number" value="<%=Parent_Contact_Number%>" style="margin-left:25px;margin-top:30px;"><br/>
                      
                  </div>
               
                <div id="button" style="float:left;height:auto;width:100%;margin-top:-20px;margin-left:-30%;">
                <input style="background:green; " type="submit" class="button" value="Save" name="Action">
                <input style="background: red;" type="reset" class="button" value="Cancel" name="Action">
                </div>
        </form>
            </fieldset>
            </div>
            <br/>
            </div>
            <div id="footer">
                <%@include file="../adminpageparts/footer.jsp"%>
            </div>
        </div>
    </body>
</html>