package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Response;

public class ServletDemo4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int mul=(int)request.getAttribute("mul");
		int sq=mul*mul;
		PrintWriter out= response.getWriter();
		out.println("Square of the multiplication of two number is "+sq);
		//Redirection done from ServletDemo3 to ServletDemo4
	}

}
