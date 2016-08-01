package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午10:06:46
 */
public class Parent{
	public Parent(){
		System.out.println("0");
	}
	static{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
}
