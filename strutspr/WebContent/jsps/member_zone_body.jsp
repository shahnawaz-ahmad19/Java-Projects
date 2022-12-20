<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
 
<div id="wb_TextArt1" style="margin: 0pt; padding: 0pt; position: absolute; left: 1px; top: 176px; width: 189px; height: 38px; text-align: center; z-index: 1;">
<img src="images/img0006.png" id="TextArt1" alt="Member Zone" title="Member Zone" style="border-width: 0pt; width: 217px; height: 36px; left: 0px; top: 0px;"></div>

<div id="wb_Image1" style="margin: 0pt; padding: 0pt; position: absolute; left: 8px; top: 220px; width: 150px; height: 322px; text-align: left; z-index: 3;">
<img src="images/team-member.jpg" id="Image1" alt="" border="0" style="width: 151px; height: 323px; top: 0px; left: 0px;"></div><br><div style="border: 1px solid brown; overflow: auto; position: absolute; left: 191px; top: 219px; width: 700px; height: 300px; background-color: rgb(227, 228, 250); font-family: Arial; font-size: 13px; z-index: 1;">

<table bordercolor="brown" cellspacing="0" border=""><tr>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">UserName</font></b></td>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Mob</font></b></td>
<td align="center" width="600" style="font-size:18px;"><b><font color="gray">Email</font></b></td>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Member Id</font></b></td>
</tr>

<%
ResultSet rs=(ResultSet)request.getAttribute("rs");

int count=0;
if(rs!=null)
{
 while(rs.next()) { 
 count++;
 %>
    <tr>
<%      for(int col=1; col<=4; col++) { %>
        <td align="center" style="height:50px;font-size:12px"><%=rs.getString(col)%></td>
        <% } %>
    </tr>
<% 
}

} %>
</table>
</div>


<div style="margin: 0pt; padding: 0pt; position: absolute;top:140px;left:2px;">
     
   <b> Welcome:</b>
   <font style="font-size: 15px;" color="pink">
    <s:property value="#session.name"/>
    </font> | <font color="blue"><a href="homeDispatch">SignOut</a></font>
    </div>
    <div style="margin: 0pt; padding: 0pt; position: absolute; top: 159px; left: 375px;">
    
    <font style="font-size:25px;position:absolute:left:50px;"color="green">Total No Of Members:<%=count%></font>
 </div>

</body>
</html>