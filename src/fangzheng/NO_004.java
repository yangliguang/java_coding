package fangzheng;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午9:59:31
 */
public class NO_004 {
	public static void main(String[] args) {
		int i = 1;
		int j = i++;
		if((i > ++j) && (i++ == j)){
			i += j;
		}
		System.out.println(i);
	}
}
