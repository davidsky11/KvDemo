package com.kv.proxy.dynamic1;

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
		System.out.println("模拟删除Topic记录： "  + topicId);
		try {
			Thread.currentThread().sleep(20);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void removeForum(int forumId) {
		System.out.println("模拟删除Forum记录： "  + forumId);
		try {
			Thread.currentThread().sleep(40);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
