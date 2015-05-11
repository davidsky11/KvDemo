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
 * @date 2015-4-29 ионГ10:41:59
 *
 * @author kevin
 * @version 1.1
 */
public class KvDemo {

	public static void main(String[] args) {
		Person p0 = new Person();
		Person p1 = p0;
		
		p1.setName("1");
		p1.setAge(1);
		p1.setSex('m');
		p1.setAddress("1");
		
		System.out.println(p0.toString());
	}
	
}
