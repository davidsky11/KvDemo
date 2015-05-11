package com.kv.proxy;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: 接口</p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-11 下午2:07:07
 *
 * @author kevin
 * @version 1.1
 */
public interface UserManager {

	public void addUser(String userId, String name);
	
	public void delUser(String userId);
	
	public void modifyUser(String userId, String name);
	
	public String findUser(String userId);
}
