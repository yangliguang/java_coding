package test;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月31日下午1:42:55
 */
public class Thread5 {
	public class Inner{
		private void m1(){
			for(int i = 0; i < 5; i++){
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		private void m2(){
			for(int i = 0; i < 5; i++){
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void m11(Inner inner){
		synchronized(inner){
			inner.m1();
		}
	}
	
	private void m22(Inner inner){
		synchronized(inner){
			inner.m2();
		}
	}
	
	public static void main(String[] args) {
		final Thread5 t5 = new Thread5();
		final Inner inner = t5.new Inner();
		Thread t1 = new Thread(new Runnable(){public void run(){t5.m11(inner);}}, "ta");
		Thread t2 = new Thread(new Runnable(){public void run(){t5.m22(inner);}}, "tb");
		t1.start();
		t2.start();
	}
}
