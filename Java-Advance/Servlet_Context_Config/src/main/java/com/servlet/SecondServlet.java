package com.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletConfig config = this.getServletConfig();
		
		String value = config.getInitParameter("url");
		
		response.getWriter().println("<h1>" + value + "</h1>");
		
		
		
        ServletContext context = this.getServletContext();	
		String value2 = context.getInitParameter("firm");
		response.getWriter().println("<h1>" + value2 + "</h1>");    
	}

}
