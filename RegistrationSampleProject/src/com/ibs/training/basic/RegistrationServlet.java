package com.ibs.training.basic;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		System.out.println("Server Side...");
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		String radio = request.getParameter("gender");
		String option = request.getParameter("select");
		
		if(name.isEmpty()|| pass.isEmpty()|| radio==null || option.isEmpty()){
			try {
				response.sendRedirect("error.html");
			} catch (IOException e) {
				System.out.println("IO Exception happend");
			}
		}
		else{
			try {
				response.sendRedirect("success.html");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
			
		
		
		
	}

}
