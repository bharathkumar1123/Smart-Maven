<%@ page import="org.apache.commons.fileupload.*,
org.apache.commons.fileupload.servlet.*,
org.apache.commons.fileupload.disk.*, org.apache.commons.io.*, java.util.*,
java.io.File, java.lang.Exception" %>

<%@ page import="java.io.File" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.net.UnknownHostException" %>
<%@ page import="com.mongodb.DB" %>
<%@ page import="com.mongodb.DBCollection" %>
<%@ page import="com.mongodb.DBCursor" %>
<%@ page import="com.mongodb.Mongo" %>
<%@ page import="com.mongodb.MongoException" %>
<%@ page import="com.mongodb.gridfs.GridFS" %>
<%@ page import="com.mongodb.gridfs.GridFSDBFile" %>
<%@ page import="com.mongodb.gridfs.GridFSInputFile" %>



<html xmlns="http://www.w3.org/1999/xhtml">
   <head>
     <title>File Upload Example</title>
   </head>

   <body>
     <h1>Data Received at the Server</h1>
     <hr/>
     <p>

<%
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
%>

<b>Name-value Pair Info:</b><br/>
Field name: <%= fileItemTemp.getFieldName() %><br/>
Field value: <%= fileItemTemp.getString() %><br/><br/>

<%
       if (fileItemTemp.getFieldName().equals("filename"))
         optionalFileName = fileItemTemp.getString();
     }
     else
       fileItem = fileItemTemp;
   }

   if (fileItem!=null){
     String fileName = fileItem.getName();
%>

<b>Uploaded File Info:</b><br/>
Content type: <%= fileItem.getContentType() %><br/>
Field name: <%= fileItem.getFieldName() %><br/>
File name: <%= fileName %><br/>
File size: <%= fileItem.getSize() %><br/><br/>

<%
     /* Save the uploaded file if its size is greater than 0. */
     if (fileItem.getSize() > 0){
       if (optionalFileName.trim().equals(""))
         fileName = FilenameUtils.getName(fileName);
       else
         fileName = optionalFileName;

       String dirName = "E:\\New folder\\";

       File saveTo = new File(dirName + fileName);

       try {

Mongo mongo = new Mongo("localhost", 27017);
DB db = mongo.getDB("imagedb");


String newFileName = fileName;

File imageFile = new File("c:\\DemoImage.png");
//request.setAttribute("myCreatedObject" , imageFile );

// create a "photo" namespace
GridFS gfsPhoto = new GridFS(db, "photosample");

// get image file from local drive
GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);

// set a new filename for identify purpose
gfsFile.setFilename(newFileName);

// save the image file into mongoDB
gfsFile.save();

        GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
        System.out.println(imageForOutput);





} catch (UnknownHostException e) {
e.printStackTrace();
} catch (MongoException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
       try {
         fileItem.write(saveTo);
%>

<b>The uploaded file has been saved successfully.</b>




<%
       }
       catch (Exception e){
       e.printStackTrace();
%>

<b>An error occurred when we tried to save the uploaded file.</b>

<%
       }
     }
   }
}
%>

     </p>
   </body>
</html>
