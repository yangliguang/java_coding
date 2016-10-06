package sohu;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年9月21日下午3:34:10
 */
public class NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			System.out.println(handle(str));
		}
		sc.close();
	}
	public static int handle(String str) {
		HashSet<Character> hs = new HashSet<Character>();
		for(char ch : str.toCharArray())
			hs.add(ch);
		if(hs.contains('A') && hs.contains('B') && hs.contains('C') && hs.contains('D') && hs.contains('E')) {
			hs.clear();
			HashSet<Integer> ret = new HashSet<Integer>();
			for(int i = 0; i < str.length(); i++) {
				for(int j = i; j <= i + getMin(ret, str.length()); j++) {
					char c;
					if(j > str.length() -1)
						c = str.charAt(j-str.length());
					else
						c = str.charAt(j);
					if(isValid(c)) {
						hs.add(c);
						if(hs.size() == 5) {
							if(j-i+1 == 5)
								return str.length() - 5;
							
							ret.add(j-i+1);
							hs.clear();
							break;
						}
					}
				}
			}
			if(ret == null || ret.size() == 0)
				return 0;
			else
				return str.length() - getMin(ret, str.length());
		}
		else
			return 0;
	}
	
	public static boolean isValid(char c) {
		if(c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E')
			return true;
		else
			return false;
	}
	public static int getMin(HashSet<Integer> ret, int all) {
		if(ret == null || ret.size() == 0)
			return all;
		int min = all;
		for(int i : ret) {
			if(i < min)
				min = i;
		}
		return min;
	}
}
