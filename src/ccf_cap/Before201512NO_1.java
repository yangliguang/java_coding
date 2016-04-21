package ccf_cap;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月9日下午2:16:45
 */
public class Before201512NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;
		for(char c : s.toCharArray())
			sum += Integer.parseInt(c+"");
		System.out.println(sum);
		sc.close();
	}
}
