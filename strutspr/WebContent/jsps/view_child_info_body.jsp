<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Untitled Page</title>
<meta name="generator" content="WYSIWYG Web Builder - http://www.wysiwygwebbuilder.com">
<style type="text/css">
body
{
   background-color: #E6E6FA;
   color: #000000;
}
</style>

</head>
 <body>
 
  <div style="margin: 0pt; padding: 0pt; position: absolute;top:140px;left:2px;">
    
    Welcome:
   <font style="font-size: 15px;" color="pink">
    <s:property value="#session.name"/>
    </font> | <font style="font-size: 15px;" color="blue"><a href="homeDispatch">SignOut</a></font>
    </div>
    <div style="margin: 0pt; padding: 0pt; position: absolute; top: 115px; left: 800px;">
  
   <font style="font-size: 15px;" color="gray"><br>
    Total No of Members   :&nbsp;&nbsp;
    <s:property value="#application.tcounter"/>
    <br>
    No of Current Users   :&nbsp;&nbsp; &nbsp;      
    <s:property value="#application.ccounter"/>
    <br>
    You are the member no   :
    <s:property value="#session.member_no"/>
    <br>
    </font>
   </div>
   
   <br><div id="wb_Image2" style="margin: 0pt; padding: 0pt; position: absolute; left: 805px; top: 186px; width: 200px; height: 287px; text-align: left; z-index: 9;">
<img src="images/profimedia-0002987057.jpg" id="Image2" alt="" border="0" style="width: 200px; height: 350px; top: -8px; left: 0px;"></div><br><div id="wb_Image3" style="margin: 0pt; padding: 0pt; position: absolute; left: 4px; top: 181px; width: 200px; height: 262px; text-align: left; z-index: 11;">
<img src="images/Cute-baby-boy-photo-collection.jpg" id="Image3" alt="" border="0" style="width: 200px; height: 362px; left: 0px; top: 9px;"></div>
   
<div id="wb_Text1" style="margin: 0pt; padding: 0pt; position: absolute; left: 228px; top: 191px; width: 40px; height: 9px; text-align: left; z-index: 0;">
<a href="user_login_success2_action"><font style="font-size:14px" color="brown" face="Arial">Back</font></a></div><br>

<div style="position:absolute;left:227px;top:210px;width:550px;height:250px;border:1px #C0C0C0 solid;background-color:#E3E4FA;font-family:Arial;font-size:13px;z-index:1;overflow:auto;scroll:auto;border-color: brown">
<table bordercolor="brown" cellspacing="0" border="" style="border-width:0.5px ">
<tr>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Child Id</font></b></td>
<td align="center" width="350" style="font-size:18px;"><b><font color="gray">Child Name</font></b></td>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Child Age</font></b></td>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Alert Type</font></b></td>
</tr>

<%
ResultSet rs=(ResultSet)request.getAttribute("rs");
if(rs!=null)
{
 while(rs.next()) { %>
    <tr>
<%      for(int col=1; col<=4; col++) { %>
        <td align="center" style="height:50px;font-size:12px" ><%=rs.getString(col)%></td>
        
        <% } %>
    </tr>
<% }

} %>
</table>
</div>


</body>

</html>
