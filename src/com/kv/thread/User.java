package com.kv.thread;

/**
 * 自定义的线程范围内共享的对象。即该类会针对不同的线程分别创建一个独立的对象
 * @see 此时每个线程得到的将是自己的实例，各线程间得到的实例没有任何关联
 * @see 我们可以拿它，与单例模式中的懒汉式，进行对比，这是个很有意思的东西 
 * @see Struts2就是这么设计的，它的每一个请求就是一个线程 
 * @author kevin
 *
 */
public class User {

	private static ThreadLocal<User> instanceMap = new ThreadLocal<User>();
	
	private User() {
		
	}
	
	/**
	 * 得到与当前线程相关的，当前类的实例
	 * @return
	 */
	public static User getThreadInstance() {
		User instance = instanceMap.get();
		if (null == instance) {
			instance = new User();
			instanceMap.set(instance);
		}
		return instance;
	}
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
