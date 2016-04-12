package ccf_cap.before_201503;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月8日下午11:23:19
 */
public class NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] s1 = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				s1[i][j] = sc.nextInt();
			}
		}
		for(int i = m - 1; i >= 0; i--){
			for(int j = 0; j < n-1; j++){
				System.out.print(s1[j][i]+" ");
			}
			System.out.println(s1[n-1][i]);
		}
		
	}
}
