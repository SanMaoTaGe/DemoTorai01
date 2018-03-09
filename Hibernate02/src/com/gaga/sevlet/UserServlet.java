package com.gaga.sevlet;

import java.io.IOException;
import java.nio.file.attribute.UserPrincipalLookupService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaga.service.UserService;


public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String to = request.getParameter("to");
		String from = request.getParameter("from");
		
		double money = Double.parseDouble(request.getParameter("money"));
		
		//调用业务处理
		UserService userService = new UserService();
		
		boolean flag= userService.transfer(to,from,money);
		
		//响应
		if (flag) {
			
			response.getWriter().println("sucess-----------");
		} else {
			response.getWriter().println("failed-----------");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
