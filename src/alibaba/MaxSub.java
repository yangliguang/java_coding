package alibaba;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * 2015秋招 附加题3
 * 求两个字符串最大的连续出现的公共部分 列如query为acbac，text为acaccbabb那么公共子串为cba 长度为3
 * Date: 2016年4月20日下午3:43:12
 */
public class MaxSub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		String min = a.length() <= b.length() ? a : b;
		String max = a.length() > b.length() ? a : b;
		System.out.println(maxsub(min, max));
	}
	static String maxsub(String min, String max){
		for(int start = 0; start < min.length(); start++){
			for(int end = min.length();end > start; end--){
				if(max.contains(min.substring(start, end)))
					return min.substring(start, end);
			}
		}
		return "";
	}
}
