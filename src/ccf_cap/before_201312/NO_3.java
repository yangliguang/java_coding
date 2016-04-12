package ccf_cap.before_201312;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月7日下午1:49:27
 */
public class NO_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s1 = new int[n];
		int[] s2 = new int[n];
		for(int i = 0; i < n; i++){
			s1[i] = sc.nextInt();
		}
		int[] areas = new int[n];
		for(int i = 0; i < n; i++){
			int[] areas2 = new int[n-i];
			for(int length = 1; length <= (n-i); length++){
				int[] h = new int[length];
				for(int j = 0; j < length; j++){
					h[j] = s1[i+j];
				}
				areas2[length-1] = length*get_min(h);
			}
			areas[i] = get_max(areas2);
		}
		System.out.println(get_max(areas));
	}
	
	public static int get_max(int[] s){
		int max = s[0];
		for(int i : s){
			if(i > max)
				max = i;
		}
		return max;
	}
	
	public static int get_min(int[] s){
		int min = s[0];
		for(int i : s){
			if(i < min)
				min = i;
		}
		return min;
	}
}
