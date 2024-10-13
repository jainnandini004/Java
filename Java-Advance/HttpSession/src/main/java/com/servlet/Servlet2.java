//HTTP Session Demo1


package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		String name=(String) session.getAttribute("name");//taken out the name which is send by servlet1 as session tracking
		response.getWriter().println( name+ " you successfully Logged Out.");
		
	}

}
