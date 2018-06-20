package com.lho.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.mybatis.spring.annotation.MapperScan;
import com.lho.demo.service.IUserService;

@RequestMapping("/user")
@RestController
@SpringBootApplication(scanBasePackages="com.lho")
@MapperScan("com.lho.demo.dao")
public class UserController extends SpringBootServletInitializer {
	@Autowired
	@Qualifier("userServiceImpl")
	IUserService userService;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UserController.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(UserController.class, args);
	}

	@RequestMapping("/print")
	public String printUser(){
		return "456";
	}
}
