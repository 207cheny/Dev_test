package com.cheny.impl;

import java.sql.Date;

public class MyThreadTest extends Thread{
	int i=5;
	@Override
	synchronized public void run() {
		
		
		//Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+ "   "+ new java.util.Date()+ "  "+i--);
	}

}
