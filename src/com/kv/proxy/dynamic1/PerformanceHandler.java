package com.kv.proxy.dynamic1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
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
 * @date 2015-5-13 下午3:32:38
 *
 * @author kevin
 * @version 1.1
 */
public class PerformanceHandler implements InvocationHandler {

	private Object target;
	
	public PerformanceHandler() {
		
	}
	
	public PerformanceHandler(Object target) {
		this.target = target;
	}
	
	public Object newProxyInstance(Object target) {
		this.target = target;
		
		// 第一个参数，目标的装载器
		// 第二个参数，目标接口，为每一个接口生成代理
		// 第三个参数，调用实现了InvocationHandler的对象，当你一调用代理，代理就会调用InvocationHandler的invoke方法
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
		target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName());
		// 通过反射方法调用业务类的目标方法
		Object obj = method.invoke(target, args);
		PerformanceMonitor.end();
		return obj;
	}
	
}
