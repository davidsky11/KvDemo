package com.kv.proxy.dynamic;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-13 下午3:10:39
 *
 * @author kevin
 * @version 1.1
 */
public class ForumServiceImpl implements ForumService {

	@Override
	public void removeTopic(int topicId) {
		// 1、开始对该方法进行性能监视
		PerformanceMonitor.begin("com.kv.proxy.dynamic.ForumServiceImpl.removeTopic");
		System.out.println("模拟删除Topic记录： "  + topicId);
		try {
			Thread.currentThread().sleep(20);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		// 2、结束对该方法进行性能监视
		PerformanceMonitor.end();
	}

	@Override
	public void removeForum(int forumId) {
		// 1、开始对该方法进行性能监视
		PerformanceMonitor.begin("com.kv.proxy.dynamic.ForumServiceImpl.removeForum");
		System.out.println("模拟删除Forum记录： "  + forumId);
		try {
			Thread.currentThread().sleep(40);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		// 2、结束对该方法进行性能监视
		PerformanceMonitor.end();
	}

}
