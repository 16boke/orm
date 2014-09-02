package com.orm.singlet;
/**
 * ����ģʽ
 * ʹ���ڲ�����ʵ��������
 * @author admin
 *
 */
public class Singleton3 {
	private Singleton3(){
		System.out.println("���캯��...");
	}
	private static class SingletonHandler{
		private static Singleton3 singleton = new Singleton3();
	}
	public static Singleton3 getInstance(){
		return SingletonHandler.singleton;
	}
	/**
	 * ��ͨ��Singleton3.test()�����ô˷�����ʱ��ֻ��ִ����������� ����ʵ����Singleton3��������Ҳ������Ӱ��
	 */
	public static void test(){
		System.out.println("���Է���...");
	}

}
