package com.zhushouyang.login.dto;

import com.zhushouyang.common.dto.BaseDTO;

public class User extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -993389425031060754L;

	private String userName;
	
	private String userId;
	
	private String age;
	
	private String departmentId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
	

}
