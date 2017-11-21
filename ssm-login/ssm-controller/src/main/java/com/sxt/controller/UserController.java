package com.sxt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sxt.pojo.User;
import com.sxt.service.UserSerivce;

@Controller
public class UserController {
	@Autowired
	private UserSerivce userSerivce;
	
	/**
	 * 登录
	 */
	@RequestMapping("login")
	public String login(String username,String password){
		User login = userSerivce.login(username, password);
		if(login != null){
			return "ok";
		}else{
			return "error";
		}
	}
	
	/**
	 * 展现
	 */
	@RequestMapping("findAll")
	@ResponseBody
	public List<User> findAll(){
		return userSerivce.findAll();
	}
}
