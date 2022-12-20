package action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ViewScheduleAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String childname;
	private int childid;
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
	
	String res;
	Connection con=null;
	
	public String execute()
	{
	try
	{	
		con=ConnectionAction.getCon();
		PreparedStatement pst=con.prepareStatement("select * from child_schedule where username=? and child_name=? and child_id=?");
		pst.setString(1,(String)ServletActionContext.getRequest().getSession().getAttribute("name"));
		pst.setString(2,childname);
		pst.setInt(3,childid);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{		
			ServletActionContext.getRequest().setAttribute("rs_schedule",rs);
			res="success";	
			
		}
		else
		{
				res="fail";
				this.addActionError("Invalid Details");
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
