package com.kv.resource;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.kv.reflect.Person;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-4-30 下午 3:58:47
 *
 * @author kevin
 * @version 1.1
 */
public class BeanFactoryExample {
	
	public static void main(String[] args) {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:com/kv/reflect/beans.xml");
		System.out.println(res.getDescription());
		
		// In Spring3.1+, XmlBeanFactory is deprecated, use DefaultListableBeanFactory to replace
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(res);
		
		System.out.println("init BeanFactory.");
		
		Person p0 = beanFactory.getBean("person0", Person.class);
		System.out.println("person bean is ready for user...");
		System.out.println(p0.toString());
		
		Person p1 = beanFactory.getBean("person1", Person.class);
		System.out.println("person bean is ready for user...");
		System.out.println(p1.toString());
	}

}
