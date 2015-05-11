package com.kv.proxy;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: 目标对象</p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-11 下午2:09:03
 *
 * @author kevin
 * @version 1.1
 */
public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String userId, String name) {
		System.out.println("UserManagerImpl.addUser() ---> " + userId);
	}

	@Override
	public void delUser(String userId) {
		System.out.println("UserManagerImpl.delUser() ---> " + userId);
	}

	@Override
	public void modifyUser(String userId, String name) {
		System.out.println("UserManagerImpl.modifyUser() ---> " + userId);
	}

	@Override
	public String findUser(String userId) {
		System.out.println("UserManagerImpl.findUser() ---> " + userId);
		return "test";
	}

}
