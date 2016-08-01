package test;

/**
 * Author:Young
 * Class Comment:尤其关键的是，当一个线程访问object的一个synchronized(this)同步代码时，其它线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞。
 * Date: 2016年5月31日下午1:09:40
 */
public class Thread3{
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
			synchronized(this){
				System.out.println(Thread.currentThread().getName() + i + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		final Thread3 t3 = new Thread3();
		Thread ta = new Thread(new Runnable(){public void run(){t3.m1();}}, "ta");
		Thread tb = new Thread(new Runnable(){public void run(){t3.m2();}}, "tb");
		ta.start();
		tb.start();
		
	}
	
}
