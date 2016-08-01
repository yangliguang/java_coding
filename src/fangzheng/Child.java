package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午10:06:55
 */
public class Child extends Parent{
	public Child(){
		System.out.println("3");
	}
	static {
		System.out.println("4");
	}
	{
		System.out.println("5");
	}
	
}
