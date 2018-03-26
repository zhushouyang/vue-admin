package com.zhushouyang.service.impl;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhushouyang.dao.UserDao;
import com.zhushouyang.mapper.UserMapper;
import com.zhushouyang.model.User;
import com.zhushouyang.service.LoginService;


@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserInfo(Map<String, Object> map) {
		return userDao.getUserInfo(map);
	}

}
