package algorithm_design_and_analysis;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * http://www.cplusplus.com/forum/beginner/73186/
 * Date: 2016年4月15日下午9:42:02
 */
public class NO_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] p = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				p[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	
	public int cal(int[][] p, int n){
		//int p2 = new int[n][n];
		return 0;
	}
}
