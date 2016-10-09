package tools;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 类说明
 * @Author yangliguang
 * 2016年10月6日下午9:23:32
 */
public class FindDuplicationNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] numbers = str.split(" ");
		int[] n = new int[numbers.length];
		for(int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(numbers[i]);
		}
//		System.out.println(usingHash(n));
		//设取值为1-1000
//		System.out.println(usingArrayMark(n, 1000));
//		System.out.println(usingHeapsort(n));
		System.out.println(usingSum(n, 5));
		System.out.println(usingXor(n, 5));
	}
	
	public static int usingHash(int[] n) {
		Set<Integer> hs = new HashSet<Integer>();
		for(int i : n)
			if(!hs.add(i))
				return i;
		return 0;
	}
	
	public static int usingArrayMark(int[] n, int max) {
		int[] mark = new int[max+1];
		for(int i : n)
			if(mark[i] == 0)
				mark[i] = 1;
			else
				return i;
		return 0;
	}
	
	public static int usingHeapsort(int[] n) {
		return n[0];
	}
	
	//取值1-n,共n+1个数
	public static int usingSum(int[] a, int n) {
		int sum = 0;
		for(int i : a)
			sum += i;
		return sum - (1+n)*n/2;
	}
	
	public static int usingXor(int[] a, int n) {
		int ret1 = 0;
		int ret2 = 0;
		for(int i : a)
			ret1 ^= i;
		for(int i = 0; i <= n; i++)
			ret2 ^= i;
		return ret1 ^ ret2;
	}
}
