package com.kv.pool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>Title: FSVM System</p>
 *
 * <p>Description: </p>
 * 
 * <p>Copyright: Copyright (c) 2015</p>
 *
 * <p>Company: Foxconn</p>
 * 
 * @date 2015-5-12 上午10:02:52
 *
 * @author kevin
 * @version 1.1
 */
public class Demo {
	
	private List list;
	
	private Map map = new HashMap();

	public static void main(String[] args) {
		
//		ThreadPoolExecutor executor = null;
		
//		executor = new ThreadPoolExecutor(3, 11, 200, TimeUnit.MICROSECONDS, 
//				new ArrayBlockingQueue<Runnable>(5));
		
		ExecutorService pool = null;
//		pool = Executors.newSingleThreadExecutor();
		pool = Executors.newFixedThreadPool(2);
		
		for (int i = 0 ; i < 11; i++) {
			MyTask task = new MyTask(i);
//			executor.execute(task);
			pool.submit(task);
//			System.out.println("There has " + executor.getPoolSize() + " in the pool\n" 
//					+ executor.getQueue().size() + " threads still waiting...\n"
//					+ executor.getCompletedTaskCount() + " has been executed...");
		}
		pool.shutdown();
	}
}

class MyTask implements Runnable {
	
	private int taskNum;
	
	public MyTask(int num) {
		this.taskNum = num;
	}
	
	@SuppressWarnings("static-access")
	public void run() {
		System.out.println(" --> task " + taskNum + " start ... ");
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" task " + taskNum + " end <-- ");
	}
	
}