package com.zhushouyang.common.dto;

import java.sql.Date;

public class BaseDTO implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3999943172141490881L;
	
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	

}
