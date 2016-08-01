package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午10:01:03
 */
public class NO_005 {
	static boolean foo(char c){
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
		int i = 0;
		for(foo('A'); foo('B') && i < 2; foo('C')){
			i++;
			foo('D');
		}
	}
}
