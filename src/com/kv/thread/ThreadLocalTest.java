package com.kv.thread;

import java.util.Random;

/**
 * @see ============================================================================================================= 
 * @see ThreadLocal�����ú�Ŀ�� 
 * @see ThreadLocal����ʵ���߳��ڵ����ݹ�����������ͬ�Ĵ��룬���ģ���ڲ�ͬ���߳�������ʱ���ֱ���ͬ������ 
 * @see ÿ���̵߳���ȫ�ֵ�ThreadLocal.set()���������൱�������ڲ���Map������һ����¼��key�Ǹ��Ե��̣߳�value�Ǹ���set()����ȥ��ֵ 
 * @see ============================================================================================================= 
 * @see ThreadLocal��Ӧ�ó��� 
 * @see ����Struts2�е�ActionContext��ͬһ�δ��뱻��ͬ���̵߳�������ʱ���ô��������������ÿ���̸߳��Ե�״̬������ 
 * @see ���ڲ�ͬ���߳���˵��ActionContext.getContext()�����õ��Ķ��󶼲���ͬ 
 * @see ����ͬһ���߳���˵��ActionContext.getContext()�����������ĸ�ģ���л����Ǳ����ö��ٴΣ���õ��Ķ���ͬһ������ 
 * @see ͨ���鿴com.opensymphony.xwork2.ActionContex�ĵ�43��166��Դ�룬���ѷ��֣�Struts2������ô���� 
 * @see ============================================================================================================= 
 * @see �߳��еĳ�Ա�����;ֲ����� 
 * @see ��Ա����:����̲߳���ͬһ������ĳ�Ա����ʱ�����ǶԳ�Ա�����ĸı��Ǳ˴�Ӱ��� 
 * @see �ֲ�����:ÿ���̶߳�����һ���þֲ������Ŀ�����һ���̶߳Ծֲ������ĸı䲻��Ӱ�쵽�����̶߳Ըþֲ������Ĳ��� 
 * @see ============================================================================================================= 
 * 
 * @author kevin
 *
 */
public class ThreadLocalTest {
	
	public static void main(String[] args) {
		new Thread(new MyThread(new Random().nextInt())).start();
		new Thread(new MyThread(new Random().nextInt())).start();
	}

}

class MyThread implements Runnable {
	private Integer data;
	
	public MyThread(Integer data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has put data: " + data);
		User.getThreadInstance().setName("name" + data);
		User.getThreadInstance().setAge(data);
		new Pig().getMyData();
		new Dog().getMyData();
	}
}

class Pig {
	public void getMyData() {
		User user = User.getThreadInstance();
		System.out.println("Pig from " + Thread.currentThread().getName() + " getMyData: " + user.getName());
	}
}

class Dog {
	public void getMyData() {
		User user = User.getThreadInstance();
		System.out.println("Dog from " + Thread.currentThread().getName() + " getMyData: " + user.getName());
	}
}