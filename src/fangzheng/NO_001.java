package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午9:50:10
 */
public class NO_001 {
	public static void setStringValue(String str){
		str = "1234";
	}
	public static void setIntValue(int i) {
		i = 1234;
	}
	public static void setIntegerValue(Integer inte) {
		inte = 1234;
	}
	public static void setArrayValue(int[] array) {
		array[3] = 4;
	}
	public static void main(String[] args) {
		String str = "123";
		setStringValue(str);
		
		int in = 123;
		setIntValue(in);
		
		Integer inte = 123;
		setIntegerValue(inte);
		
		int[] array = {1,2,3,0};
		setArrayValue(array);
		
		System.out.println("string: " + str);
		System.out.println("int: " + in);
		System.out.println("inte: " + inte);
		System.out.println("array: " + array);
		for(int i : array)
			System.out.print(i + " ");
		
	}
}
