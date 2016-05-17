package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月17日下午5:25:36
 */
public class NO_345 {
	public static void main(String[] args) {
		System.out.println(new NO_345().reverseVowels("leetcode"));
	}
	public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int p1 = 0, p2 = c.length-1;
        char temp;
        while(p1 < p2){
        	while(p1 < p2 && !judge(c[p1]))
        		p1++;
        	while(p1 < p2 && !judge(c[p2]))
        		p2--;
        	if(p1 < p2){
        		temp = c[p1];
        		c[p1] = c[p2];
        		c[p2] = temp;
        		p1++;
        		p2--;
        	}
        }
        return String.copyValueOf(c);
    }
	public boolean judge(char c){
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
			c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			return true;
		else
			return false;
	}
}
