package com.cheny.dev;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ThreadA extends Thread {

	private Service service;
	
	public ThreadA(Service service) {
		super();
		this.service=service;
		
	}
	
	public void run() {
		synchronized (service) {
	
		System.out.println("开始等待。。。"+System.currentTimeMillis());
		try {
			service.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.printA();
		System.out.println("结束等待。。。"+System.currentTimeMillis());
		
		}

	}
}
