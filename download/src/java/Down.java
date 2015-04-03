
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import com.mongodb.MongoClient;
import java.io.DataInputStream;
import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.bson.types.ObjectId;

@WebServlet(urlPatterns = {"/Down"})
public class Down extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
static final long serialVersionUID = 1L;
    private static final int BUFSIZE = 4096;
   String fileName;
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        DB db = mongoClient.getDB("smart");
     
        String dbFileName = request.getParameter("myFile");
        
       
           
        GridFS gfs = new GridFS(db,"files");
        GridFSDBFile gfsFile1 = gfs.findOne(dbFileName);
        fileName = gfsFile1.getFilename();
        File outFile = new File(fileName);
    	File file = outFile;
        int length   = 0;
     
        try (ServletOutputStream outStream = response.getOutputStream())
        {
            response.setContentType("text/html");
            response.setContentLength((int)file.length());
            response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
         
            byte[] byteBuffer = new byte[BUFSIZE];
            try (DataInputStream in = new DataInputStream(new FileInputStream(file)))
                {
                    while ((in != null) && ((length = in.read(byteBuffer)) != -1))
                    {
                        outStream.write(byteBuffer,0,length);
                    }
                }
        }
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    }
@Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>
}


