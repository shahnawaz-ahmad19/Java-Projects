package max;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out	= response.getWriter();
		String n= request.getParameter("n");
		String p = request.getParameter("p");
		out.println("First Servlet "+n+" "+p);
		
		out.println("<html><body><form action='SecondServlet' method='get'>");
		out.println("<table border='3'>");
		out.println("<tr><td>Name</td><td><input type='hidden' name='nn' value=' "+n+" '></td></tr>");
		out.println("<tr><td><input type='submit'></td></tr>");
		out.println("</table></form></body></html>");
	
	}

}
