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
 * @date 2015-4-29 ÉÏÎç9:26:47
 *
 * @author kevin
 * @version 1.1
 */
public class Person {

	private String name;
	private char sex;
	private int age;
	private String address;
	
	public Person() {
		
	}
	
	public Person(String name, char sex, int age, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public char getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age
				+ ", address=" + address + "]";
	}
	
}
