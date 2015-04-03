package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.io.*;
import java.util.*;
import java.io.File;
import java.lang.Exception;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

public final class file_005fupload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("   <head>\n");
      out.write("     <title>File Upload Example</title>\n");
      out.write("   </head>\n");
      out.write("\n");
      out.write("   <body>\n");
      out.write("     <h1>Data Received at the Server</h1>\n");
      out.write("     <hr/>\n");
      out.write("     <p>\n");
      out.write("\n");

if (ServletFileUpload.isMultipartContent(request)){
   ServletFileUpload servletFileUpload = new ServletFileUpload(new
DiskFileItemFactory());
   List fileItemsList = servletFileUpload.parseRequest(request);

   String optionalFileName = "";
   FileItem fileItem = null;

   Iterator it = fileItemsList.iterator();
   while (it.hasNext()){
     FileItem fileItemTemp = (FileItem)it.next();
     if (fileItemTemp.isFormField()){

      out.write("\n");
      out.write("\n");
      out.write("<b>Name-value Pair Info:</b><br/>\n");
      out.write("Field name: ");
      out.print( fileItemTemp.getFieldName() );
      out.write("<br/>\n");
      out.write("Field value: ");
      out.print( fileItemTemp.getString() );
      out.write("<br/><br/>\n");
      out.write("\n");

       if (fileItemTemp.getFieldName().equals("filename"))
         optionalFileName = fileItemTemp.getString();
     }
     else
       fileItem = fileItemTemp;
   }

   if (fileItem!=null){
     String fileName = fileItem.getName();

      out.write("\n");
      out.write("\n");
      out.write("<b>Uploaded File Info:</b><br/>\n");
      out.write("Content type: ");
      out.print( fileItem.getContentType() );
      out.write("<br/>\n");
      out.write("Field name: ");
      out.print( fileItem.getFieldName() );
      out.write("<br/>\n");
      out.write("File name: ");
      out.print( fileName );
      out.write("<br/>\n");
      out.write("File size: ");
      out.print( fileItem.getSize() );
      out.write("<br/><br/>\n");
      out.write("\n");

     /* Save the uploaded file if its size is greater than 0. */
     if (fileItem.getSize() > 0){
       if (optionalFileName.trim().equals(""))
         fileName = FilenameUtils.getName(fileName);
       else
         fileName = optionalFileName;

       String dirName = "E:\\New folder\\";

       File saveTo = new File(dirName + fileName);

       //-------------------------------------------------------

       try {

Mongo mongo = new Mongo("localhost", 27017);
DB db = mongo.getDB("imagedb");
DBCollection collection = db.getCollection("dummyColl");

String newFileName = fileName;

File imageFile = saveTo;
request.setAttribute("myCreatedObject" , imageFile );

// create a "photo" namespace
GridFS gfsPhoto = new GridFS(db, "photo");

// get image file from local drive
GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);

// set a new filename for identify purpose
gfsFile.setFilename(newFileName);

// save the image file into mongoDB
gfsFile.save();


} catch (UnknownHostException e) {
e.printStackTrace();
} catch (MongoException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
       try {
         fileItem.write(saveTo);

      out.write("\n");
      out.write("\n");
      out.write("<b>The uploaded file has been saved successfully.</b>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

       }
       catch (Exception e){
       e.printStackTrace();

      out.write("\n");
      out.write("\n");
      out.write("<b>An error occurred when we tried to save the uploaded file.</b>\n");
      out.write("\n");

       }
     }
   }
}

      out.write("\n");
      out.write("\n");
      out.write("     </p>\n");
      out.write("   </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
