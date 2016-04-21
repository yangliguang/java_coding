package ccf_cap;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月7日下午1:24:40
 */
public class Before201312NO_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String isbn = new String(sc.next());
		String number = new String();
		for(String str : isbn.split("-")){
			number += str;
		}
		int count = 0;
		for(int i = 1; i < number.length(); i++){
			count += Integer.parseInt(number.charAt(i-1)+"")*i;
		}
		int state = count%11;
		if(state < 10){
			if(!"X".equals(number.charAt(number.length()-1)+"")){
				if(state == Integer.parseInt(number.charAt(number.length()-1)+""))
					System.out.println("Right");
				else
					System.out.println(isbn.substring(0,isbn.length()-1)+state);
			}
			else
				System.out.println(isbn.substring(0,isbn.length()-1)+state);
		}
		else{
			if("X".equals(number.charAt(number.length()-1)+"")){
				System.out.println("Right");
			}
			else
				System.out.println(isbn.substring(0,isbn.length()-1)+"X");
		}
	}
}
