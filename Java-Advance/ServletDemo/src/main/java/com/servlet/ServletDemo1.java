package com.servlet;

import java.io.IOException;
//there are 3 ways to define your own servlet-HTTPServlet(1 method), GenericServlet(1 method) and Servlet(5 method)
import java.io.PrintWriter; 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			int a=Integer.parseInt(request.getParameter("num1"));
			int b=Integer.parseInt(request.getParameter("num2"));
			int sum=a+b;
			//System.out.println("Sum is "+sum);//Display on the console
			PrintWriter out =response.getWriter();//Display in the browser
			//out.println("<h2>");//not work with browser
			out.println("Sum of two number "+ sum);
			//out.println("</h2>");
		}
}
}