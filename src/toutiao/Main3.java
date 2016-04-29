package toutiao;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月27日下午8:08:40
 */
public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] type = new int[n];
		int[] length = new int[n];
		for(int i = 0; i < n; i++){
			type[i] = sc.nextInt();
			length[i] = sc.nextInt();
			System.out.println("");
		}
		sc.close();
	}
}
