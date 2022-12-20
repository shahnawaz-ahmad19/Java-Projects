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
<img src="images/handsome-baby-boy.jpg" id="Image2" alt="" border="0" style="margin-top:10px; width: 220px; height: 300px; top: -8px; left: 0px;">

<!-- <div style="margin-left:60px; margin-top:  -40px;"><a href="uploadPhoto">Edit Profile</a></div>
 -->
</div>
<div id="wb_Form1" style="position: absolute; background-color: rgb(225, 230, 240); left: 331px; top: 185px; width: 356px; height: 302px; z-index: 10;">

<div id="wb_TextArt2" style="margin: 0pt; padding: 0pt; position: absolute; left: 96px; top: 270px; width: 225px; height: 22px; text-align: center; z-index: 4;">
<a href="viewProfile"><font style="font-size: 15px;" color="blue">View & Update DOB Certificate <br></font></a></div>

<div id="wb_TextArt2" style="margin: 0pt; padding: 0pt; position: absolute; left: 96px; top: 70px; width: 155px; height: 22px; text-align: center; z-index: 4;">
<a href="viewProfile"><font style="font-size: 15px;" color="blue">View & Update Profile<br></font></a></div>

<div id="wb_TextArt4" style="margin: 0pt; padding: 0pt; position: absolute; left: 90px; top: 150px; width: 166px; height: 22px; text-align: center; z-index: 3;">&nbsp; 
<a href="viewChildInfo"><font style="font-size: 15px;" color="blue">View Child Info</font></a>
</div>

<div id="wb_TextArt4" style="margin: 0pt; padding: 0pt; position: absolute; left: 94px; top: 190px; width: 166px; height: 22px; text-align: center; z-index: 3;">
<a href="addChildInfo"><font style="font-size: 15px;" color="blue">Add Child Info</font></a>
</div>

<div id="wb_TextArt4" style="margin: 0pt; padding: 0pt; position: absolute; left: 90px; top: 110px; width: 166px; height: 22px; text-align: center; z-index: 3;">
<a href="updateChildSchedule"><font style="font-size: 15px;" color="blue">Update Child Schedule</font></a>
</div>
<div id="wb_TextArt4" style="margin: 0pt; padding: 0pt; position: absolute; left: 95px; top: 230px; width: 166px; height: 22px; text-align: center; z-index: 3;">
<a href="manageAlerts"><font style="font-size: 15px;" color="blue">Manage Alerts</font></a>
</div>

<div id="" style="margin: 0pt; padding: 0pt; position: absolute; left: 0px; top: 10px; width: 344px; height: 18px; text-align: center; z-index: 5;">
<font style="font-size: 15px;" color="green"><s:property value="#session.updateprofile"/></font>
</div>
<div id="wb_TextArt3" style="margin: 0pt; padding: 0pt; position: absolute; left: 0px; top: 20px; width: 344px; height: 44px; text-align: center; z-index: 5;">
<font style="font-size: 25px;" color="">You can perform following tasks</font>
</div>

</div>
<div id="wb_Image3" style="margin: 0pt; padding: 0pt; position: absolute; left: 4px; top: 181px; width: 200px; height: 262px; text-align: left; z-index: 11;">
<img src="images/Cute-baby-boy-photo-collection.jpg" id="Image3" alt="" border="0" style="width: 200px; height: 362px; left: 0px; top: 9px;"></div>
    
    <% 
    try
    {
    session.removeAttribute("updateprofile");
    }
    catch(Exception e)
    {}
    %>
    </body>
</html>
