<%-- 
    Document   : home
    Created on : Aug 24, 2019, 7:15:13 PM
    Author     : Lenovo
--%>

<%@page import="include.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
<link href="../assets/css/style.css" rel="stylesheet" type="text/css"/>
<style>
body {
 
 font-family: "Lato", sans-serif;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid #e7e7e7;
  background-color: white;
  height: 90px;
  font-size: 20px;
  
}

li {
  float: left;
  margin-top: 20px;
}

li a {
  display: block;
  color:black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  margin-left:100px;
}

li a:hover:not(.active) {
  background-color: #ddd;
}

li a.active {
  color: white;
  background-color: #4CAF50;
}
#contentlogin
{
    float:right;

}
.album{
  position: relative;
  text-align: center;
  color: white;
}

.top-right {
  position: absolute;
  top: 8px;
  right: 16px;
}


.centered {
  position: absolute;
  top: 50%;
  left: 20%;
  transform: translate(-50%, -50%);
  font-size: 50px;
}
.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
#footers
{
    width:94.5%;
    height:100px;
    background-color: #003153;
    color:white;
    padding-top:5px;
    padding-left:100px;
}
</style>
    </head>
    <body>
    
    <div class="header" style="width:100%;height: 100px;background-color:#003153;">
        <h1 style="color:white;margin-left:100px;padding-top:20px;font-size: 50px;">School</h1>
    </div>
   <ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>
<div class="album">
    
  <img src="assets/img/788561.jpg" alt="Snow" style="width:100%; height:900px;">
   <div class="top-right">
  <div id="contentlogin">
                
                    <form  method="post">
                        <table border="0">
                            <tr>
                                <td colspan="2">
                                 </td>  
                            </tr>
                            <tr>
                                <td style="font-size: 30px;">User Name</td><br>
                                <td><input type="text"  name="username" id="username" size="30" maxlength="100" required=""/><span class="red">*</span></td>
                            </tr>
                            <tr>
                              <td style="font-size: 33px;">Password</td><br>
                                <td><input type="password" name="password" id="password" size="31" maxlength="100" required=""/><span class="red">*</span></td>
                            </tr>
                            <tr>
                                
                                <td  size="20" align="rignt" colspan="2" >
                                    
                                    <input type="submit" name="Action" id="submit" value="Login" style="margin-left:26%; font-size: 20px;"/>&nbsp;&nbsp;&nbsp;
                                    <input type="reset" name="reset" id="reset" value="Clear" style="font-size: 20px;"/>
                                  
                                </td>
                                
                            </tr>
                        </table>
                    </form>
                
            </div>
  </div>
  <div class="centered">WE'RE MAKING EVERY<br>CHILD'S WORLD BETTER</div>

</div>
<%
    DBConnection db=new DBConnection();
    String emailId="",password="",sql="",status;
    int row=0;
      
    try{
        
    if(request.getParameter("Action").equalsIgnoreCase("login"))
    {
     
      try{
          emailId=request.getParameter("username");
          password=request.getParameter("password");
          if(emailId.equals("Admin"))
          {
               if(password.equals("Admin"))
               {
               out.print("<script>window.location.assign(\""+request.getContextPath()+"/AdminPage/home.jsp\");</script>");
               session.setAttribute("Email","Admin");
               }
                
          }
         
          
          else if(emailId.equals("principal"))
          {
              if(password.equals("principal"))
              {
              out.print("<script>window.location.assign(\""+request.getContextPath()+"/principalpages/home.jsp\");</script>");
              session.setAttribute("Email","Admin");
              }
          
          }
       else
          {
              sql="select firstname,lastname,email,status,dob,address,contact,id,user,level from teacher where firstname='"+emailId+"'";
              db.rs=db.st.executeQuery(sql);
              db.rs.next();
              String DatabasePass=db.rs.getString(2);
              out.print(DatabasePass);
              try{
               if(password.equalsIgnoreCase(DatabasePass)){
              status=db.rs.getString(4);
              out.print(status);
              if(!status.equalsIgnoreCase("Y")){
                out.print("<script>alert('Your Account is De-Active');window.location.assign('?');</script>");
             }
             session.setAttribute("firstname",db.rs.getString(1));
             session.setAttribute("email",db.rs.getString(3));
             session.setAttribute("dob",db.rs.getString(5));
             session.setAttribute("address",db.rs.getString(6));
             session.setAttribute("contact",db.rs.getString(7));
             session.setAttribute("address",db.rs.getString(6));
             session.setAttribute("id", db.rs.getString(8));
             session.setAttribute("user",db.rs.getString(9));
             session.setAttribute("level",db.rs.getString(10));
             String user=db.rs.getString(9);
             if(user.equals("Levelincharge"))
             {
             out.print("<script>window.location.assign(\""+request.getContextPath()+"/LevelIncharge/home.jsp\");</script>");
              session.setAttribute("Email","Admin");
             }
             else
             {
             out.print("<script>window.location.assign(\""+request.getContextPath()+"/Teacher/home.jsp\");</script>");
             }
               }
         
                row++;
                }catch(Exception e){out.print(e.getMessage());}
         }
      }catch(Exception e){out.print(e.getMessage());}
        
          
      if(row==0){
      out.print("<script>alert('Id Not Match');window.location.assign('?');</script>");
    }else{
        out.print("<script>alert('Password Not Match');window.location.assign('?');</script>");
        }
      }
     
    }catch(Exception e){}
    
  %>


<div id="footers">
    <h2>ENROLL A CHILD</h2>
     <p>We provide the perfect education for your child every day</p>
    </div>
</body>
</html>
