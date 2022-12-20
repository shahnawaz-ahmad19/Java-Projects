package listener.count;
import javax.servlet.*;
import javax.servlet.http.*;
public class CountListener implements ServletContextListener,HttpSessionListener
{
public void contextInitialized(ServletContextEvent se)
{
ServletContext ctx=se.getServletContext();
ctx.setAttribute("tcounter",1);
ctx.setAttribute("ccounter",0);
System.out.println("context object is created...");
}
public void contextDestroyed(ServletContextEvent se)
{
System.out.println("context object is destroyed...");
}
public void sessionCreated(HttpSessionEvent he)
{
}
public void sessionDestroyed(HttpSessionEvent he)
{
ServletContext se=he.getSession().getServletContext();
Integer cobj=(Integer)se.getAttribute("ccounter");
if(cobj>0)
{
cobj--;
se.setAttribute("ccounter",cobj);
}

}

}



