//Invalidate Session

package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet3")
public class InvalidateSession_DateTime extends HttpServlet {
	
	int count;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		
	
		//create the HttpSession object
		
		HttpSession session = request.getSession(true);
		
		if(session.isNew())
		{
			pw.println("welcome to new user");	
			pw.println("<br/>");
			count=0;
			
		}
		
		else
		{
			pw.println("welcome back");
			count++;
			pw.println("<br/>");
		}
			pw.println("session creation time: " + new Date(session.getCreationTime()));
			pw.println("<br/>");
			pw.println("session last accessed time: " + new Date(session.getLastAccessedTime()));
			pw.println("<br/>");
			pw.println("session id: " + session.getId());
			pw.println("<br/>");
			pw.println("visited count: " + count);
			
		if(count>=5)
		{
			//destroying the session after executing 5 times
			session.invalidate();
			
		}
		
	}

}
