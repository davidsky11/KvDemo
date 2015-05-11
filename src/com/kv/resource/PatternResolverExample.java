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
 * @date 2015-4-30 ����11:23:16
 *
 * @author kevin
 * @version 1.1
 */
/*
 * ��Դ�ļ��ļ��أ�
 * 		1��classpath:com/t*st.xml:		ƥ��com��·����com/test.xml, com/tast.xml
 * 		2��file:D:/conf/*.xml:			ƥ���ļ�ϵͳD:/confĿ¼��������xmlΪ��׺���ļ�
 * 		3��classpath:com/**\/test.xml:	ƥ��com��·���£���ǰĿ¼������Ŀ¼����test.xml�ļ�
 * 		4��classpath:com/**\/*.xml:		ƥ��com��������xmlΪ��׺���ļ�
 * 		5��classpath:com/**\/test.xml:	��ȥһ����
 */
public class PatternResolverExample {

	public static void main(String[] args) throws IOException {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		
		// �����������com.kv.resource(���Ӱ�)�µ���xmlΪ��׺����Դ
		Resource resources[] = resolver.getResources("classpath*:com/kv/resource/**/*.xml");
		for (Resource resource : resources) {
			System.out.println("des : " + resource.getDescription());
		}
	}
	
}
