package jingdong;

/**
 * Author:Young Class Comment: 写三个线程打印ABC，A打印10次A，B打印10次B，C打印10次C
 * 要求线程同步进行，交替打印10个ABC Date: 2016年4月18日下午9:35:46
 */


public class MultiThread implements Runnable{
	private String name;
	public MultiThread(String name){
		this.name = name;
	}
	@Override
	public void run() {
		System.out.print(this.name);
	}
	public static void main(String[] args) {
//		new MultiThread("A").run();
//		new MultiThread("B").run();
//		new MultiThread("C").run();
		System.out.println(255 & 0xFF);
	}
}
/*这是循环10次，创建了30个线程来执行，并不是多线程
 * public class MultiThread {
	public static void main(String[] args) {
		MultiThread m = new MultiThread();
		for (int i = 0; i < 10; i++) {
			m.new ThreadA().run();
			m.new ThreadB().run();
			m.new ThreadC().run();
		}
	}

	public class ThreadA implements Runnable {
		@Override
		public void run() {
			System.out.print("A");
		}

	}

	public class ThreadB implements Runnable {
		@Override
		public void run() {
			System.out.print("B");
		}

	}

	public class ThreadC implements Runnable {
		@Override
		public void run() {
			System.out.print("C");
		}

	}
}*/
