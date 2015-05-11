package com.kv.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kv.thread.User;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-11 下午1:46:43
 *
 * @author kevin
 * @version 1.1
 */
// 1、表示是一个配置信息提供类
@Configuration
public class Beans {

	// 2、定义一个Bean
	@Bean(name = "user")
	public User buildCar() {
		User user = User.getThreadInstance();
		user.setName("test");
		user.setAge(11);
		return user;
	}
}
