package com.cheny.dev;

public class ThreadA extends Thread {

	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	
	@Override
	public void run() {
		synchronized (lock) {
			if (MyList.size()!=5) {
				System.out.println("不满足条件，继续等待。。。");
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("等待结束。。。");
			}
		}
	}
	
	
}
