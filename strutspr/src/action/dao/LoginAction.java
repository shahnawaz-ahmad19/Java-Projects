package action.dao;
import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String username;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

private String pass; 
String res;
Connection con=null;
public void setPass(String pass)
{
this.pass=pass;
}
public String getPass()
{
return pass;
}

public String execute()
{
try
{	
	con=ConnectionAction.getCon();
	PreparedStatement pst=con.prepareStatement("select * from login_vacc where username=? and password=?");
	Statement stmt=con.createStatement();
	ResultSet rs_tc=stmt.executeQuery("select * from login_vacc");
	int i=0;
	while(rs_tc.next())
	{	i++;
		
	}
	pst.setString(1,username);
	pst.setString(2,pass);

	ResultSet rs=pst.executeQuery();
	if(rs.next())
	{		int type=0;	
			HttpSession sess=ServletActionContext.getRequest().getSession();
			String check_current_user=(String)sess.getAttribute("name");
			if(check_current_user==null)
			{
			System.out.println("************");
			sess.setAttribute("name",rs.getString("username"));
			sess.setAttribute("member_no",rs.getInt("member_no"));
			ServletContext ctx=ServletActionContext.getServletContext();
			ctx.setAttribute("tcounter",i);
			int cc=(Integer)ctx.getAttribute("ccounter");	
			cc++;
			ctx.setAttribute("ccounter",cc);
			type=rs.getInt("type");
			}
		if(type==2)
			{
				res="admin_success";
			}
		else
			{
				
				res="user_success";
			}
		
	}	
	else
	{
		this.addActionError("Invalid UserName or Password!!!");
		res="fail";	
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




