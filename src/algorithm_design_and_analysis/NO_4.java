package algorithm_design_and_analysis;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:参考
 * http://stackoverflow.com/questions/3963409/dealing-with-m-occurrences-among-n/3963887
 * Date: 2016年4月15日下午9:52:52
 */
public class NO_4 {
	public static void main(String[] args) {
		long i = 5;
		//System.out.println("test:" + Integer.toBinaryString(i));
//		System.out.println(1 << 3);
//		System.out.println("here");
//		System.out.println(i%2);
//		System.out.println((i >> 1)%2);
//		System.out.println((i >> 2)%2);
//		System.out.println((i >> 3)%2);
//		System.out.println((i >> 4) % 2);
//		System.out.println((i >> 5) % 2);
//		System.out.println((i >> 6) % 2);
//		System.out.println((i >> 7) % 2);
		//System.out.println(5);
		//long[] p = {5,11,5,2,11,5,2,11};
		//System.out.println(Integer.toBinaryString(1000));
		//long[] p = {5,11,5,199,11,5,199,11};
		long[] p = {888,888,999,999,12,12,888,12};
		NO_4 t = new NO_4();
		t.cal(p, 3, 2);		
	}
	
	public long cal(long[] p, int n, int m){
		int[] r = new int[64];
		for(int i = 0; i < 64; i++){
			int sum = 0;
			for(int j = 0; j < p.length; j++){
				sum += (p[j] >> i)%2;  
			}
			r[i] = (sum%n == 0) ? 0 : 1;
		}
		long result = 0;
		for(int i = 0; i < 64; i++){
			result += ((1<<i) * r[i]);
			System.out.print(r[i]+" ");
		}
		System.out.println();
		System.out.println(result);
			
		return result;
	}
}
