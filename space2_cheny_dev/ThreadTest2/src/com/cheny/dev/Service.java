package com.cheny.dev;

public class Service {

	public static void printA() {
		synchronized (Service.class) {
			try {
				System.out.println("进入A打印区域。。。");
				Thread.sleep(3000);
				System.out.println("退出A打印区域。。。");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void printB() {

		synchronized (Service.class) {

			try {
				System.out.println("进入B打印区域。。。");
				Thread.sleep(3000);
				System.out.println("退出B打印区域。。。");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
