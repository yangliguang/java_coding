package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午10:46:53
 */
public class NO_018 {
	public static void main(String[] args) {
		NO_018 m = new NO_018();
		A a1 = m.new A();
		a1.m();
		A a2= m.new B();
		a2.m();
		B b1 = (B)a2;
		b1.m();
		B b2 = m.new B();
		b2.m();
	}
	public class A{
		public void m(){
			System.out.println("A");
		}
	}
	public class B extends A{
		public void m(){
			System.out.println("B");
		}
	}
}
