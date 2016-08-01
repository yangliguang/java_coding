package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月3日下午1:54:41
 */
public class TestExtend {
	public static void main(String[] args) {
		new TestExtend().new Son();
	}
	public class Parent{
		public Parent(){
			System.out.println("this is Parent null");
		}
		
		public Parent(String name){
			System.out.println("this is Parent name");
		}
	}
	
	public class Son extends Parent{
		public Son(){
			this("test");
			System.out.println("this is son null");
		}
		public Son(String name){
			System.out.println("this is son name");
		}
	}
	
	
}	
