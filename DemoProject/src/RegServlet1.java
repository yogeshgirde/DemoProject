import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;
@WebServlet("/reg")
public class RegServlet1 extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
  {
     try
       {
          PrintWriter pw=res.getWriter();
         Enumeration en=req.getParameterNames();
        
          while(en.hasMoreElements())
             {
              String s1=(String)en.nextElement();
              String s2[]=req.getParameterValues(s1);
               for(String s3:s2)
               {
              pw.println(s3);
               }
             }
        }catch(Exception e)
          {
            System.err.println(e);
          }
       }
   }