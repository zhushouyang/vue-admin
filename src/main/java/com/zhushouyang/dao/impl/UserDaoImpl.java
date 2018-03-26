package com.zhushouyang.dao.impl;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhushouyang.common.dao.CommonDao;
import com.zhushouyang.dao.UserDao;
import com.zhushouyang.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	CommonDao commondao;

	@Override
	public User getUserInfo(Map<String, Object> map) {
		return (User) commondao.query("getUserInfo", map);
	}

}
