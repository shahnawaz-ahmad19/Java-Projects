package action.dao;

import java.sql.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class DeleteVaccineAction {
public String execute()
{
	String res=null;

	try
	{
		Connection con=null;
		con=ConnectionAction.getCon();
		
		HttpServletRequest rq=ServletActionContext.getRequest();
		String age=rq.getParameter("age");
		String vaccine=rq.getParameter("vaccine");
		String description=rq.getParameter("description");
		String disease=rq.getParameter("disease");
		PreparedStatement pstmt=con.prepareStatement("delete from vacc_info where age=? and vaccine=? and description=? and disease=?");
		pstmt.setString(1,age);
		pstmt.setString(2,vaccine);
		pstmt.setString(3,description);
		pstmt.setString(4,disease);
		int i=pstmt.executeUpdate();
		pstmt.close();
		if(i>0)
		{
			res="success";
			HttpSession ses=rq.getSession();
			ses.setAttribute("delete_vacc","Record is deleted successfully");
		}
		else
		{
			System.out.println("not deleted");
			res="exception";
		}
		
	}
	catch(Exception e)
	{	
		res="exception";
		System.out.println(e);
	}
	return res;
}
	
}
