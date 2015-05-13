package com.kv.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-13 下午2:06:30
 *
 * @author kevin
 * @version 1.1
 */
// 1、管理Bean生命周期的接口
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

	private String brand;
	private String color;
	private int maxSpeed;
	
	private BeanFactory beanFactory;
	private String beanName;
	
	public Car() {
		System.out.println("调用Car()构造函数...");
	}
	
	public void setBrand(String brand) {
		System.out.println("调用setBrand()设置属性...");
		this.brand = brand;
	}
	
	public void introduce() {
		System.out.println("brand: " + brand + ";color: " + color + ";maxSpeed: " + maxSpeed);
	}
	
	// 2、BeanFactoryAware接口方法
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("调用BeanFactoryAware.setBeanFactory()...");
		this.beanFactory = beanFactory;
	}
	
	// 3、BeanNameAware接口方法
	public void setBeanName(String beanName) {
		System.out.println("调用BeanNameAware.setBeanName()...");
		this.beanName = beanName;
	}
	
	// 4、InitializingBean接口方法
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用InitializingBean.afterPropertiesSet()...");
	}
	
	// 5、DisposableBean接口方法
	public void destroy() throws Exception {
		System.out.println("调用DisposableBean.destroy()...");
	}
	
	// 6、通过<bean>的init-method属性指定的初始化方法
	public void myInit() {
		System.out.println("调用init-method所指定的myInit()，将maxSpeed设置为240...");
		this.maxSpeed = 240;
	}
	
	// 7、通过<bean>的destroy-method属性指定的销毁方法
	public void myDestroy() {
		System.out.println("调用destroy-method所指定的myDestroy()...");
	}
	
}
