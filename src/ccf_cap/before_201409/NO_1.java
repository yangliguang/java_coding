package ccf_cap.before_201409;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月8日下午4:43:23
 */
public class NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(a[i]-a[j]==1 || a[i]-a[j]==-1)
					count++;
			}
		}
		System.out.println(count/2);
	}
}
