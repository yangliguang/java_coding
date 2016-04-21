package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月21日上午11:19:37
 */
public class NO_014 {
	public static void main(String[] args) {
//		String[] strs = {"test","test","tst","tstststttst"};
//		String[] strs = {"test","est"};
		String[] strs = {"ca","c"};
		NO_014 m = new NO_014();
		System.out.println(m.longestCommonPrefix(strs));
	}
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)
			return "";
		if(strs.length < 2)
			return strs[0];
		int min = strs[0].length();
		int index = 0;
		for(int i = 1; i < strs.length; i++){
			if(strs[i].length() < min){
				min = strs[i].length();
				index = i;
			}
		}
		
		String s = strs[index];
		int start = 0;
		int end = strs[index].length()-1;
		String longest = "";
		//for(;start<=end && (end-start+1)>longest.length();start++){
			for(;start<=end;end--){
				if(isStart(strs,s.substring(start,end+1)) && s.substring(start,end+1).length() > longest.length())
					longest = s.substring(start,end+1);
			}
		//}
        return longest;
    }
	public boolean isStart(String[] strs, String s){
		for(String ss : strs){
			if(ss.startsWith(s))
				continue;
			else
				return false;
		}
		return true;
	}
}
