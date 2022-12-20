<%@ taglib uri="/struts-tags" prefix="s"%>
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
   background-image: url(images/loginbody_bkgrnd.png);
   color: #000000;
}
</style>
<script type="text/javascript">
<!--
function ValidateForm1(theForm)
{
   if (theForm.Editbox1.value == "")
   {
      alert("Please enter a value for the \"UserName\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value.length < 2)
   {
      alert("Please enter at least 2 characters in the \"UserName\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value.length > 50)
   {
      alert("Please enter at most 50 characters in the \"UserName\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox2.value == "")
   {
      alert("Please enter a value for the \"password\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value.length < 4)
   {
      alert("Please enter at least 4 characters in the \"password\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value.length > 30)
   {
      alert("Please enter at most 30 characters in the \"password\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   return true;
}
//-->
</script>
</head>
<body>
<div id="wb_Form1" style="position: absolute; background-color: rgb(225, 230, 240); left: 362px; top: 210px; width: 285px; height: 249px; z-index: 8;">
<form name="Form1" method="post" action="loginAction" enctype="application/x-www-form-urlencoded" id="Form1" onsubmit="return ValidateForm1(this)">
<font style="font-size:17px;" color="red"><s:actionerror/></font>
<input type="text" id="Editbox1" style="position:absolute;left:110px;top:47px;width:130px;height:22px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:0" name="username" value="">
<div id="wb_Text1" style="margin: 0pt; padding: 0pt; position: absolute; left: 16px; top: 50px; width: 89px; height: 16px; text-align: left; z-index: 1;">
<font style="font-size:14px" color="#003399" face="Arial">Username</font></div>
<div id="wb_Text2" style="margin: 0pt; padding: 0pt; position: absolute; left: 17px; top: 85px; width: 80px; height: 16px; text-align: left; z-index: 2;">
<font style="font-size:14px" color="#003399" face="Arial">Password</font></div>
<input type="password" id="Editbox2" style="position:absolute;left:110px;top:82px;width:130px;height:22px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:3" name="pass" value="">
<div id="wb_Text3" style="margin: 0pt; padding: 0pt; position: absolute; left: 94px; top: 178px; width: 176px; height: 19px; text-align: left; z-index: 4;">
<font style="font-size:14px" color="#003399" face="Arial"><a href="homeDispatch">Click here for Registration</a></font></div>
<input type="submit" value="login" id="ImageButton1" style="position:absolute;left:152px;top:122px;z-index:5">
<div id="wb_Text4" style="margin: 0pt; padding: 0pt; position: absolute; left: 102px; top: 205px; width: 145px; height: 20px; text-align: left; z-index: 6;">
<font style="font-size:14px" color="#FF0000" face="Arial"><a href="forgotDispatch">Forgot Your Password</a></font></div>
</form>
</div>
</body>
</html>