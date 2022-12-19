package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter	out=response.getWriter();
	     String	n = request.getParameter("name");
	     String p = request.getParameter("phone");
	     
	     HttpSession s= request.getSession(false);
	    String nn = (String) s.getAttribute("nm");
	     
	    out.println("session----->" +nn );
	     out.println(" second servlet "+p +" "+n);
	     
	     ServletContext application = getServletContext();
	     String nme = (String) application.getAttribute("n");
	     out.println("context " + nme);
	     
	     String pas = application.getInitParameter("pass");
	     out.println("context---second-web-->"+pas);
	}

}
