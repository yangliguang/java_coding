package test;

/**
 * Author:Young
 * Class Comment:第三个例子同样适用于其它同步代码块。也就是说，当一个线程访问object的一个synchronize(this)同步代码块时，它将获得这个object的对象锁。结果，其它线程对该object对象所有同步代码部分的访问将被暂时阻塞。
 * Date: 2016年5月31日下午1:09:40
 */
public class Thread4{
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
	
	public synchronized void m2(){
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
		final Thread4 t4 = new Thread4();
		Thread ta = new Thread(new Runnable(){public void run(){t4.m1();}}, "ta");
		Thread tb = new Thread(new Runnable(){public void run(){t4.m2();}}, "tb");
		ta.start();
		tb.start();
		
	}
	
}
