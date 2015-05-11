package com.kv.reflect;

import java.lang.reflect.Constructor;
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
 * @date 2015-4-29 上午9:26:12
 *
 * @author kevin
 * @version 1.1
 */
public class ReflectTest {

	public static Person initByDefaultConst() throws Throwable {
		// 通过类装载器获取Person类对象
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.kv.reflect.Person");
		
		// 获取类的默认构造器对象并通过它实例化Person
		Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
		Person person = (Person) cons.newInstance();
		
		// 通过反射方法设置属性
		Method setName = clazz.getMethod("setName", String.class);
		setName.invoke(person, "kevin");
		Method setAge = clazz.getMethod("setAge", int.class);
		setAge.invoke(person, 1);
		Method setSex = clazz.getMethod("setSex", char.class);
		setSex.invoke(person, 'm');
		Method setAddress = clazz.getMethod("setAddress", String.class);
		setAddress.invoke(person, "TEST_ADDR");
		
		return person;
	}
	
	public static void main(String[] args) throws Throwable {
		Person person = initByDefaultConst();
		System.out.println(person.toString());
	}
}
