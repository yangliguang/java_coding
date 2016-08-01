package test;

/**
 * Author:Young
 * Class Comment:然而，当一个线程访问object的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该object中的非synchronized(this)同步代码块。
 * Date: 2016年5月31日下午1:09:40
 */
public class Thread2{
	public void m1(){
		synchronized(this){
			for(int i = 0; i < 5; i++){
				System.out.println(Thread.currentThread().getName() + i + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void m2(){
		for(int i = 0; i < 5; i++){
			System.out.println(Thread.currentThread().getName() + i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		final Thread2 t2 = new Thread2();
		Thread ta = new Thread(new Runnable(){public void run(){t2.m1();}}, "ta");
		Thread tb = new Thread(new Runnable(){public void run(){t2.m2();}}, "tb");
		ta.start();
		tb.start();
		
	}
	
}
