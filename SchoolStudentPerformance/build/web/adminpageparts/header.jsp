<%  String uid="";
        try{
        uid=session.getAttribute("Email").toString();
       
        }catch(NullPointerException e){ 
         
      out.print("<script>window.location.assign(\""+request.getContextPath()+"/home.jsp \");</script>");
        }
        if(uid.length()==0){ out.print("<script>window.location.assign(\""+request.getContextPath()+"/index.jsp \");</script>");}
 %>
 <div>

<div class="right_heading">
    <h1>Adminstration Page</h1>
</div>
     <div class="user_name">
    <br/>
    <b>You are login As"<%=session.getAttribute("Email")%>"</b>
</div>
 </div>
