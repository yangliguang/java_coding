package leetcode.before100;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月13日下午5:57:35
 */
public class NO_008 {
	public int myAtoi(String str) {
		if("".equals(str) || str == "")
			return 0;
		while(str.charAt(0) == ' '){
			if(str.length()>1)
				str = str.substring(1);
		}
		str = str.split(" ")[0];
		
		char ch = str.charAt(0);
		if(ch != '-' && ch != '+' && (ch<48 || ch>57))
			return 0;
		
		for(int i = 1; i < str.length(); i++){
			char c = str.charAt(i);
			if(c<48 || c>57)
				str = str.substring(0,i);
		}
		
		if(str.equals("+") || str.equals("-"))
			return 0;
		
		try{
			if(str.startsWith("+") || str.startsWith("-")){
				while(str.charAt(1) == '0'){
					if(str.substring(1) == "")
						return 0;
					if(str.length() == 2)
						return 0;
					str = str.charAt(0) + str.substring(2);
				}
			} else {
				while(str.charAt(0) == '0'){
					if(str.equals("0"))
						return 0;
					str = str.substring(1);
				}
			}
			long l = Long.parseLong(str);
			if(l > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else if(l < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			else
				return (int)l;
		} catch(Exception e){
			if(str.startsWith("-"))
				return Integer.MIN_VALUE;
			else
				return Integer.MAX_VALUE;
		}
		
    }
	public static void main(String[] args) {
		NO_008 m = new NO_008();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			System.out.println(m.myAtoi(sc.nextLine()));
		}
	}
}
