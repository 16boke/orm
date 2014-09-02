package com.orm.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggerProxy implements InvocationHandler{
	private Object target;
	
	/*
	 * 返回必须是接口类型，也就是在使用动态代理的时候必须用接口类型的对象来进行强制转换
	 * */
	public Object bind(Object obj){
		this.target = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		Logger.before("日志记录...");
		System.out.println(method.getName());
		System.out.println(target.getClass().getName());
		System.out.println("args = "+args);
		result = method.invoke(target, args);
		System.out.println("result = "+result);
		Logger.after("日志记录...");
		return result;
	}

}
class Logger{
	
	public static void before(String str){
		System.out.println("操作前日志："+str);
	}
	public static void after(String str){
		System.out.println("操作后日志："+str);
	}
}
