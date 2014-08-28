package com.orm.test;

/**
 * ¹ØÓÚThreadLocalµÄ²âÊÔ
 * 
 * @author admin
 * 
 */
public class ThreadLocalTest {
	private ThreadLocal<Test> num = new ThreadLocal<Test>();
	private Test test = null;
	public Test getNum(){
		if(this.num.get() == null){
			test = new Test();
			this.num.set(test);
			return this.num.get();
		}
		test = this.num.get();
		this.num.set(test);
		return this.num.get();
	}
	public void test() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "," + getNum());
		}
	}

	public static void main(String[] args) {
		ThreadLocalTest threadLocalTest = new ThreadLocalTest();
		Thread thread1 = new Thread(new RunnableTest(threadLocalTest));
		Thread thread2 = new Thread(new RunnableTest(threadLocalTest));
		Thread thread3 = new Thread(new RunnableTest(threadLocalTest));
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class RunnableTest implements Runnable {
	private ThreadLocalTest threadLocalTest = null;

	public RunnableTest() {
	}

	public RunnableTest(ThreadLocalTest threadLocalTest) {
		this.threadLocalTest = threadLocalTest;
	}

	public void run() {
		threadLocalTest.test();
	}
}
class Test{
	
}
