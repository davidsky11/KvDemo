package com.kv.thread;

import java.util.Random;

/**
 * @see ============================================================================================================= 
 * @see ThreadLocal的作用和目的 
 * @see ThreadLocal用于实现线程内的数据共享。即对于相同的代码，多个模块在不同的线程中运行时，分别共享不同的数据 
 * @see 每个线程调用全局的ThreadLocal.set()方法，就相当于在其内部的Map中增加一条记录，key是各自的线程，value是各自set()传进去的值 
 * @see ============================================================================================================= 
 * @see ThreadLocal的应用场景 
 * @see 例如Struts2中的ActionContext，同一段代码被不同的线程调用运行时，该代码操作的数据是每个线程各自的状态和数据 
 * @see 对于不同的线程来说，ActionContext.getContext()方法得到的对象都不相同 
 * @see 对于同一个线程来说，ActionContext.getContext()方法无论在哪个模块中或者是被调用多少次，其得到的都是同一个对象 
 * @see 通过查看com.opensymphony.xwork2.ActionContex的第43和166行源码，不难发现，Struts2就是这么做的 
 * @see ============================================================================================================= 
 * @see 线程中的成员变量和局部变量 
 * @see 成员变量:多个线程操作同一个对象的成员变量时，它们对成员变量的改变是彼此影响的 
 * @see 局部变量:每个线程都会有一个该局部变量的拷贝，一个线程对局部变量的改变不会影响到其它线程对该局部变量的操作 
 * @see ============================================================================================================= 
 * 
 * @author kevin
 *
 */
public class ThreadLocalTest {
	
	public static void main(String[] args) {
		new Thread(new MyThread(new Random().nextInt())).start();
		new Thread(new MyThread(new Random().nextInt())).start();
	}

}

class MyThread implements Runnable {
	private Integer data;
	
	public MyThread(Integer data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has put data: " + data);
		User.getThreadInstance().setName("name" + data);
		User.getThreadInstance().setAge(data);
		new Pig().getMyData();
		new Dog().getMyData();
	}
}

class Pig {
	public void getMyData() {
		User user = User.getThreadInstance();
		System.out.println("Pig from " + Thread.currentThread().getName() + " getMyData: " + user.getName());
	}
}

class Dog {
	public void getMyData() {
		User user = User.getThreadInstance();
		System.out.println("Dog from " + Thread.currentThread().getName() + " getMyData: " + user.getName());
	}
}