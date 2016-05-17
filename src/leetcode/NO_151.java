package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月17日下午4:44:51
 */
public class NO_151 {
	public static void main(String[] args) {
		System.out.println(new NO_151().reverseWords(" a    b  "));
	}
	public String reverseWords(String s) {
		s = s.replaceAll("\\s+", " ");
		s = s.trim();
		if(s.equals("") || s.equals(" "))
			return "";
        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = words.length-1; i > 0; i--){
        	sb.append(words[i]);
        	sb.append(" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
}
