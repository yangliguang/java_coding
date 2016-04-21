package ccf_cap;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月8日下午5:13:35
 */
public class Before201409NO_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int sensitive = sc.nextInt();
		int n = sc.nextInt();
		String[] strs = new String[n];
		String[] strs2 = new String[n];
		for(int i = 0; i < n; i++){
			strs[i] = sc.next();
		}
		for(int i = 0; i < strs.length; i++){
			strs2[i] = strs[i];
		}
		if(sensitive == 0){
			s = s.toLowerCase();
			for(int i = 0; i < strs.length; i++){
				strs[i] = strs[i].toLowerCase();
			}
		}
		
		for(int i = 0; i < strs.length; i++){
			if(strs[i].contains(s))
				System.out.println(strs2[i]);
		}
	}
}
