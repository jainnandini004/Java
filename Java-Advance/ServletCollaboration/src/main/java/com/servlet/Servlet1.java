//Request Dispatcher


package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		PrintWriter out=response.getWriter();
		out.println("Welcome to Servlet1");
		out.println("</br>");
		out.println("Hello "+name+" your password is "+pass);
		
		RequestDispatcher rd=request.getRequestDispatcher("Servlet2"); 
		//rd.forward(request, response);//only servlet 2 data considered
		out.println("</br>");
		
		rd.include(request, response); //servlet 1 and 2 both data considered
		
	}

}
