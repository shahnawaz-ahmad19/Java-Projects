package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter	out=response.getWriter();
     String	n = request.getParameter("n");
     String p = request.getParameter("p");
     
     ServletConfig config = getServletConfig();
    String nmm = config.getInitParameter("a");
    out.println("config "+nmm);
     
     
     ServletContext application = getServletContext();
     String pas = application.getInitParameter("pass");
     out.println("context----web-->"+pas);
     
     application.setAttribute("n", n.toUpperCase());
     
     
     HttpSession s = request.getSession();
       s.setAttribute("nm", n.toUpperCase());
     
     out.println(n +" firstservlet "+ p);
     out.println("<a href=SecondServlet?name="+n+"&phone="+p+">Nexxxt</a>");
     
	}

}
