package com.cheny.dev;

public class WaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lock=new String("''");
		System.out.println("开始。。。");
		try {
			lock.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束。。。");
	}

}
