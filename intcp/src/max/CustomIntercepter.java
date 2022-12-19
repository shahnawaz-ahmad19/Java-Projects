package max;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class CustomIntercepter implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		ValueStack stack = ai.getStack();
		String un = stack.findString("uname");
		String p = stack.findString("pass");
		
//		stack.setValue("uname", un.toUpperCase());
		
		if(un.equalsIgnoreCase(p))
		{
			return ai.invoke();
		}
		
		return "fail";
		
		
		
		
	}

}
