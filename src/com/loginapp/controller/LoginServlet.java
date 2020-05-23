package com.loginapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginapp.dto.User;
import com.loginapp.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId, password;
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		
		LoginService service = new LoginService();
		boolean result = service.authentice(userId, password);
		
		if(result) {
			User user = service.getUserDetails(userId);
			request.setAttribute("user", user);
			/*
			 * Request dispatcher is used to pass the same request to new page without sending a 
			 * new request, so same session can be used between pages
			 */
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			//request.getSession().setAttribute("user", user);
			//response.sendRedirect("success.jsp");
			return;
		}else {
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
