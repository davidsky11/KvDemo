package com.kv.proxy.static_;

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
 * @date 2015-5-11 下午2:15:10
 *
 * @author kevin
 * @version 1.1
 */
public class Test {

	public static void main(String[] args) {
		UserManager userManager = new UserManagerImpl();
//		userManager.addUser("1", "test");
		
		UserManager proxy = new UserManagerImplProxy(userManager);
		proxy.addUser("1", "test");
	}
	
}
