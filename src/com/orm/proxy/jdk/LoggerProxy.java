package com.orm.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggerProxy implements InvocationHandler{
	private Object target;
	
	/*
	 * ���ر����ǽӿ����ͣ�Ҳ������ʹ�ö�̬�����ʱ������ýӿ����͵Ķ���������ǿ��ת��
	 * */
	public Object bind(Object obj){
		this.target = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		Logger.before("��־��¼...");
		System.out.println(method.getName());
		System.out.println(target.getClass().getName());
		System.out.println("args = "+args);
		result = method.invoke(target, args);
		System.out.println("result = "+result);
		Logger.after("��־��¼...");
		return result;
	}

}
class Logger{
	
	public static void before(String str){
		System.out.println("����ǰ��־��"+str);
	}
	public static void after(String str){
		System.out.println("��������־��"+str);
	}
}
