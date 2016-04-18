package leetcode.before100.before010;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月11日下午9:48:19
 */
public class NO_003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NO_003 m = new NO_003();
		while(sc.hasNext())
			System.out.println(m.lengthOfLongestSubstring(sc.next()));
	}
	public int lengthOfLongestSubstring(String s) {
		if(s=="" || s.equals("")){
			return 0;
		} else{
			char[] c = s.toCharArray();
			int max = 1;
			for(int i = 0; i < c.length -1; i++){
				int temp = 1;
				int j = i + 1;
	        	while(j<c.length  && cal(c,i,j)){
	        		temp++;
	        		j++;
	        	}
	        	if(temp > max)
	        		max = temp;
	        }
			return max;
		}
		
    }
	public boolean cal(char[] c, int i, int j){
		for(int ii = i; ii < j; ii++){
			if(c[ii] == c[j])
				return false;
		}
		return true;
	}
}
