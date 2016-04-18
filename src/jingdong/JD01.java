package jingdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月8日下午7:05:15
 */
public class JD01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String start = sc.next();
			String to = sc.next();
			int x = to.charAt(0)-start.charAt(0);
			int y = to.charAt(1)-start.charAt(1);
			List<String> list = new ArrayList<String>();
			list = cal2(x,y,list);
			System.out.println(list.size());
			for(String str : list)
				System.out.println(str);
		}
	}
	
	static List<String> cal2(int x, int y, List<String> list){
		if(x == 0){
			String str = (y > 0) ? "U" : "D";
			int in = y > 0 ? y : -y;
			for(int i = 0; i < in; i++){
				list.add(str);
			}
			return list;
		}
		else if(y == 0){
			String str = (x > 0) ? "R" : "L";
			int in = x > 0 ? x : -x;
			for(int i = 0; i < in; i++){
				list.add(str);
			}
			return list;
		} else{
			if(x > 0 && y > 0){
				list.add("RU");
				x--;
				y--;
				return cal2(x, y, list);
			} else if(x > 0 && y < 0){
				list.add("RD");
				x--;
				y++;
				return cal2(x, y, list);
			} else if(x < 0 && y < 0){
				list.add("LD");
				x++;
				y++;
				return cal2(x,y,list);
			} else{
				list.add("LU");
				x++;
				y--;
				return cal2(x,y,list);
			}
		}
	}
}
