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
	if (n.length()<3) {
		request.getRequestDispatcher("SecondServlet").forward(request, response);
	}
	if (n.equalsIgnoreCase("max")) {
		response.sendRedirect("https://scrimba.com/");
//		request.getRequestDispatcher("https://scrimba.com/").forward(request, response);	
	}
	
	
	else {
		request.getRequestDispatcher("index.html").include(request, response);
	}
	
	}

}
