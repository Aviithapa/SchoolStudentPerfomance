<%-- 
    Document   : header
    Created on : Aug 11, 2019, 5:00:51 PM
    Author     : Abhishek
--%>
<style>
   
  .button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: right;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
    </style>
<%  String uid="";
        try{
        uid=session.getAttribute("firstname").toString(); 
        }catch(NullPointerException e){ 
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");
        }
        if(uid.length()==0){ out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");}
 %>
<div>
    <div class="user_name" style="font-size: 20px;  width:auto;">
    <b>Name    <b style="padding-left:20px;">:<%=session.getAttribute("firstname")%><br> 
    <b>DOB    <b style="padding-left:25px;"> :<%=session.getAttribute("dob")%><br></b>
    <b>Address :<%=session.getAttribute("address")%><br></b>
    <b>Contact :<%=session.getAttribute("contact")%><br></b>
</div>

    <a href="../logout.jsp" style="align:right">Logout</a>
   
</div>