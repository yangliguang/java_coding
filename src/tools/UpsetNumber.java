package tools;

import java.util.Scanner;

/**
 * 类说明:生成手机号码，根据阿拉伯数字，生成中文，字符等格式号码
 * @Author yangliguang
 * 2016年9月24日上午11:00:37
 */
public class UpsetNumber {
	public static void main(String[] args) {
		System.out.println("请输入号码：");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(gen(sc.next()));
			System.out.println("请输入号码：");
		}
		sc.close();
	}
	
	public static String gen(String str) {
		StringBuffer sb = new StringBuffer();
		for(char c : str.toCharArray()) {
			if(isNumber(c))
				sb.append(format(c));
			else
				return "输入格式错误，非纯数字！";
				
		}
		return sb.toString();
	}
	
	public static boolean isNumber(char ch) {
		if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9')
			return true;
		else return false;
	}
	
	public static String format(char c) {
		String[][] f = {
				{"0", "一", "二", "三", "四", "五", "六", "七", "八", "九"},
				{"0", "①", "②", "③", "④", "⑤", "⑥", "⑦", "⑧", "⑨"},
				{"0", "⑴", "⑵", "⑶", "⑷", "⑸", "⑹", "⑺", "⑻", "⑼"}
		};
		int random = (int)(Math.random() * 3);
		return f[random][c - 48];
	} 
}
