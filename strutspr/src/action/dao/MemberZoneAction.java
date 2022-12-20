package action.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.struts2.ServletActionContext;

public class MemberZoneAction {

	String res;
	public String execute()
	{
		try
		{
				Connection con=null;
				con=ConnectionAction.getCon();
				PreparedStatement pst=con.prepareStatement("select username,mob,email,member_no from login_vacc");
				ResultSet rs=pst.executeQuery();
				ServletActionContext.getRequest().setAttribute("rs",rs);
				res="success";
		}
		catch(Exception e)
		{
			System.out.println(e);
			res="exception";
		}
		return res;
	}
}
