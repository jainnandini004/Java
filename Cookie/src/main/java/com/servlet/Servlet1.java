//Cookie Demo1 

package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")//if we use @WebServlet then we can save the effort on creating web.xml
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		response.getWriter().println("<br/>");
		
		response.getWriter().println("Hello, "+name+ " you are succssesfully Logged In.");
		
		response.getWriter().println("<br/>");
		response.getWriter().println("<br/>");
		
		//create cookie object
		Cookie cookie1=new Cookie("c1",name);
		Cookie cookie2=new Cookie("c2",pass);
		
		//add cookie object for response 
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.getWriter().println(name+" if you want to go to next site, then click the below button.");
		
		response.getWriter().println("<br/>");
		response.getWriter().println("<br/>");
		
		response.getWriter().println("<form action='Servlet2'>");
		response.getWriter().println("<input type='submit' value='CLICK HERE'>");
		response.getWriter().println("</form>");
	}

}
