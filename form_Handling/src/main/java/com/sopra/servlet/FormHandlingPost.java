package com.sopra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormHandlingPost extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x=Integer.parseInt(request.getParameter("a"));
		int y=Integer.parseInt(request.getParameter("b"));
		int p=x+y;
		int q=x-y;
		PrintWriter pw=response.getWriter();
		pw.println("<h1>");
		pw.println("Sum with the help of Post= "+p);
		pw.println("Sum with the help of Post= "+q);
		pw.println("<h1>");	
	}
}
