package javaServlet1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class JavaServlet1 extends HttpServlet {

	 public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	 {
		 response.setContentType("text/html");
		 PrintWriter pw =  response.getWriter();
		 pw.println("<h1>welcome to servlets</h1>");
	 }
}
