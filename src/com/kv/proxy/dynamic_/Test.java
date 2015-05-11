package com.kv.proxy.dynamic_;

import com.kv.proxy.UserManager;
import com.kv.proxy.UserManagerImpl;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-11 下午2:34:38
 *
 * @author kevin
 * @version 1.1
 */
public class Test {

	public static void main(String[] args) {
		ProxyHandler proxy = new ProxyHandler();
		UserManager userManager = (UserManager) proxy.newProxyInstance(new UserManagerImpl());
		
		String name = userManager.findUser("007");
		System.out.println("client.main --> " + name);
	}
	
}
