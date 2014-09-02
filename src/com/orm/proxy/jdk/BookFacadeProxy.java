package com.orm.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler {
	private Object target;

	public BookFacadeProxy(Object target) {
		this.target = target;
	}

	/**
	 * 绑定委托对象并返回一个代理类
	 * 
	 * @param target
	 * @return
	 */
	public static Object bind(Object target) {
		// 取得代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new BookFacadeProxy(
				target)); // 要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)
	}

	/*
	 * newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
	 * InvocationHandler h)方法由程序员来指定参数动态返回需要的代理类， 而invoke(Object proxy, Method
	 * method, Object[] args) 方法则是由JVM在运行时动态调用的。
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("事物开始");
		// 执行方法,JVM通过这条语句执行原来的方法(反射机制)
		result = method.invoke(target, args);
		System.out.println("事物结束");
		return result;
	}

}
