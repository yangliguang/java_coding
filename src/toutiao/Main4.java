package toutiao;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月27日下午8:24:51
 */
public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] strs = new String[n];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			strs[i] = sc.next();
			sb.append(strs[i]);
		}
		sc.close();
		
	}
}
