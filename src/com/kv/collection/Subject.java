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
 * @date 2015-5-13 上午11:41:48
 *
 * @author kevin
 * @version 1.1
 */
public class Subject extends AbstractClassT implements InterfaceT {

	@Override
	public void test() {
		System.out.println("abstractclass interface test...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
