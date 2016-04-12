package ccf_cap.before_201403;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月7日下午6:32:14
 */
public class NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1[] = new int[n];
		int a2[] = new int[n];
		for(int i = 0; i < n; i++){
			a1[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			a2[i] = 0;
			for(int j = 0; j < n; j++){
				if(a1[i] + a1[j] == 0){
					a2[i] = 1;
					break;
				}
			}
		}
		int count = 0;
		for(int i = 0; i < n; i++){
			count += a2[i];
		}
		System.out.println(count/2);
	}
}
