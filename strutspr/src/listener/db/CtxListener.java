package listener.db;
import javax.servlet.*;

import action.dao.ConnectionAction;
public class CtxListener implements ServletContextListener {
	public static String path;
	public void contextDestroyed(ServletContextEvent c) {
		
	}
	public static String getPath()
	{
		return path;
		
	}
	public void contextInitialized(ServletContextEvent c) {
		ServletContext ctx=c.getServletContext();
		
		String param=ctx.getInitParameter("createTables");
		path=ctx.getRealPath("");
		
		System.out.println("veerpal/???????????" +path);
		
		ConnectionAction.CreateCon(path);
		if (param.equals("yes"))
		{
			System.out.println("creating tables...");
			DBInitializer db=new DBInitializer();
			db.createTables(path);
			
			
			System.out.println("creating tables again...");
		}
	}

}
