package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("in generic servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int second1 = Integer.parseInt(req.getParameter("n1"));
		int second2 = Integer.parseInt(req.getParameter("n2"));
		int mul=second1*second2;
		int s1 = (int) req.getAttribute("k");
		out.println("<h1>this is our  servlet1 >>>>>"+s1+"</h1>");
		out.println("<h1>this is our  servlet2 >>>>>"+mul+"</h1>");
	}

}
