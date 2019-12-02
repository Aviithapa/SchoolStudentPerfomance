/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

     $(document).ready(function(){
         $.ajex({
             
                 url="http://localhost/phpmyadmin/sql.php?server=1&db=studentmanagementsystem&table=studentrating&pos=0",
                 type :"GET",
                 sucess :function(data){
                     console.log(data);
                     var userID=[];
                     var rating=[];
                     for(var i in data){
                         userID.push("usrID"+data[i].studentid);
                         rating.push(data[i].rating);
                         
                     }
                     var chartdata={
                         labels :St ,
                         datasets :[
                             label:"facebook",
                             fill:false,
                             LineTension:0.1,
                             backgroundColor:"rgba(59,89,152,0.75)",
                             borderColor:"rgba(59,89,152,1)",
                             pointHoverBackgroundColor:"rgba(59,89,152,1)",
                             pointHoverBorderColor:"rgba(59,89,152,1)",
                             data:rating
                         ]
                         
                     };
                     var ctx=$("#mycanvas");
                     var LineGraph=new Chart(ctx,{
                         type:'Line',
                         data:chartdata
                         
                     });
                     
                 },
                         error :function(data){
                             
                         }
                 
             
});
         
});