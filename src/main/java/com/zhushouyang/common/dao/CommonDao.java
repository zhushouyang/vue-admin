package com.zhushouyang.common.dao;

import java.awt.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("commonDao")
public class CommonDao{
	
	@Resource
	private SqlSessionTemplate sessionTemplate;
	
	public void insert(String statementId, Object insertObject) {
		try {
			this.sessionTemplate.insert(statementId, insertObject);
		}catch(Exception e) {
			
		}
	}
	
	public void delete(String statementId, Object deleteObject) {
		try {
			this.sessionTemplate.delete(statementId, deleteObject);
		}catch(Exception e){
			
		}
	}
	
	public void update(String statementId, Object updateObject) {
		try {
			this.sessionTemplate.update(statementId, updateObject);
		}catch(Exception e) {
			
		}
	}
	
	public Object query(String statementId, Object queryObject) {
		return this.sessionTemplate.selectOne(statementId, queryObject);
	}
	
	
	public List queryList(String statementId,Object queryObject) {
		return (List) this.sessionTemplate.selectList(statementId, queryObject);
	}
	
	public List queryList(String statementId,Object queryObject,int pageNo,int pageSize) {
		int start = (pageNo-1)*pageSize;
		RowBounds rowBounds = new RowBounds(start, pageSize);
		return (List) this.sessionTemplate.selectList(statementId, queryObject, rowBounds);
	}
	
	
	
	
}
