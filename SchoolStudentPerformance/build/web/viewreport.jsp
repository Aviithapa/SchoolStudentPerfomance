<%-- 
    Document   : viewreport
    Created on : Aug 16, 2019, 8:25:16 PM
    Author     : Lenovo
--%>
<%@page import="java.util.Collections.*"%>
<%@page import="include.DBConnection"%>
<%@ page import="java.util.*" %>
 
<%
DBConnection db=new DBConnection();
String sql="",stdid="";

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
       <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <title>Student Rating Chart</title>
  <body style="background-color:#D3D3D3;">
      <div class="StudentSearch" style="font-size:15px;;width: 30%;text-align: center;padding-top:20px;margin-left: 35%;">
          <form style="margin-bottom: 10%; margin-top: 10%;margin-left: 10%;height:100px;">
            <div><table><td>Enter Class </td><td></td><td><input type="text" name="searchValue"></td><td><input type="submit" name="Action" value="Search"></td></table></div>
        </form>
      </div>
      
    <div class="container">
        
    <canvas id="myChart"></canvas>
  <script type="text/javascript"> 
      
 let myChart = document.getElementById('myChart').getContext('2d');

    // Global Options
    Chart.defaults.global.defaultFontFamily = 'Lato';
    Chart.defaults.global.defaultFontSize = 18;
    Chart.defaults.global.defaultFontColor = '#777';

    let massPopChart = new Chart(myChart, {
      type:'line', // bar, horizontalBar, pie, line, doughnut, radar, polarArea
      fill:'false',
        data:{
        labels:['1', '2', '3', '4', '5','6','7','8', '9', '10', '11', '12','13','14','15', '16', '17', '18', '19','20','21','22', '23', '24', '25', '26','27','28'],
        datasets:[{
          label:'Rating',
          data:[
             
          1,
          5,
          1,
          4,
          5,
          0,
          2
          ],
          fill:false,
         backgroundColor:'#EF9A04',
         /* backgroundColor:[
            'rgba(255, 99, 132, 0.6)',
            'rgba(54, 162, 235, 0.6)',
            'rgba(255, 206, 86, 0.6)',
            'rgba(75, 192, 192, 0.6)',
            'rgba(153, 102, 255, 0.6)',
            'rgba(255, 159, 64, 0.6)',
            'rgba(255, 99, 132, 0.6)'
          ],*/
          borderWidth:1,
          borderColor:'#777',
          hoverBorderWidth:3,
          hoverBorderColor:'#000'
        }]
      },
  options:{
        title:{
          display:true,
          text:'Student Rating',
          fontSize:25
        },
         axisX:{
         display:true,
         text: 'Days',
           },
            legend:{
          display:true,
          position:'right',
          labels:{
            fontColor:'#000'
          }
        },
        layout:{
          padding:{
            left:50,
            right:0,
            bottom:0,
            top:0
          }
        },
        tooltips:{
          enabled:true
        }
      }
    });
  </script>

     
    </head>
  
</body>
</html>
