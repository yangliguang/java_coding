package ccf_cap;

import java.util.Scanner;
import java.util.Stack;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月7日下午3:41:48
 */
public class Before201312NO_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0; i < (int)Math.pow(4, n); i++){
			if(judge(to4(i,n), n))
				count++;
		}
		System.out.println(count);
		
	}
	public static boolean judge(String num, int n){
		if(num.toCharArray()[0] == '0')
			return false;
		else{
			int n0 = 0;
			int n1 = 0;
			int n2 = 0;
			int n3 = 0;
			int[] a0 = new int[n];
			int[] a1 = new int[n];
			int[] a2 = new int[n];
			int[] a3 = new int[n];
			for(int i = 0; i < num.toCharArray().length; i++){
				switch(num.toCharArray()[i]){
					case '0': {
						n0++;
						a0[n0-1] = i;
						break;
					}
					case '1': {
						n1++;
						a1[n1-1] = i;
						break;
					}
					case '2':{
						n2++;
						a2[n2-1] = i;
						break;
					}
					case '3':{
						n3++;
						a3[n3-1] = i;
						break;
					}
				}
			}
			if(n0>0&&n1>0&&n2>0&&n3>0&&a0[n0-1]<a1[0]&&a2[n2-1]<a3[0])
				return true;
			
				
			else
				return false;
		}
		
	}
	public static String to4(int num, int n){
		StringBuffer str = new StringBuffer("");  
        String digths = "0123";  
        Stack<Character> s = new Stack<Character>();  
        while(num != 0){  
            s.push(digths.charAt(num%4));  
            num/=4;  
        }
        for(int i = 0; i < n - s.size(); i++){
        	str.append('0');
        }
        while(!s.isEmpty()){  
            str.append(s.pop());  
        }  
        return str.toString();  
	}
}
