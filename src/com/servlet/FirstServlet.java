package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	//life cycle method
ServletConfig conf;
	@Override
	public void destroy() {
System.out.println("destroying====3rd step ");		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this servlet created by gufran";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		conf=config;
		System.out.println("creating object...1step");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
System.out.println("servicing=====2step");
//set the content type of responce
res.setContentType("text/html");
PrintWriter writer = res.getWriter();
writer.println("<h1>this is my out put from servlet </h1>");
writer.println("<h1>today data and time is "+new Date().toString() +"</h1>");
	}
  
}
