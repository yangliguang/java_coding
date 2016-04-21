package leetcode;

import java.util.Scanner;

import test.Template;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月14日下午3:45:41
 */
public class NO_009 {
	public static void main(String[] args) {
		NO_009 t = new NO_009();
		Scanner sc = new Scanner(System.in);
		System.out.println(t.isPalindrome(Integer.MIN_VALUE));
		while(sc.hasNextInt())
			System.out.println(t.isPalindrome(sc.nextInt()));
	}
	public boolean isPalindrome(int x) {
		if(x < 0)
			return false;
        int r = 0;
        int s = x;
        while(x!=0){
        	r = r*10 + x%10;
        	x /= 10;
        }
        System.out.println(r);
        if(r == s)
        	return true;
        else
        	return false;
        	
    }
}
