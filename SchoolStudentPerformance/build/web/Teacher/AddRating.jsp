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
               <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    </head>
  <style>
.button {
  border: none;
  color: white;
  padding: 15px 25px;
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
                <%@include file="../teacherpageparts/header.jsp"%>
            </div>
            <div id="menu">
                    <%@include file="../teacherpageparts/menu.jsp"%>
            </div>
            <div id="content" style="text-align:left;">
               <%
           DBConnection db = new DBConnection();
            String sql = "";
            String StudentId="",StudentName="",Rating="",Class="",Section="",stdid="";
          try{
             stdid=session.getAttribute("ids").toString();
            if (request.getParameter("Action").equalsIgnoreCase("Save")) {
                      
                try{
                  
                         StudentId =session.getAttribute("ids").toString();
                         StudentName=session.getAttribute("first").toString();
                         Class=session.getAttribute("classes").toString();
                         Section=session.getAttribute("section").toString();
                         Rating=request.getParameter("Rating");
                        
          

                    sql = "insert into studentrating VALUES(null,'" + StudentId + "','"+ StudentName +"','" + Class +"','" + Section +"','" + Rating +"')";
                    //out.print(sql);
                    int row = db.st.executeUpdate(sql);
                    out.print("<script>alert('Inserted');window.location.assign(\""+request.getContextPath()+"ListStudent.jsp \");</script>");
                    } catch (Exception e) {
                        out.print(e.getMessage());
                    } 
            }
                else
                {
                        sql="select * from student where id='"+stdid+"'";
                        db.st.executeQuery("sql");
                        db.rs.next();
                        StudentId =session.getAttribute("ids").toString();
                         StudentName=session.getAttribute("first").toString();
                         Class=session.getAttribute("classes").toString();
                         Section=session.getAttribute("section").toString();
                         Rating=request.getParameter("Rating");
                        
                        
                        
                        
                        }

            
          }catch(Exception ex){
          out.print(ex.getMessage());
          }
                        
            %>   
            <fieldset><legend>Add Rating</legend>
                You have selected Mr/Miss  <%=session.getAttribute("firstname")%>,id <%=session.getAttribute("id")%>, from class <%=session.getAttribute("classes")%> based on the student activities
          during his/her class time allocate  
           the below grades that exactly match the report of the student.<br/><br>
           <form method="get">
             
                 <input type="Radio" name="Rating" value="1" checked> A+
                 <input type="Radio" name="Rating" value="2"> A
                 <input type="Radio" name="Rating" value="3"> B
                 <input type="Radio" name="Rating" value="4"> C
                 <input type="Radio" name="Rating" value="5"> D<br>
                <div id="button" style="float:left;height:auto;width:100%;margin-top:20px;">
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