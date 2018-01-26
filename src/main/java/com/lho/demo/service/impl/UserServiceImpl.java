package com.lho.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lho.demo.bean.User;
import com.lho.demo.dao.UserMapper;
import com.lho.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public String printUser(User user) {
		return "姓名：" + user.getName() + "; 年龄：" + user.getAge();
	}

	@Override
	public String queryUser() {
		User user = userMapper.selectByPrimaryKey(1);
		return user.toString();
	}

}
