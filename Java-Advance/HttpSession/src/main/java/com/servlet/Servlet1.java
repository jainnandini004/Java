//HTTP Session Demo1

package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		response.getWriter().println("<br/>");
		
		response.getWriter().println("Hello, "+name+ " you are succssesfully Logged In.");
		
		response.getWriter().println("<br/>");
		response.getWriter().println("<br/>");
		
		//create session object
		HttpSession h1=request.getSession();
		
		h1.setAttribute("name",name);//send name as session tracking
		
		response.getWriter().println(" if you want to logout, then click the below button.");
		
		response.getWriter().println("<br/>");
		response.getWriter().println("<br/>");
		
		response.getWriter().println("<form action='Servlet2'>");
		response.getWriter().println("<input type='submit' value='Log Out'>");
		response.getWriter().println("</form>");
	}
	}

