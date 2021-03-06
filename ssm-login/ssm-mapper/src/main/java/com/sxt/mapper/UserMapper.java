package com.sxt.mapper;

import java.util.List;

import com.sxt.pojo.User;

public interface UserMapper {
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 */
	public User login(String username,String password);
	
	
	/**
	 * 展示
	 */
	public List<User> findAll();
}
