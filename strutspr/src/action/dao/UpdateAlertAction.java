package action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class UpdateAlertAction {

	private String childname,alert;
	private int childid;
	Connection con;
	String res;
	public String getChildname() {
		return childname;
	}

	public void setChildname(String childname) {
		this.childname = childname;
	}

	public int getChildid() {
		return childid;
	}

	public void setChildid(int childid) {
		this.childid = childid;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}
	
	
	public String execute()
	{
		System.out.println(alert);
		System.out.println(childid);
		System.out.println(childname);
	try
	{
		con=ConnectionAction.getCon();
		PreparedStatement pst=con.prepareStatement("update child_vacc set alert_type=? where child_id=? and child_name=? and username=?");
		pst.setInt(2,childid);
		pst.setString(3,childname);
		pst.setString(1,alert);
		HttpSession sess=ServletActionContext.getRequest().getSession();
		pst.setString(4,(String)sess.getAttribute("name"));
		int i=pst.executeUpdate();
		pst.close();
		if(i>0)
		{  
			ServletActionContext.getRequest().getSession().setAttribute("updateprofile","Alert type is updated successfully");
			res="success";
		}
		else
		{
			ServletActionContext.getRequest().getSession().setAttribute("updateprofile","Alert not updated.It may be due to invalid Input");
			res="fail";
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		res="res";
	}
	return res;
	}

	
	
	
}
