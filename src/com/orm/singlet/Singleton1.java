package com.orm.singlet;
/**
 * 单例模式
 * 定义私有的类变量，定义公有的访问方法进行实例化
 * @author admin
 *
 */
public class Singleton1 {
	private static Singleton1 singleton = new Singleton1();
	
	private Singleton1(){
		System.out.println("构造函数初始化...");
	}
	
	public static Singleton1 getInstance(){
		return singleton;
	}
	/**
	 * 当通过Singleton1.test()来调用此方法的时候还需要实例化Singleton1对象，浪费内存空间
	 */
	public static void test(){
		System.out.println("测试方法...");
	}
}
