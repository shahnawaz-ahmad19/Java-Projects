package action.dao;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFile extends ActionSupport{
   private File myFile;
   private String myFileContentType;
   private String myFileFileName;
   private String destPath;
   private final String UPLOAD_DIRECTORY = "UserProfile";
   
   public String execute()
   {
	      String page=null;
	      
    System.out.println("file Uplaod Called ...........");
	      //process only if its multipart content
    
    HttpServletRequest request=ServletActionContext.getRequest();
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
                    System.out.println( ServletActionContext.getServletContext().getRealPath(UPLOAD_DIRECTORY)+ File.separator + name);
                    path =ServletActionContext.getServletContext().getRealPath(UPLOAD_DIRECTORY)+ File.separator + name;
                    item.write( new File(ServletActionContext.getServletContext().getRealPath(UPLOAD_DIRECTORY) + File.separator + name));
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

   // request.getRequestDispatcher("jsp/welcome_user_body.jsp").forward(request, response);
 
    return "success";
}
   public File getMyFile() {
      return myFile;
   }
   public void setMyFile(File myFile) {
      this.myFile = myFile;
   }
   public String getMyFileContentType() {
      return myFileContentType;
   }
   public void setMyFileContentType(String myFileContentType) {
      this.myFileContentType = myFileContentType;
   }
   public String getMyFileFileName() {
      return myFileFileName;
   }
   public void setMyFileFileName(String myFileFileName) {
      this.myFileFileName = myFileFileName;
   }
}