package com.kv.proxy.static_;

import com.kv.proxy.UserManager;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: 代理类</p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-11 下午2:10:55
 *
 * @author kevin
 * @version 1.1
 */
public class UserManagerImplProxy implements UserManager {
	
	private UserManager userManager;
	
	public UserManagerImplProxy(UserManager userManager) {
		this.userManager = userManager;
	}

	@Override
	public void addUser(String userId, String name) {
		System.out.println("start --> addUser() userId ---> " + userId);
		userManager.addUser(userId, name);
		System.out.println("success --> addUser() ...");
	}

	@Override
	public void delUser(String userId) {
		System.out.println(" start --> delUser() userId ---> " + userId);
		userManager.delUser(userId);
		System.out.println(" success --> delUser() ...");
	}

	@Override
	public void modifyUser(String userId, String name) {
		System.out.println(" start --> modifyUser() userId ---> " + userId);
		userManager.modifyUser(userId, name);
		System.out.println(" success --> modifyUser() ...");
	}

	@Override
	public String findUser(String userId) {
		System.out.println(" start --> addUser() userId ---> " + userId);
		
		return userManager.findUser(userId);
	}

}
