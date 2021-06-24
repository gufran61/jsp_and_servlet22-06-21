package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out .println("<h2>welcome</h2>");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("usergender");
		String condition = req.getParameter("condition");
		if(condition!=null) {
		if(condition.equals("checked")) {
			out.println("<h2>name : " + username +"</h2>");
			out.println("<h2>password : " + password +"</h2>");
			out.println("<h2>email : " + email +"</h2>");
			out.println("<h2>gender : " + gender +"</h2>");
			out.println("<h2>condition : " + condition +"</h2>");
		}else {
			out.println("you have not accepted terms and condition");
		}}else {out.println("you have not accepted terms and condition");}
	}

}
