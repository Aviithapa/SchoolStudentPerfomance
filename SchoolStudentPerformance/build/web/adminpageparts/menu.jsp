


<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 15%;
  background-color:#003153;;
  position: absolute;
  height: 1001px;
  overflow: auto;
  float:left;
  color:white;
}

li a {
  display: block;
  color: white;
  padding: 8px 16px;
  text-decoration: none;
}

li a.active {
  background-color: #4CAF50;
  color: white;
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
}

</style>


<ul>
  <li><a href="../AdminPage/home.jsp">Home</a></li>
  <li><a href="../AdminPage/AddStudent.jsp">Add Student</a></li>
  <li><a href="../AdminPage/AddTeacher.jsp">Add Staff</a></li>
   <li><a href="../AdminPage/Admin.jsp">Add User</a></li>
  <li><a href="../AdminPage/listTeacher.jsp">List Staff</a></li>
  <li><a href="../AdminPage/liststudent.jsp">List Student</a></li>
  <li><a href="../logout.jsp">Logout</a></li>
</ul>
