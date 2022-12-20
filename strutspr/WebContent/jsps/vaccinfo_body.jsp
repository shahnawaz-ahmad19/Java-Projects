
<%@ page import="java.sql.*" %>

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

<div style="position:absolute;left:80px;top:170px;width:900px;height:350px;border:1px #C0C0C0 solid;background-color:#E3E4FA;font-family:Arial;font-size:13px;z-index:1;overflow:auto;scroll:auto;border-color: brown">
<table bordercolor="brown" cellspacing="0" border="" style="border-width:0.5px ">
<tr>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Age</font></b></td>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Vaccine</font></b></td>
<td align="center" width="600" style="font-size:18px;"><b><font color="gray">Description</font></b></td>
<td align="center" width="150" style="font-size:18px;"><b><font color="gray">Disease</font></b></td>
</tr>

<%
ResultSet rs=(ResultSet)request.getAttribute("rs");
if(rs!=null)
{
 while(rs.next()) { %>
    <tr>
<%      for(int col=1; col<=4; col++) { %>
        <td align="center" style="height:150px;font-size:12px" ><%=rs.getString(col)%></td>
        
        <% } %>
    </tr>
<% }

} %>
</table>
</div>
</body>
</html>