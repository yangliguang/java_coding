package test;

import reflect.Person;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月7日下午5:25:05
 */
public class TestGC {
	public static void main(String[] args) {
		Person p = new Person("yang", 30);
		System.out.println(p.toString());
		
	}
}
