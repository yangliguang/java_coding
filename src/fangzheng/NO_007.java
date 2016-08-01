package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午10:08:18
 */
public class NO_007 {
	public static void main(String[] args) {
		NO_007 m = new NO_007();
		m.new Child("x");
	}
	public class Parent{
		public Parent(){
			System.out.print(1);
		}
		public Parent(String name){
			System.out.print(2);
		}
	}
	public class Child extends Parent{
		public Child(String name){
			System.out.print(3);
			new Parent(name + "1");
		}
		public Child(){
			System.out.print(4);
		}
	}
}
