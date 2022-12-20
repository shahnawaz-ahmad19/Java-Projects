<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

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
   if (theForm.Editbox1.value == "")
   {
      alert("Please enter a value for the \"Child Id\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox2.value.length < 2)
   {
      alert("Please enter at least 2 characters in the \"Child Name\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value == "")
   {
      alert("Please enter a value for the \"Child Name\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value.length > 50)
   {
      alert("Please enter at most 50 characters in the \"Child Name\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value == "")
   {
      alert("Please enter a value for the \"Child Name\" field.");
      theForm.Editbox2.focus();
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
   
<br>
<div id="wb_Image2" style="margin: 0pt; padding: 0pt; position: absolute; left: 805px; top: 186px; width: 200px; height: 287px; text-align: left; z-index: 9;">
<img src="images/profimedia-0002987057.jpg" id="Image2" alt="" border="0" style="width: 200px; height: 350px; top: -8px; left: 0px;"></div>
<br>
<div id="wb_Image3" style="margin: 0pt; padding: 0pt; position: absolute; left: 4px; top: 181px; width: 200px; height: 262px; text-align: left; z-index: 11;">
<img src="images/Cute-baby-boy-photo-collection.jpg" id="Image3" alt="" border="0" style="width: 200px; height: 362px; left: 0px; top: 9px;">
</div>
   
   
<div id="wb_Form1" style="position: absolute; background-color: rgb(225, 230, 240); left: 341px; top: 220px; width: 341px; height: 200px; z-index: 12;">
<form name="Form1" method="post" action="viewSchedule" enctype="application/x-www-form-urlencoded" id="Form1" onsubmit="return ValidateForm1(this)">

<div id="wb_Text1" style="margin: 0pt; padding: 0pt; position: absolute; left: 2px; top: 2px; width: 40px; height: 9px; text-align: left; z-index: 0;">
<a href="user_login_success2_action"><font style="font-size:14px" color="brown" face="Arial">Back</font></a>
</div>

<div id="wb_Text1" style="margin: 0pt; padding: 0pt; position: absolute; left: 70px; top: 10px; width: 162px; height: 9px; text-align: left; z-index: 0;">
<font style="font-size:14px;" color="red" face="Arial"><s:actionerror/></font>
</div>

   
<input type="text" id="Editbox1" style="border: 1px solid rgb(192, 192, 192); position: absolute; left: 170px; top: 47px; width: 130px; height: 22px; font-family: Arial; font-size: 13px; z-index: 0;" name="childid" value="" >
<input type="text" id="Editbox2" style="border: 1px solid rgb(192, 192, 192); position: absolute; left: 170px; top: 77px; width: 130px; height: 22px; font-family: Arial; font-size: 13px; z-index: 1;" name="childname" value="">
<input type="submit" id="Button1" name="" value="View Schedule" style="position:absolute;left:185px;top:110px;width:100px;height:25px;font-family:Arial;font-weight:;font-size:13px;z-index:2">
<div id="wb_Text2" style="margin: 0pt; padding: 0pt; position: absolute; left: 40px; top: 50px; width: 96px; height: 24px; text-align: left; z-index: 3;">
<font style="font-size:14px" color="#003399" face="Arial">Child Id<b><br></b></font>
</div>
<div id="wb_Text3" style="margin: 0pt; padding: 0pt; position: absolute; left: 40px; top: 80px; width: 86px; height: 16px; text-align: left; z-index: 4;">
<font style="font-size:14px" color="#003399" face="Arial">Child Name<b><br></b></font>
</div><br>
</form>
</div>
    
    
    </body>
</html>
