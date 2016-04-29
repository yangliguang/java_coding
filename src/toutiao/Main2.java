package toutiao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月27日下午7:29:36
 */
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++){
			str[i] = sc.next();
		}
		sc.close();
		int[] count = new int[10];
		int[] zero = new int[10];
		for(int ii = 0; ii < n; ii++){
			String s = str[ii];
			zero[s.charAt(0)-'A'] = 1;
			for(int i = 0; i < s.length();i++){
				char c = s.charAt(i);
				count[c-'A'] += (int)(Math.pow(10, s.length()-1-i));
			}
		}
		int sum = 0;
		
		int[] value = new int[10];
		int min_index_k = 0;
		int min_k = count[0];
		for(int k = 1; k < 10; k++){
			if(zero[k] != 1 && count[k] < min_k){
				min_index_k = k;
				min_k = count[k];
			}
		}
		count[min_index_k] = -1;
		/*for(int j = 1; j < 10; j++){
			int min = Integer.MAX_VALUE;
			int min_index = 0;
			for(int i = 0; i < 10; i++){
				if(count[i] != -1 && count[i] < min){
					min = count[i];
					min_index = i;
				}
			}
			value[min_index] = j;
			sum += j*min;
			count[min_index]=-1;
		}*/
		Arrays.sort(count);
		for(int i = 1; i < 10; i++){
			sum += (count[i] * i);
		}
		
		System.out.println(sum);
	}
}
