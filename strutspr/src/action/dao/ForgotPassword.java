package action.dao;
import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import servlets.EmailUtility;
public class ForgotPassword {

private String username,fathername,mothername,mob,email;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getFathername() {
	return fathername;
}

public void setFathername(String fathername) {
	this.fathername = fathername;
}

public String getMothername() {
	return mothername;
}

public void setMothername(String mothername) {
	this.mothername = mothername;
}

public String getMob() {
	return mob;
}

public void setMob(String mob) {
	this.mob = mob;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String execute()
{ String res="success";
	Connection con=null;
	try
	{
		System.out.println("forword Action called ");
		con=ConnectionAction.getCon();
		PreparedStatement pst=con.prepareStatement("select password from login_vacc where username=? and  email=?");
		pst.setString(1,username);
		pst.setString(2,email);
		ResultSet rs=pst.executeQuery();
		String resultMessage = "";
		if(rs.next())
		{
			String pass=rs.getString("password");
			System.out.println("pass "+pass);
			
			ServletContext context = ServletActionContext.getServletContext();
			String host = context.getInitParameter("host");
			String port = context.getInitParameter("port");
			String adminuser = context.getInitParameter("user");
			String adminpass = context.getInitParameter("pass");
		
			
			String recipient = email;
			String subject = "Vaccination : Your Requested Password ";
			String content = "Your password for your account user name :"+username +" Password : "+pass +" .Please try to login .";
			
			

			try {
				EmailUtility.sendEmail(host, port, adminuser, adminpass, recipient, subject,
						content);
				resultMessage = "Your password sent to your registerd  e-mail  successfully . please check it once and login again ";
			} catch (Exception ex) {
				ex.printStackTrace();
				resultMessage = "There were an error: " + ex.getMessage();
			} finally {
				
			}

			ServletActionContext.getRequest().setAttribute("pass",resultMessage);
			//request.getRequestDispatcher("/PasswordEmailSendingServlet").forward(request,response); 
		}
		else
		{
			ServletActionContext.getRequest().setAttribute("pass","no");
			System.out.println("record not found");
		}
		
	}catch(Exception ex)
	{
		System.out.println(ex);
		res="exception";
	}
	return res;
	
}
}
