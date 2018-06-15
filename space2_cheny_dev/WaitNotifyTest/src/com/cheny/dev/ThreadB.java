package com.cheny.dev;

public class ThreadB extends Thread {

	private Object lock;

	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {

			for (int i = 0; i < 10; i++) {
				MyList.add();
				if (MyList.size() == 5) {
					//lock.notify();
					lock.notifyAll();
					System.out.println("发送通知。。。");
				}
				System.out.println("添加了" + (i + 1) + "个元素");
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
