package com.sopra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FormHandlingGet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x=Integer.parseInt(request.getParameter("a"));
		int y=Integer.parseInt(request.getParameter("b"));
		int z=x+y;
		PrintWriter pw=response.getWriter();
		pw.println("<h1>");
		pw.println("Sum with the help of Get = "+z);
		pw.println("<h1>");	
	}

}
