package com.ibs.webtraining.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginControllerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		 
		String name= request.getParameter("username");
		//response.sendRedirect("success.html");
		PrintWriter out = response.getWriter();
		out.print("Welcome "+name);
		
	}

}
