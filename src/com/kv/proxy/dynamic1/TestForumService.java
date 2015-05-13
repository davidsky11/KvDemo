package com.kv.proxy.dynamic1;

import java.lang.reflect.Proxy;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-13 下午3:13:49
 *
 * @author kevin
 * @version 1.1
 */
public class TestForumService {

	public static void main(String[] args) {
		// 希望被代理的目标业务类
		ForumService target = new ForumServiceImpl();
		// 将目标业务类和横切代码编织到一起
		PerformanceHandler handler = new PerformanceHandler();
		// 根据编织了目标业务类逻辑和性能就爱你是横切逻辑的InvocationHandler实例创建代理实例
		ForumService proxy = (ForumService) handler.newProxyInstance(target);
		
		// 调用代理实例
		proxy.removeForum(10);
		proxy.removeTopic(1012);
	}
	
}
