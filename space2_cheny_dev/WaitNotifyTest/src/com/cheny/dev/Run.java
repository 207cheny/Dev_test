package com.cheny.dev;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object lock=new Object();
		ThreadA a=new ThreadA(lock);
		
		ThreadA2 a2=new ThreadA2(lock);
		a2.start();
		a.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadB b=new ThreadB(lock);
		b.start();
	}

}
