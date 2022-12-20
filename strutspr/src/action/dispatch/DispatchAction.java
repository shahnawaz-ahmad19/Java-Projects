package action.dispatch;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import action.dao.VaccinfoAction;

public class DispatchAction {
	
	public String register()
	{
		System.out.println("register");
		return "register";	
	}
	public String home()
	{	
		HttpSession sess=ServletActionContext.getRequest().getSession(false);
		if(sess!=null)
		{
		sess.setAttribute("name",null);
		sess.invalidate();
		}
		return "home";
	}
	public String service()
	{
		System.out.println("service");
		return "service";	
	}
	public String vaccinfo()
	{	
		VaccinfoAction.getVaccInfo();
		return "vaccinfo";	
	}
	public String contact()
	{
		return "contact";	
	}
	public String advice()
	{
		System.out.println("advice");
		return "advice";	
	}
	public String login()
	{
		System.out.println("login");
		return "login";	
	}
	public String forgot()
	{
		System.out.println("forgot");
		return "forgot";	
	}
	
	public String uploadPhoto()
	{
		System.out.println("uploadPhoto");
		return "uploadPhoto";	
	}
}
