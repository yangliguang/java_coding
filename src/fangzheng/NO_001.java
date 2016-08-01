package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午9:50:10
 */
public class NO_001 {
	public static void setValue(String str){
		str = "abc";
	}
	public static void main(String[] args) {
		String str = "123";
		setValue(str);
		System.out.println(str);
	}
}
