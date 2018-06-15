package com.cheny.dev;

public class ThreadB extends Thread {

	private Service service;
	
	public ThreadB(Service service) {
		super();
		this.service=service;
		
	}
	
	public void run() {
		synchronized (service) {
		
		//service.printB();
		System.out.println("开始通知。。。"+System.currentTimeMillis());
		service.notify();
		System.out.println("结束通知。。。"+System.currentTimeMillis());
		
		}

	}
}
