package com.cheny.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandleTest implements InvocationHandler{

	private Object targs;
	
	public Object bind(Object targs) {
		this.targs=targs;
		//注入实例对象。返回代理类
		return  Proxy.newProxyInstance(targs.getClass().getClassLoader(),
				targs.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 在调用方法之前执行拦截任务
		System.out.println(System.currentTimeMillis());
		Object tar=method.invoke(targs, args);
		//执行完后进行服务后拦截
		System.out.println(System.currentTimeMillis());
		return tar;
	}

}
