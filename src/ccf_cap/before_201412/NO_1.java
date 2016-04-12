package ccf_cap.before_201412;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月8日下午5:56:22
 */
public class NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] record = new int[n];
		int[] count = new int[n];
		for(int i = 0; i < n; i++){
			record[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			int temp = 0;
			for(int j = 0; j <= i; j++){
				if(record[i] == record[j])
					temp++;
			}
			count[i] = temp;
		}
		for(int i = 0; i < count.length-1; i++){
			System.out.print(count[i] + " ");
		}
		System.out.println(count[count.length-1]);
	}
}
