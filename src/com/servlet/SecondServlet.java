package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> servlet2</title>");
		out.println("</head>");
		out.println("<body>");
		String name = request.getParameter("name");
		out.println("<h1>hii ,"+name+"welcome to back my website</h1>");
		out.println("<h1>thankyou</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
