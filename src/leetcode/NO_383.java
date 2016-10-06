package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类说明
 * @Author yangliguang
 * 2016年8月16日上午10:15:58
 */
public class NO_383 {
	public static void main(String[] args) {
		System.out.println(canConstruct("a", "b"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		List<Character> list = new ArrayList<Character>();
		for(char c : magazine.toCharArray()) {
			Character ch = c;
			list.add(ch);
		}
		for(int i = 0; i < ransomNote.length(); i++) {
			if(list.remove((Character)ransomNote.charAt(i)))
				continue;
			else
				return false;
		}
		return true;
	}
}
