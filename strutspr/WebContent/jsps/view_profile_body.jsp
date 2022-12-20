<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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

<script type="text/javascript">
<!--
function ValidateForm1(theForm)
{
   var regexp;
   regexp = /^[A-Za-z&#402;&#352;&#338;&#381;&#353;&#339;&#382;&#376;ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ \t\r\n\f]*$/;
   if (!regexp.test(theForm.Editbox1.value))
   {
      alert("Please enter only letter and whitespace characters in the \"father name\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value == "")
   {
      alert("Please enter a value for the \"father name\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value.length < 1)
   {
      alert("Please enter at least 1 characters in the \"father name\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value.length > 60)
   {
      alert("Please enter at most 60 characters in the \"father name\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   regexp = /^[A-Za-z&#402;&#352;&#338;&#381;&#353;&#339;&#382;&#376;ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ \t\r\n\f]*$/;
   if (!regexp.test(theForm.Editbox2.value))
   {
      alert("Please enter only letter and whitespace characters in the \"mother name\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value == "")
   {
      alert("Please enter a value for the \"mother name\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value.length < 1)
   {
      alert("Please enter at least 1 characters in the \"mother name\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value.length > 60)
   {
      alert("Please enter at most 60 characters in the \"mother name\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox3.value == "")
   {
      alert("Please enter a value for the \"username\" field.");
      theForm.Editbox3.focus();
      return false;
   }
   if (theForm.Editbox3.value.length < 2)
   {
      alert("Please enter at least 2 characters in the \"username\" field.");
      theForm.Editbox3.focus();
      return false;
   }
   if (theForm.Editbox3.value.length > 50)
   {
      alert("Please enter at most 50 characters in the \"username\" field.");
      theForm.Editbox3.focus();
      return false;
   }
   if (theForm.Editbox4.value == "")
   {
      alert("Please enter a value for the \"password\" field.");
      theForm.Editbox4.focus();
      return false;
   }
   if (theForm.Editbox4.value.length < 4)
   {
      alert("Please enter at least 4 characters in the \"password\" field.");
      theForm.Editbox4.focus();
      return false;
   }
   if (theForm.Editbox4.value.length > 30)
   {
      alert("Please enter at most 10 characters in the \"password\" field.");
      theForm.Editbox4.focus();
      return false;
   }
   if (theForm.Editbox5.value == "")
   {
      alert("Please enter a value for the \"reenter password\" field.");
      theForm.Editbox5.focus();
      return false;
   }
   if (theForm.Editbox5.value.length < 4)
   {
      alert("Please enter at least 4 characters in the \"reenter password\" field.");
      theForm.Editbox5.focus();
      return false;
   }
   if (theForm.Editbox5.value.length > 30)
   {
      alert("Please enter at most 10 characters in the \"reenter password\" field.");
      theForm.Editbox5.focus();
      return false;
   }
   if (theForm.Editbox5.value != theForm.Editbox4.value)
   {
      alert("password and confirm password must be identical");
      theForm.Editbox5.focus();
      return false;
   }
   regexp = /^[-+]?\d*\.?\d*$/;
   if (!regexp.test(theForm.Editbox6.value))
   {
      alert("Please enter only digit characters in the \"mobile number\" field.");
      theForm.Editbox6.focus();
      return false;
   }
   if (theForm.Editbox6.value == "")
   {
      alert("Please enter a value for the \"mobile number\" field.");
      theForm.Editbox6.focus();
      return false;
   }
   if (theForm.Editbox6.value.length < 10)
   {
      alert("Please enter at least 10 characters in the \"mobile number\" field.");
      theForm.Editbox6.focus();
      return false;
   }
   if (theForm.Editbox6.value.length > 11)
   {
      alert("Please enter at most 11 characters in the \"mobile number\" field.");
      theForm.Editbox6.focus();
      return false;
   }
   regexp = /^([0-9a-z]([-.\w]*[0-9a-z])*@(([0-9a-z])+([-\w]*[0-9a-z])*\.)+[a-z]{2,6})$/i;
   if (!regexp.test(theForm.Editbox7.value))
   {
      alert("Please enter a valid email address.");
      theForm.Editbox7.focus();
      return false;
   }
   if (theForm.Editbox7.value == "")
   {
      alert("Please enter a value for the \"email-id\" field.");
      theForm.Editbox7.focus();
      return false;
   }
   if (theForm.Editbox7.value.length < 10)
   {
      alert("Please enter at least 10 characters in the \"email-id\" field.");
      theForm.Editbox7.focus();
      return false;
   }
   if (theForm.Editbox7.value.length > 40)
   {
      alert("Please enter at most 40 characters in the \"email-id\" field.");
      theForm.Editbox7.focus();
      return false;
   }
   if (theForm.TextArea1.value == "")
   {
      alert("Please enter a value for the \"address\" field.");
      theForm.TextArea1.focus();
      return false;
   }
   if (theForm.TextArea1.value.length < 1)
   {
      alert("Please enter at least 1 characters in the \"address\" field.");
      theForm.TextArea1.focus();
      return false;
   }
   if (theForm.TextArea1.value.length > 200)
   {
      alert("Please enter at most 200 characters in the \"address\" field.");
      theForm.TextArea1.focus();
      return false;
   }
   return true;
}
//-->
</script>

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
   <%
   ResultSet rs=(ResultSet)session.getAttribute("viewProfile");
   rs.next();
    %>
   <br><div id="wb_Image2" style="margin: 0pt; padding: 0pt; position: absolute; left: 805px; top: 186px; width: 200px; height: 287px; text-align: left; z-index: 9;">
<img src="images/profimedia-0002987057.jpg" id="Image2" alt="" border="0" style="width: 200px; height: 350px; top: -8px; left: 0px;"></div>


<div id="wb_Form1" style="position: absolute; background-color: rgb(225, 230, 240); left: 306px; top: 157px; width: 374px; height: 366px; z-index: 18;">
<form name="Form1" method="post" action="updateProfile" enctype="application/x-www-form-urlencoded" id="Form1" onsubmit="return ValidateForm1(this)">

<div id="wb_Text1" style="margin: 0pt; padding: 0pt; position: absolute; left: 2px; top: 2px; width: 40px; height: 9px; text-align: left; z-index: 0;">
<a href="user_login_success2_action"><font style="font-size:14px" color="brown" face="Arial">Back</font></a></div>

<div id="wb_Text1" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 90px; width: 86px; height: 16px; text-align: left; z-index: 0;">
<font style="font-size:14px" color="#003399" face="Arial">Father Name</font></div>
<div id="wb_Text2" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 60px; width: 85px; height: 16px; text-align: left; z-index: 1;">
<font style="font-size:14px" color="#003399" face="Arial">Mother Name</font></div>
<div id="wb_Text3" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 30px; width: 70px; height: 16px; text-align: left; z-index: 2;">
<font style="font-size:14px" color="#003399" face="Arial">UserName</font></div>
<div id="wb_Text4" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 120px; width: 72px; height: 16px; text-align: left; z-index: 3;">
<font style="font-size:14px" color="#003399" face="Arial">Password</font></div>
<div id="wb_Text5" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 150px; width: 120px; height: 16px; text-align: left; z-index: 4;">
<font style="font-size:14px" color="#003399" face="Arial">Reenter Password</font></div>
<div id="wb_Text6" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 180px; width: 79px; height: 16px; text-align: left; z-index: 5;">
<font style="font-size:14px" color="#003399" face="Arial">Mobile No</font></div>
<div id="wb_Text7" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 210px; width: 66px; height: 16px; text-align: left; z-index: 6;">
<font style="font-size:14px" color="#003399" face="Arial">Email-Id</font></div>
<div id="wb_Text8" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 240px; width: 59px; height: 16px; text-align: left; z-index: 7;">
<font style="font-size:14px" color="#003399" face="Arial">Address</font></div>
<input type="text" id="Editbox1" style="border: 1px solid rgb(192, 192, 192); position: absolute; left: 200px; top: 90px; width: 130px; height: 22px; background-color: rgb(255, 255, 255);  font-family: Arial; font-size: 13px; z-index: 8;" name="fathername" value="<%=rs.getString("father_name")%>">
<input type="text" id="Editbox2" style="border: 1px solid rgb(192, 192, 192); position: absolute; left: 200px; top: 60px; width: 130px; height: 22px; background-color: rgb(255, 255, 255);  font-family: Arial; font-size: 13px; z-index: 9;" name="mothername" value="<%=rs.getString("mother_name")%>">
<input type="text" id="Editbox3" style="position:absolute;left:200px;top:30px;width:130px;height:22px;border:1px #C0C0C0 solid;background-color:lightgray;Arial;font-size:13px;z-index:10" name="username" value="<%=rs.getString("username")%>" readonly="readonly" >
<input type="password" id="Editbox4" style="position:absolute;left:200px;top:120px;width:130px;height:22px;border:1px #C0C0C0 solid;background-color:;font-family:Arial;font-size:13px;z-index:11" name="pass" value="<%=rs.getString("password")%>">
<input type="password" id="Editbox5" style="position:absolute;left:200px;top:150px;width:130px;height:22px;border:1px #C0C0C0 solid;background-color:;font-family:Arial;font-size:13px;z-index:12" name="repass" value="<%=rs.getString("repassword")%>">
<input type="text" id="Editbox6" style="position:absolute;left:200px;top:180px;width:130px;height:22px;border:1px #C0C0C0 solid;background-color:font-family:Arial;font-size:13px;z-index:13" name="mob" value="<%=rs.getString("mob")%>">
<input type="text" id="Editbox7" style="position:absolute;left:200px;top:210px;width:130px;height:22px;border:1px #C0C0C0 solid;background-color:font-family:Arial;font-size:13px;z-index:14" name="email" value="<%=rs.getString("email")%>">
<textarea name="address" id="TextArea1" style="position:absolute;left:200px;top:240px;width:130px;height:75px;border:1px #C0C0C0 solid;background-color:font-family:Arial;font-size:13px;z-index:15" rows="5" cols="27" ><%=rs.getString("address")%></textarea>
<input type="submit" id="Button1" name="" value="Update & Save" style="position:absolute;left:210px;top:320px;;font-family:Arial;font-weight:;font-size:13px;z-index:16">
</form>
</div><div id="wb_Image3" style="margin: 0pt; padding: 0pt; position: absolute; left: 4px; top: 181px; width: 200px; height: 262px; text-align: left; z-index: 11;">
<img src="images/Cute-baby-boy-photo-collection.jpg" id="Image3" alt="" border="0" style="width: 200px; height: 362px; left: 0px; top: 9px;"></div>
    
    
    </body>
</html>

