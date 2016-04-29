package toutiao;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月27日下午8:29:27
 */
public class Main5 {
	public static void main(String[] args) {
		int n = 2 << 8;
		int n2 = 2 << 9;
		System.out.println(Math.pow(2, 7));
		int count=0;
		for(int i = n+1;i<n2;i++){
			if(5+i==(5|i))
				count++;
		}
		System.out.println(count);
		/*Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int n = 1;
		for(int i = 0; i < k; i++){
			while(x+n != (x|n)){
				n = n << 1;
			}
		}
		System.out.println(n);*/
	}
}
