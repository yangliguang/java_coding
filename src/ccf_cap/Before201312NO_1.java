package ccf_cap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月7日下午1:04:44
 */
public class Before201312NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s1 = new int[1000];
		int[] s2 = new int[1000];
		for(int i = 0; i < n; i++){
			s1[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			s2[i] = 0;
			for(int j = 0; j < n; j++){
				if(s1[j] == s1[i])
					s2[i]++;
			}
		}
	
		int max_index = 0;
		for(int i = 0; i < n; i++){
			if(s2[i] >= s2[max_index])
				max_index = i;
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			if(s2[i] == s2[max_index])
				list.add(i);
		}
		int min_index = list.get(0);
		for(int i : list){
			if(s1[i] < s1[min_index])
				min_index = i;
		}
		System.out.println(s1[min_index]);
	}
}
