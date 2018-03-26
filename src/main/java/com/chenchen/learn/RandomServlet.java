package com.chenchen.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RandomServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i = (int) (Math.random() * 100);
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		p.println("<p>" + i + "</p>");
		p.close();
	}
}
