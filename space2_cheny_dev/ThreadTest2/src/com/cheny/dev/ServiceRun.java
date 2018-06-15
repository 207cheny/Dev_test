package com.cheny.dev;

import javax.swing.plaf.SliderUI;

public class ServiceRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service ser=new Service();
		ThreadA a=new ThreadA(ser);
		a.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadB b=new ThreadB(ser);
		b.start();
	}

}
