package leetcode;

import java.util.Stack;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月10日下午11:48:14
 */
public class NO_020 {
	public static void main(String[] args) {
		System.out.println(new NO_020().isValid("(]"));
	}
	public boolean isValid(String s) {
		if(s == null || "".equals(s)) return false;
		char[] ch = s.toCharArray();
		if((ch.length & 1) == 1) return false;
		Stack<Character> st = new Stack<Character>();
		for(int i = 0; i < ch.length; i++){
			if(st.isEmpty())
				st.push(ch[i]);
			else{
				if((ch[i] == ')' && st.peek() == '(') || 
						(ch[i] == ']' && st.peek() == '[') || 
						(ch[i] == '}' && st.peek() == '{')){
					st.pop();
					continue;
				} else
					st.push(ch[i]);
			}
		}
		return st.isEmpty();
    }
}
