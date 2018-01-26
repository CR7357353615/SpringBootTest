package com.lho.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lho.demo.bean.User;
import com.lho.demo.dao.UserMapper;


public interface IUserService {
	String printUser(User user);

	String queryUser();
}
