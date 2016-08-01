package reflect;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月6日下午6:06:08
 */
public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("yang", 20);
		System.out.println(p1.hashCode());
		p1.setAge(30);
		System.out.println(p1.hashCode());
		
	}
}
