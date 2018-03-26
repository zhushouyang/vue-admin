package com.zhushouyang.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhushouyang.service.LoginService;

@RestController
public class LoginController {
	
	@Resource
	private LoginService loginService;

	@RequestMapping("/login.do")
	public String login(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", request.getParameter("userId"));
		return loginService.getUserInfo(map).getUserName();
	}
	

}
