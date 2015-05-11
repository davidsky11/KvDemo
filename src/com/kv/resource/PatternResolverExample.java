package com.kv.resource;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-4-30 上午11:23:16
 *
 * @author kevin
 * @version 1.1
 */
/*
 * 资源文件的加载：
 * 		1、classpath:com/t*st.xml:		匹配com类路径下com/test.xml, com/tast.xml
 * 		2、file:D:/conf/*.xml:			匹配文件系统D:/conf目录下所有以xml为后缀的文件
 * 		3、classpath:com/**\/test.xml:	匹配com类路径下（当前目录以其子目录）的test.xml文件
 * 		4、classpath:com/**\/*.xml:		匹配com下所有以xml为后缀的文件
 * 		5、classpath:com/**\/test.xml:	略去一百字
 */
public class PatternResolverExample {

	public static void main(String[] args) throws IOException {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		
		// 加载所有类包com.kv.resource(及子包)下的以xml为后缀的资源
		Resource resources[] = resolver.getResources("classpath*:com/kv/resource/**/*.xml");
		for (Resource resource : resources) {
			System.out.println("des : " + resource.getDescription());
		}
	}
	
}
