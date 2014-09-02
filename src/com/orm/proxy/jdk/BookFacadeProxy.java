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
	 * ��ί�ж��󲢷���һ��������
	 * 
	 * @param target
	 * @return
	 */
	public static Object bind(Object target) {
		// ȡ�ô������
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new BookFacadeProxy(
				target)); // Ҫ�󶨽ӿ�(����һ��ȱ�ݣ�cglib�ֲ�����һȱ��)
	}

	/*
	 * newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
	 * InvocationHandler h)�����ɳ���Ա��ָ��������̬������Ҫ�Ĵ����࣬ ��invoke(Object proxy, Method
	 * method, Object[] args) ����������JVM������ʱ��̬���õġ�
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("���￪ʼ");
		// ִ�з���,JVMͨ���������ִ��ԭ���ķ���(�������)
		result = method.invoke(target, args);
		System.out.println("�������");
		return result;
	}

}
