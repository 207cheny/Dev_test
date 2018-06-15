package com.cheny.test;

import java.lang.reflect.Proxy;

import com.cheny.Inface.Hello;
import com.cheny.Inface.impl.HelloImpl;
import com.cheny.proxy.ProxyHandleTest;

public class ProxyTest {

	//动态代理测试
	public static void main(String[] args) {
	
		HelloImpl hell=new HelloImpl();
		/*Hello he=(Hello)Proxy.newProxyInstance(hell.getClass().getClassLoader(),
				                        hell.getClass().getInterfaces(), 
				                        new ProxyHandleTest(hell));*/
		ProxyHandleTest prox=new ProxyHandleTest();
		Hello he=(Hello) prox.bind(hell);
		
		he.say();
    }
}
