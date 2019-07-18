package com.waylau.spring.boot.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring Security 配置类.
 *
 * @author yongz
 * @date 2019年1月26日
 */
@Configuration
@EnableWebMvc
public class SecurityConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 允许跨域请求
		registry.addMapping("/**").allowedOrigins("*") ;
	}
}