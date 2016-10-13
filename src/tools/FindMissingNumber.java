package tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年10月6日下午8:44:40
 */
public class FindMissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] numbers = str.split(" ");
		int[] n = new int[numbers.length];
		for(int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(numbers[i]);
		}
//		System.out.println(findOne(n));
//		System.out.println(findTwo(n));
//		System.out.println(find1From3(n));
		System.out.println(findnFromm(n, 3, 2));
	}
	
	public static int findOne(int[] n) {
		int a = 0;
		for(int i : n)
			a ^= i;
		return a;
	}
	
	public static String findTwo(int[] n) {
		int a = 0;
		for(int i : n)
			a ^= i;
		int i = 0;
		for(; i < 16; i++) {
			if(((a >> i) & 1) == 1)
				break;
		}
		
		List<Integer> la = new ArrayList<Integer>();
		List<Integer> lb = new ArrayList<Integer>();
		for(int j : n) {
			if(((j >> i) & 1) == 1)
				la.add(j);
			else
				lb.add(j);
		}
		StringBuffer ret = new StringBuffer();
		int[] aa = new int[la.size()];
		int[] bb = new int[lb.size()];
		for(i = 0; i < aa.length; i++)
			aa[i] = la.get(i);
		for(i = 0; i < bb.length; i++)
			bb[i] = lb.get(i);
		
		ret.append(findOne(aa));
		ret.append(" ");
		ret.append(findOne(bb));
		
		return ret.toString();
	}
	
	public static int find1From3(int[] a) {
		int number = 0;
		int sum = 0;
		for(int i = 0; i < 32; i++) {
			for(int aa : a)
				if(((aa >> i) & 1) == 1)
					sum++;
			if(sum % 3 == 1)
				number += (1 << i);
			sum = 0;
		}
		return number;
	}
	
	public static int findnFromm(int[] a, int m, int n) {
		int number = 0;
		int sum = 0;
		for(int i = 0; i < 32; i++) {
			for(int aa : a)
				if(((aa >> i) & 1) == 1)
					sum++;
			if(sum % m != 0)
				number += (1 << i);
			sum = 0;
		}
		return number;
	}
}
