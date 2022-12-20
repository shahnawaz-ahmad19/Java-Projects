package servlets;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*; 
public class DownLoadServlet extends HttpServlet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
response.setHeader("content-disposition","attachment;filename=vacc_chart.html");
response.setContentType("aplication/octet-stream");
OutputStream out=response.getOutputStream();
String downPath=this.getServletContext().getRealPath("htmls");
FileInputStream fin=new FileInputStream(downPath+"\\vacc_chart.html");
byte b[]=new byte[fin.available()];
fin.read(b);
out.write(b);
out.close();
fin.close();
}
}

