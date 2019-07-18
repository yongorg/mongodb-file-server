package com.waylau.spring.boot.fileserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World 控制器
 * @author yongz
 * @date 2019年1月26日
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit yongz.club!";
	}
}
