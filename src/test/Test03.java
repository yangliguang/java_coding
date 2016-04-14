package test;

/**
 * Author:Young
 * Class Comment:整数比较
 * Date: 2016年4月13日下午5:25:50
 */
public class Test03 {
	public static void main(String[] args) {
		Integer i1 = 127,i2=127,i3=128,i4=128;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		Integer j1 = new Integer(3);
		Integer j2 = 3;
		Integer j3= new Integer(3);
		System.out.println(j1==j2);
		System.out.println(j1.equals(j2));
		System.out.println(j1==j3);
		System.out.println(j1.equals(j3));
		
	}
}
