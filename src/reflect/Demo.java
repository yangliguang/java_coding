package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Author:Young
 * Class Comment: Java Reflection
 * 通过一个对象获得完整的包名和类名
 * Date: 2016年6月6日上午11:20:45
 */
public class Demo {
	public static void main(String[] args) {
//		1.通过一个对象获得完整的包名和类名，修饰符，类的属性,方法，接口，父类,构造方法,构造方法修饰符，参数等等
//		获取类的加载器
//		Person p = new Person("Young", 30);
//		System.out.println(p.getClass().getName());
		//可以有多个接口
//		System.out.println(d.getClass().getInterfaces()[0].getName());
//		System.out.println(p.getClass().getSuperclass().getName());
//		System.out.println(p.getClass().getConstructors()[0].getParameterTypes()[0]);
//		System.out.println(p.getClass().getDeclaredFields()[0]);
//		System.out.println(p.getClass().getMethods().length);
//		System.out.println(p.getName());
//		Method m = null;
//		try {
//			m = p.getClass().getMethod("getAge");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		System.out.println(p.getClass().getClassLoader().getClass().getName());
		
//		2.实例化Class类对象,其它类的对象
//		添加一句：所有类的对象其实都是Class的实例。
//		Class<?> d1 = null;
//		Class<?> d2 = null;
//		Class<?> d3 = null;
//		try {
//			d1 = Class.forName("reflect.Demo");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		d2 = new Demo().getClass();
//		d3 = Demo.class;
//		System.out.println(d1.getName());
//		System.out.println(d2.getName());
//		System.out.println(d3.getName());
//		System.out.println(d1.hashCode());
		
//		Class<?> p = null;
//		try {
//			p = Class.forName("reflect.Person");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		Person per = null;
//		try {
////			per = (Person) p.newInstance(); //无参构造方法,方式1
//			Constructor<?>[] cons = p.getConstructors();
////			per = (Person) cons[3].newInstance(); //无参构造方法,方式2
//			per = (Person) cons[0].newInstance("Young", 30); //有参构造方法
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(per.toString());
		
		try {
			Class<?> p = Class.forName("reflect.Person");
			Person per = (Person) p.newInstance();
			Field field = p.getDeclaredField("name");
			field.setAccessible(true);
			field.set(per, "Young");
			System.out.println(field.get(per));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}