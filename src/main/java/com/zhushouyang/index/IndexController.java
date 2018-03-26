package com.zhushouyang.index;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	
	@RequestMapping("/index.do")
	public String index(HttpServletRequest request,HttpServletResponse response) {
		return "欢迎登陆系统";
	}
}
