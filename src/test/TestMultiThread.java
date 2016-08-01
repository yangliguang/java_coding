package test;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月19日上午8:39:00
 */
public class TestMultiThread implements Runnable{
	private String name;
	private Object prev;
	private Object self;
	
	private TestMultiThread(String name, Object prev, Object self){
		this.name = name;
		this.prev = prev;
		this.self = self;
	}
	public static void main(String[] args) throws InterruptedException {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
//		new TestMultiThread("A",c,a).run();
//		new TestMultiThread("B",a,b).run();
//		new TestMultiThread("C",b,c).run();
		TestMultiThread ta = new TestMultiThread("A",c,a);
		TestMultiThread tb = new TestMultiThread("B",a,b);
		TestMultiThread tc = new TestMultiThread("C",b,c);
		new Thread(ta).start();
		Thread.sleep(10); 
		new Thread(tb).start();
		Thread.sleep(10); 
		new Thread(tc).start();
		
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		int count = 10;
		while(count > 0){
			synchronized(prev){
				synchronized(self){
					System.out.print(name);
					count--;
					self.notify();
					try {
						Thread.sleep(1);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				try {
					prev.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
