package com.kv.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-4-29 上午10:50:53
 *
 * @author kevin
 * @version 1.1
 */
public class PrivateCarReflect {

	public static void main(String[] args) throws Throwable {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.kv.reflect.PrivateCar");
		PrivateCar car = (PrivateCar) clazz.newInstance();
		
		Field colorFld = clazz.getDeclaredField("color");
		// 取消Java语言访问检查以访问private变量
		colorFld.setAccessible(true);
		colorFld.set(car, "蓝色");
		
		Method driveMtd = clazz.getDeclaredMethod("drive", (Class[]) null);
		// 取消Java语言访问检查以访问protected方法
		driveMtd.setAccessible(true);
		driveMtd.invoke(car, (Object[]) null);
	}
	
}
