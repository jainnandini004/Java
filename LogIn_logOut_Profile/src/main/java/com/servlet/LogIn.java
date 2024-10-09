package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("index1.html").include(request, response);  
          
        String name=request.getParameter("uname");  
        String password=request.getParameter("upass");  
          
        if(password.equals("")){  
        	out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("index2.html").include(request, response);   
        }  
        else{  
        	out.print(name+" you are successfully Logged In.");  
            HttpSession session=request.getSession();  
            session.setAttribute("name",name);   
        }  
        out.close();  
	}

}
