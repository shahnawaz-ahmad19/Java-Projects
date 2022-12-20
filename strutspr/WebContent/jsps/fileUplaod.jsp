<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>File Upload</title>
</head>
<body>

 
<s:actionerror />

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
   <div id="wb_Image3" style="margin: 0pt; padding: 0pt; position: absolute; left: 4px; top: 181px; width: 200px; height: 262px; text-align: left; z-index: 11;">
<img src="images/Cute-baby-boy-photo-collection.jpg" id="Image3" alt="" border="0" style="width: 200px; height: 362px; left: 0px; top: 9px;"></div>
    
    
<div id="wb_Form1" style="position: absolute; background-color: rgb(225, 230, 240); left: 300px; top: 210px; width: 400px; height: 249px; z-index: 8;">
<form name="Form1" method="post" action="upload" enctype="multipart/form-data" id="Form1" onsubmit="return ValidateForm1(this)">
<font style="font-size:17px;" color="red"><s:actionerror/></font>

<div id="wb_Text1" style="margin: 0pt; padding: 0pt; position: absolute; left: 16px; top: 50px; width: 200px; height: 16px; text-align: left; z-index: 1;">
<font style="font-size:15px" color="#003399" face="Arial">Upload your file</font></div>
<input type="file" id="Editbox2" name="myFile" style="position:absolute;left:150px;top:40px;width:200px;height:40px;border:1px #C0C0C0 solid;font-family:Arial;font-size:13px;z-index:3" name="pass" value="">
<input type="submit" value="Upload" id="ImageButton1" style="position:absolute;left:152px;top:122px;z-index:5">
</form>
</div>
</body>
</html>