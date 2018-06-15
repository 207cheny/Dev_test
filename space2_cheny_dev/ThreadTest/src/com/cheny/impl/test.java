package com.cheny.impl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadTest targ=new MyThreadTest();	
		Thread thread1=new Thread(targ);
		Thread thread2=new Thread(targ);
		Thread thread3=new Thread(targ,"线程3");
		Thread thread4=new Thread(targ,"线程4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	System.out.println(Thread.currentThread().getName());
	System.out.println("11"+Thread.currentThread().getName());
	System.out.println("12"+thread2.getName());
	}

}
