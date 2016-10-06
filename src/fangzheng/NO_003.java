package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午9:54:21
 */
public class NO_003 {
	public static void main(String[] args) {
		NO_003 m = new NO_003();
		Parent child = m.new Child();
		child.echo();
		child.echo2();
		System.out.print(child.i);
		
		Child child2 = m.new Child();
		child2.echo();
		child2.echo2();
		System.out.print(child2.i);
	}
	
	public class Parent{
		public int i = 1;
		public void echo(){System.out.print(i);}
		public void echo2(){System.out.print(i);}
	}
	public class Child extends Parent{
		public int i = 2;
		public void echo2(){System.out.print(i);}
	}
}
