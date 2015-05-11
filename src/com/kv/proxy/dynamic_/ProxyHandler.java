package com.kv.proxy.dynamic_;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: 采用JDK动态代理必须实现InvocationHandler接口，采用Proxy类创建相应的代理类</p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-11 下午2:25:52
 *
 * @author kevin
 * @version 1.1
 */
public class ProxyHandler implements InvocationHandler {
	
	private Object target;
	
	/**
	 * 目标的初始化方法，根据目标生成代理类
	 * @param target
	 * @return
	 * Return: Object
	 * @author: kevin 
	 * @date: 2015-5-11 下午2:28:52
	 */
	public Object newProxyInstance(Object target) {
		this.target = target;
		
		// 第一个参数，目标的装载器
		// 第二个参数，目标接口，为每一个接口生成代理
		// 第三个参数，调用实现了InvocationHandler的对象，当你一调用代理，代理就会调用InvocationHandler的invoke方法
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}

	/**
	 * 反射，这样你可以在不知道具体的类的情况下，根据配置的参数区调用一个类的方法。
	 * 在灵活编程的时候非常有用。
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("start --> " + method.getName());
		for (int i = 0; i < args.length; i++) {
			// 打印调用目标方法的参数
			System.out.println(args[i]);
		}
		
		Object ret = null;
		try {
			// 调用目标方法
			ret = method.invoke(target, args);
			// 执行成功，打印成功信息
			System.out.println("success --> " + method.getName());
		} catch (Exception e) {
			e.printStackTrace();
			// 失败时，打印失败信息
			System.out.println("error --> " + method.getName());
			throw e;
		}
		
 		return ret;
	}

}
