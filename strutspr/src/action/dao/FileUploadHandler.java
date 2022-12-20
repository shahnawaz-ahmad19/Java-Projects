package action.dao;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
* Servlet to handle File upload request from Client

*/
public class FileUploadHandler extends HttpServlet {
   private final String UPLOAD_DIRECTORY = "UserProfile";
 
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
	      String page=null;
       System.out.println("file Uplaod Called ...........");
	      //process only if its multipart content
       if(ServletFileUpload.isMultipartContent(request)){
           try {
               List<FileItem> multiparts = new ServletFileUpload(
                                        new DiskFileItemFactory()).parseRequest(request);
              String path=null;
              String name=null;
              HttpSession session = request.getSession();
              String userId = (String)session.getAttribute("name");
              page = (String)session.getAttribute("page");
               for(FileItem item : multiparts){
                   if(!item.isFormField()){
                       name = new File(item.getName()).getName();
                       name= userId+".jpg";
                       System.out.println("name "+name);
                       System.out.println( getServletContext().getRealPath(UPLOAD_DIRECTORY)+ File.separator + name);
                       path =getServletContext().getRealPath(UPLOAD_DIRECTORY)+ File.separator + name;
                       item.write( new File(getServletContext().getRealPath(UPLOAD_DIRECTORY) + File.separator + name));
                   }
               }
          
              //File uploaded successfully
              request.setAttribute("message", "File Uploaded Successfully");
              request.setAttribute("name","userProfile/"+name);
           } catch (Exception ex) {
              request.setAttribute("message", "File Upload Failed due to " + ex);
           }          
        
       }else{
           request.setAttribute("message",
                                "Sorry this Servlet only handles file upload request");
       }
   
       request.getRequestDispatcher("jsp/welcome_user_body.jsp").forward(request, response);
    
   }
 
}
