package ccf_cap.before_201509;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月9日下午5:16:42
 */
public class NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(a[0]);
		//if n == 0
		if(n > 1){
			for(int i = 1; i < n; i++){
				if(a[i] != list.get(list.size()-1)){
					list.add(a[i]);
				}
			}
		}
		System.out.println(list.size());
	}
}
