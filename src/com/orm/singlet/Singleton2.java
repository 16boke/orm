package com.orm.singlet;
/**
 * ����ģʽ
 * ���徲̬���������ʵ����
 * @author admin
 *
 */
public class Singleton2 {
	private static Singleton2 singleton = null;
	
	private Singleton2(){
		System.out.println("���캯��...");
	}
	
	public static synchronized Singleton2 getInstance(){
		if(singleton == null)
			singleton = new Singleton2();
		return singleton;
	}
	
	/**
	 * ��ͨ��Singleton2.test()�����ô˷�����ʱ����Ȼ����Ҫʵ����Singleton2����
	 * ����ʹ��synchronized��ͬ��ʵ����Singleton2�����ڲ������������ܻ���Ӱ��
	 */
	public static void test(){
		System.out.println("���Է���...");
	}
}
