package max;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction {
String uname;
String pass;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}


public String modi()
{
	System.out.println("in ok action " +uname);
	
return "suc";
}
	
	
}
