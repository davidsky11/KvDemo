package com.kv.reflect;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-4-29 上午10:48:23
 *
 * @author kevin
 * @version 1.1
 */
public class PrivateCar {

	// private成员变量：使用传统的类实例调用方式，只能在本类中访问
	private String color;
	
	// protected方法：使用传统的类实例调用方法，只能在子类和本包中访问
	protected void drive() {
		System.out.println("drive private car! the coloe is: " + color);
	}
}
