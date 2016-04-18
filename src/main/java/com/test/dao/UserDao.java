package com.test.dao;

import javax.annotation.Resource;

import com.test.model.User;

@Resource
public interface UserDao {

	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	
}