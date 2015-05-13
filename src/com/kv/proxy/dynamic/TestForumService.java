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
 * @date 2015-5-13 下午3:13:49
 *
 * @author kevin
 * @version 1.1
 */
public class TestForumService {

	public static void main(String[] args) {
		ForumService forumService = new ForumServiceImpl();
		forumService.removeForum(10);
		forumService.removeTopic(1012);
	}
}
