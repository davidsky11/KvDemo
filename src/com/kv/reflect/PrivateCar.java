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
 * @date 2015-4-29 ����10:48:23
 *
 * @author kevin
 * @version 1.1
 */
public class PrivateCar {

	// private��Ա������ʹ�ô�ͳ����ʵ�����÷�ʽ��ֻ���ڱ����з���
	private String color;
	
	// protected������ʹ�ô�ͳ����ʵ�����÷�����ֻ��������ͱ����з���
	protected void drive() {
		System.out.println("drive private car! the coloe is: " + color);
	}
}
