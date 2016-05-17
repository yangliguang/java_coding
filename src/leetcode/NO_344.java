package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月17日下午5:19:46
 */
public class NO_344 {
	public static void main(String[] args) {
		System.out.println(new NO_344().reverseString("test "));
	}
	public String reverseString(String s) {
        char[] c = s.toCharArray();
        char temp;
        for(int i = 0; i < c.length/2; i++){
        	temp = c[i];
        	c[i] = c[c.length-1-i];
        	c[c.length-1-i] = temp;
        }
        return String.copyValueOf(c);
    }
}
