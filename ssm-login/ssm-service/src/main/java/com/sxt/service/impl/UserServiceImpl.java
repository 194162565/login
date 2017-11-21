package com.sxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxt.mapper.UserMapper;
import com.sxt.pojo.User;
import com.sxt.service.UserSerivce;

@Service
public class UserServiceImpl implements UserSerivce{

	//需要userMapper
	@Autowired
	private UserMapper userMapper;
	/**
	 * 登录
	 */
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.login(username, password);
	}
	
	
	/**
	 * 展现
	 */
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

}
