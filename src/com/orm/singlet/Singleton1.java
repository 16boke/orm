package com.orm.singlet;
/**
 * ����ģʽ
 * ����˽�е�����������幫�еķ��ʷ�������ʵ����
 * @author admin
 *
 */
public class Singleton1 {
	private static Singleton1 singleton = new Singleton1();
	
	private Singleton1(){
		System.out.println("���캯����ʼ��...");
	}
	
	public static Singleton1 getInstance(){
		return singleton;
	}
	/**
	 * ��ͨ��Singleton1.test()�����ô˷�����ʱ����Ҫʵ����Singleton1�����˷��ڴ�ռ�
	 */
	public static void test(){
		System.out.println("���Է���...");
	}
}
