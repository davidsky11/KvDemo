package com.kv.collection;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-13 上午11:43:40
 *
 * @author kevin
 * @version 1.1
 */
public class Test {

	public static void main(String[] args) {
		AbstractClassT s = new Subject();
		System.out.println(s instanceof AbstractClassT);
		System.out.println(s instanceof InterfaceT);
		s.test();
		
		System.out.println("---------------------------------");
		
		ISubject i = new ISubject();
//		System.out.println(i instanceof AbstractClassT);
		System.out.println(i instanceof InterfaceT);
		i.test();
	}
	
}
