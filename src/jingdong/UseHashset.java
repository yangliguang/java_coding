package jingdong;

import java.util.HashSet;

/**
 * Author:Young
 * Class Comment:
 * input:一个char序列  A B C D E C B A F
 * ouput:第一个不重复的字符
 * hashset本身有去除机制
 * Date: 2016年4月18日下午9:43:24
 */
public class UseHashset {
	public static void main(String[] args) {
		char[] ca = {'A','B','C','D','E','C','B','A','F'};
		HashSet<Character> hs = new HashSet<Character>();
		for(char c : ca){
			int f = hs.size();
			hs.add(c);
			int s = hs.size();
			if(s-f==0)
				System.out.println(c);
		}
	}
}
