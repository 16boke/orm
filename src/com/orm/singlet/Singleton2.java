package com.orm.singlet;
/**
 * 单例模式
 * 定义静态类变量但不实例化
 * @author admin
 *
 */
public class Singleton2 {
	private static Singleton2 singleton = null;
	
	private Singleton2(){
		System.out.println("构造函数...");
	}
	
	public static synchronized Singleton2 getInstance(){
		if(singleton == null)
			singleton = new Singleton2();
		return singleton;
	}
	
	/**
	 * 当通过Singleton2.test()来调用此方法的时候虽然不需要实例化Singleton2对象，
	 * 但是使用synchronized来同步实例化Singleton2对象在并发环境下性能会受影响
	 */
	public static void test(){
		System.out.println("测试方法...");
	}
}
