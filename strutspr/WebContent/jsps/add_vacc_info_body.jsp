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
      alert("Please enter a value for the \"vaccinename\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value.length < 1)
   {
      alert("Please enter at least 1 characters in the \"vaccinename\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox1.value.length > 100)
   {
      alert("Please enter at most 100 characters in the \"vaccinename\" field.");
      theForm.Editbox1.focus();
      return false;
   }
   if (theForm.Editbox2.value == "")
   {
      alert("Please enter a value for the \"Age\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value.length < 1)
   {
      alert("Please enter at least 1 characters in the \"Age\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox2.value.length > 10)
   {
      alert("Please enter at most 10 characters in the \"Age\" field.");
      theForm.Editbox2.focus();
      return false;
   }
   if (theForm.Editbox4.value == "")
   {
      alert("Please enter a value for the \"Disease\" field.");
      theForm.Editbox4.focus();
      return false;
   }
   if (theForm.Editbox4.value.length < 1)
   {
      alert("Please enter at least 1 characters in the \"Disease\" field.");
      theForm.Editbox4.focus();
      return false;
   }
   if (theForm.Editbox4.value.length > 60)
   {
      alert("Please enter at most 60 characters in the \"Disease\" field.");
      theForm.Editbox4.focus();
      return false;
   }
   if (theForm.TextArea1.value.length < 1)
   {
      alert("Please enter at least 1 characters in the \"description\" field.");
      theForm.TextArea1.focus();
      return false;
   }
   if (theForm.TextArea1.value.length > 4000)
   {
      alert("Please enter at most 4000 characters in the \"description\" field.");
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
     
   <b> Welcome:</b>
   <font style="font-size: 15px;" color="pink">
    <s:property value="#session.name"/>
    </font> | <font color="blue"><a href="homeDispatch">SignOut</a></font></div>


<div id="wb_TextArt1" style="margin: 0pt; padding: 0pt; position: absolute; left: 1px; top: 176px; width: 189px; height: 38px; text-align: center; z-index: 1;">
<img src="images/img0008.png" id="TextArt1" alt="Member Zone" title="Member Zone" style="border-width: 0pt; width: 217px; height: 36px; left: 0px; top: 0px;"></div>



<div id="wb_Image2" style="margin: 0pt; padding: 0pt; position: absolute; left: 781px; top: 212px; width: 251px; height: 287px; text-align: left; z-index: 9;">
<img src="images/vaccine(1).jpg" id="Image2" alt="" border="0" style="width: 300px; height: 316px; top: -29px;"></div>

<div id="wb_Image3" style="margin: 0pt; padding: 0pt; position: absolute; left: 3px; top: 227px; width: 251px; height: 262px; text-align: left; z-index: 11;">
<img src="images/M7150492-Assorted_vaccines-SPL.jpg" id="Image3" alt="" border="0" style="width: 250px; height: 300px; left: 0px; top: 0px;"></div>


<div id="wb_TextArt3" style="margin: 0pt; padding: 0pt; position: absolute; left: 374px; top: 176px; width: 277px; height: 32px; text-align: center; z-index: 10;">
<font color="green" style="font-size: 25px;">Add Vaccine</font>
</div>

<div id="wb_Form1" style="position: absolute; background-color: rgb(225, 230, 240); left: 323px; top: 206px; width: 376px; height: 299px; z-index: 11;">
<form name="Form1" method="post" action="addVaccAction" enctype="application/x-www-form-urlencoded" id="Form1" onsubmit="return ValidateForm1(this)">


<center><font color="green" style="font-size: 20px;"><s:property value="#session.add_vacc"/></font></center>
<div id="wb_Text4" style="margin: 0pt; padding: 0pt; position: absolute; left: 8px; top: 161px; width: 108px; height: 25px; text-align: left; z-index: 0;">
<font style="font-size:14px" color="#003399" face="Arial">Description</font></div>
<input type="text" id="Editbox1" style="border: 1px solid rgb(192, 192, 192); position: absolute; left: 143px; top: 25px; width: 130px; height: 23px; font-family: Arial; font-size: 13px; z-index: 1;" name="vaccname" value="">
<div id="wb_Text1" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 30px; width: 124px; height: 25px; text-align: left; z-index: 2;">
<font style="font-size:14px" color="#003399" face="Arial">Vaccine Name</font></div>
<input type="text" id="Editbox2" style="border: 1px solid rgb(192, 192, 192); position: absolute; left: 143px; top: 65px; width: 130px; height: 23px; font-family: Arial; font-size: 13px; z-index: 3;" name="age" value="">
<div id="wb_Text2" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 70px; width: 61px; height: 25px; text-align: left; z-index: 4;">
<font style="font-size:14px" color="#003399" face="Arial">Age</font></div>
<div id="wb_Text3" style="margin: 0pt; padding: 0pt; position: absolute; left: 10px; top: 112px; width: 83px; height: 23px; text-align: left; z-index: 5;">
<font style="font-size:14px" color="#003399" face="Arial">Disease</font></div>
<input type="text" id="Editbox4" style="position:absolute;left:143px;top:105px;width:130px;height:23px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:6" name="disease" value="">
<input type="submit" id="Button1" name="" value="Add" style="position:absolute;left:210px;top:260px;font-family:Arial;font-size:14px;z-index:7">
<textarea name="description" id="TextArea1" style="position:absolute;left:143px;top:145px;width:198px;height:100px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:8" rows="5" cols="20"></textarea>
</form>
</div>

</body>
</html>