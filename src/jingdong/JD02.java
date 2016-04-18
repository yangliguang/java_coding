package jingdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月8日下午7:56:50
 */
public class JD02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int d = sc.nextInt();
			int sum = sc.nextInt();
			String[] strs = new String[d];
			for(int i = 0; i < d; i++){
				strs[i] = sc.nextInt() + " " + sc.nextInt();
			}
			String s = cal(strs, sum);
			if(!s.equals("No")){
				System.out.println("Yes");
				System.out.println(s);
			} else
				System.out.println("No");
			
		}
	}
	static String cal(String[] strs, int sum){
		int min = 0, max = 0;
		for(String str : strs){
			min += Integer.parseInt(str.split(" ")[0]);
			max += Integer.parseInt(str.split(" ")[1]);
		}
		if(sum < min || sum > max)
			return "No";
		else{
			int[] per_min = new int[strs.length];
			int[] per_max = new int[strs.length];
			int[] me = new int[strs.length];
			for(int i = 0; i < strs.length; i++){
				per_min[i] = Integer.parseInt(strs[i].split(" ")[0]);
				per_max[i] = Integer.parseInt(strs[i].split(" ")[1]);
			}
			int bal = sum - min;
			for(int i = 0; i < strs.length; i++){
				if(bal >= (per_max[i]-per_min[i])){
					me[i] = per_max[i];
					bal -= (per_max[i]-per_min[i]);
				} else if(bal > 0 && bal < (per_max[i]-per_min[i])){
					me[i] = per_min[i] + bal;
					bal = 0;
				} else{
					me[i] = per_min[i];
				}
			}
			String s = new String();
			for(int i = 0; i < strs.length-1; i++){
				s += me[i] + " ";
			}
			s += me[strs.length-1];
			return s;
			
		}
	} 
}
