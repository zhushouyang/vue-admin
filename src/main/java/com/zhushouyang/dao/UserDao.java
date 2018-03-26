package com.zhushouyang.dao;

import java.util.Map;

import com.zhushouyang.model.User;

public interface UserDao {

	User getUserInfo(Map<String, Object> map);

}
