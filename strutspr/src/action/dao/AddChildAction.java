package action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class AddChildAction {
private String childname,age,alert;
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}


private int childid;
public String getChildname() {
	return childname;
}
public void setChildname(String childname) {
	this.childname = childname;
}
public String getAlert() {
	return alert;
}
public void setAlert(String alert) {
	this.alert = alert;
}
public int getChildid() {
	return childid;
}
public void setChildid(int childid) {
	this.childid = childid;
}


private String res; 
Connection con=null;

public String execute()
{
	System.out.println(alert);
	System.out.println(age);
	System.out.println(childid);
	System.out.println(childname);
try
{
	con=ConnectionAction.getCon();
	PreparedStatement pst=con.prepareStatement("insert into child_vacc values(?,?,?,?,?)");
	PreparedStatement pst1=con.prepareStatement("insert into child_schedule values(?,?,?,?)");
	
	pst.setInt(1,childid);
	pst.setString(2,childname);
	pst.setString(3,age);
	pst.setString(4,alert);
	HttpSession sess=ServletActionContext.getRequest().getSession();
	pst.setString(5,(String)sess.getAttribute("name"));
	int i=pst.executeUpdate();
	pst.close();
	if(i>0)
	{  
		ServletActionContext.getRequest().getSession().setAttribute("updateprofile","Child Info is Added Successfully");
		res="success";
	}
	else
	{
		res="exception";
	}
	pst1.setInt(3,childid);
	pst1.setString(2,childname);
	pst1.setString(1,(String)sess.getAttribute("name"));
	pst1.setString(4,"");
	pst1.executeUpdate();
	pst1.close();
	
}
catch(Exception e)
{
	System.out.println(e);
	res="exception";
}
return res;
}


}
