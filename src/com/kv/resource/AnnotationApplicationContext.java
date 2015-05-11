package com.kv.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
 * @date 2015-5-11 下午3:08:46
 *
 * @author kevin
 * @version 1.1
 */
public class AnnotationApplicationContext {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		User user = ctx.getBean("user", User.class);
		System.out.println(user.toString());
	}
	
}
