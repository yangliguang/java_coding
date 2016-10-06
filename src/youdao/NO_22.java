package youdao;

import java.util.LinkedList;
import java.util.Scanner;


/**
 * 类说明
 * @Author yangliguang
 * 2016年8月17日下午8:57:57
 */
public class NO_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n;
		for(int i = 0; i < T; i++) {
			n = sc.nextInt();
			System.out.println(array2String(cal(n)));
		}
	}
	
	public static LinkedList<Integer> cal(int n) {
		LinkedList<Integer> q1 = new LinkedList<Integer>();
		LinkedList<Integer> q2 = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++)
			q1.addLast(i);
		int x,y;
		while(!q1.isEmpty()) {
			x = q1.getLast();
			q1.removeLast();
			q2.addFirst(x);
			
			y = q2.getLast();
			q2.removeLast();
			q2.addFirst(y);
		}
		return q2;
	}
	
	public static String array2String(LinkedList<Integer> q) {
		StringBuffer sb = new StringBuffer();
		while(!q.isEmpty()) {
			int x = q.getFirst();
			q.removeFirst();
			sb.append(x);
			sb.append(" ");
		}
		return sb.subSequence(0, sb.length()-1).toString();
	}
}
