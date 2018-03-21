package com.chenchen.learn;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//1.使用request接收请求数据
		//请求行(3)
		System.out.println("协议类型:"+req.getProtocol());
		System.out.println("访问路径:"+req.getServletPath());
		System.out.println("请求方式:"+req.getMethod());
		
		//消息头(N)
		//该数据是按照简直对的方式存储的
		//是一个古老的迭代器，其用法和Interator相似.
		Enumeration<String> e=req.getHeaderNames();
		while(e.hasMoreElements()) {
			String key=e.nextElement();
			String value=req.getHeader(key);
			System.out.println(key+":"+value);
		}
		
		
		//实体内容（一套）
		//本案例浏览器没有向服务器发送这样的数据，我们在后面案例中演示
		
		//2.使用response发送相应数据
		//1)状态好行
		//此数据通常由服务器自动填写
		//获取服务器的时间
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		String now=sdf.format(date);
		
		//2)消息头
		//大部分的消息头数据由服务器自动填写
		//只有contectType必须由我们填写
		//将时间拼到一个网页里给浏览器返回
		//告诉浏览器向它发送的是什么类型的内容
		res.setContentType("text/html");
		//获取输出流，该流指向的目标是浏览器。
		PrintWriter w=res.getWriter();
		
		//3)实体内容
		//服务器向浏览器发送的具体内容，本案例输出的网页就是实体内容
		//此处偷懒，拼一个简化版的网页
		w.println("<p>" +now+ "</p>");
		//关闭输出流
		w.close();
	}
	 
}
