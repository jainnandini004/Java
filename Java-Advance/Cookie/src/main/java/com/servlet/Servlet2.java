//Cookie Demo1 

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;


@WebServlet("/Servlet2")//if we use @WebServlet then we can save the effort on creating web.xml
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		javax.servlet.http.Cookie[] cookie=request.getCookies();//extract the cookie values
		response.getWriter().println("Hey "+(String)cookie[0].getValue() + " having password "+ (String)cookie[1].getValue()+" you successfully logged in to the next site.");
		
		
	}

}
