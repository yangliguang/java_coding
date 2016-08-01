package reflect;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月6日下午2:59:14
 */
public class Person {
	public Person(){}
	public Person(String name){
		this.name = name;
	}
	public Person(int age){
		this.age = age;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString(){
		return "[name: " + this.name + ", age: " + this.age + "]";  
	}
	
}	
