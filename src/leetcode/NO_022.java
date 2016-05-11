package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月11日上午9:49:36
 */
public class NO_022 {
	public static void main(String[] args) {
		List<String> l = new NO_022().generateParenthesis(2);
		for(String s : l)
			System.out.print(s+" ");
		System.out.println("finish!");
	}
	public List<String> generateParenthesis(int n) {
        if(n < 1) return null;
        List<String> res = new ArrayList<>();
        if(n == 1) {res.add("()"); return res;};
        StringBuffer sb = new StringBuffer();
        Set<String> hs = new HashSet<>();
        List<String> prev = generateParenthesis(n-1);
        for(String s : prev){
        	for(int i = 0; i < s.length(); i++){
        		sb.setLength(0);
        		sb.append(s);
        		sb.insert(i, "()");
        		hs.add(sb.toString());
        	}
        }
        String[] str = new String[hs.size()];
        return Arrays.asList(hs.toArray(str));
        
    }
}
