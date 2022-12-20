package action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateVaccSchedule extends ActionSupport

{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String childname,age;
private int childid;
public String getChildname() {
	return childname;
}
public void setChildname(String childname) {
	this.childname = childname;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public int getChildid() {
	return childid;
}
public void setChildid(int childid) {
	this.childid = childid;
}
	
String res;
Connection con=null;


public String execute()
{
try
{	
	con=ConnectionAction.getCon();
	PreparedStatement pst=con.prepareStatement("select * from child_schedule where child_id=? and child_name=? and username=?");
	pst.setInt(1,childid);
	pst.setString(2,childname);
	pst.setString(3,(String)ServletActionContext.getRequest().getSession().getAttribute("name"));
	ResultSet rs=pst.executeQuery();
	rs.next();	
	String tv =rs.getString("taken_vaccine");
	PreparedStatement pst1=con.prepareStatement("update child_schedule set taken_vaccine=? where child_id=?");
	
	if(tv==null)
	{
		tv="";
		tv=tv+age+",";
		pst1.setString(1, tv);
		pst1.setInt(2,childid );
		pst1.executeUpdate();
		ServletActionContext.getRequest().getSession().setAttribute("updateprofile","Vaccine is Successfully Added");
		res="success";
	}
	else
	{
		if(tv.contains(age))
		 {
			ServletActionContext.getRequest().getSession().setAttribute("updateprofile","Age is Already Added to Schedule");
			res="exist";
		 }	
		else
		{
			tv=tv+age+",";
			pst1.setString(1, tv);
			pst1.setInt(2,childid );
			pst1.executeUpdate();
			ServletActionContext.getRequest().getSession().setAttribute("updateprofile","Vaccine is Successfully Added");
			res="success";
		}
		
	}
						
	}
catch(Exception e)
{
	System.out.println(e);
	res="exception";
}

return res;
}


}
