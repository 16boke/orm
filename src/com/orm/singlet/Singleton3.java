package com.orm.singlet;
/**
 * 单例模式
 * 使用内部类来实例代对象
 * @author admin
 *
 */
public class Singleton3 {
	private Singleton3(){
		System.out.println("构造函数...");
	}
	private static class SingletonHandler{
		private static Singleton3 singleton = new Singleton3();
	}
	public static Singleton3 getInstance(){
		return SingletonHandler.singleton;
	}
	/**
	 * 当通过Singleton3.test()来调用此方法的时候只会执行这个方法， 不用实例化Singleton3对象，性能也不会有影响
	 */
	public static void test(){
		System.out.println("测试方法...");
	}

}
