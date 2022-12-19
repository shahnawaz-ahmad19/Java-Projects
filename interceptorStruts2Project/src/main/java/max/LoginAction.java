package max;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	String uName;
	String pass;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String execute() {
		System.out.println("in action :::"+uName);
		return "ss";
	}
	

}
