package toutiao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年9月28日下午7:25:12
 * String Shifting
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
我们规定对一个字符串的shift操作如下：
shift(“ABCD”, 0) = “ABCD”
shift(“ABCD”, 1) = “BCDA”
shift(“ABCD”, 2) = “CDAB”

换言之, 我们把最左侧的N个字符剪切下来, 按序附加到了右侧。
给定一个长度为n的字符串，我们规定最多可以进行n次向左的循环shift操作。如果shift(string, x) = string (0 <= x < n), 我们称其为一次匹配(match)。求在shift过程中出现匹配的次数。
输入
输入仅包括一个给定的字符串，只包含大小写字符。
输出
输出仅包括一行，即所求的匹配次数。

样例输入
byebyebye
样例输出
3

Hint
数据范围
对于40%的数据，字符串长度不超过100；
对于100%的数据，字符串长度不超过10^6。
 */
public class NO_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
			StringBuffer sb = new StringBuffer(str);
			sb.append(str.substring(0, i));
			if(isEquals(str, sb.toString().substring(i)))
				count++;
		}
		System.out.println(count);
		
		/*char[] a = str.toCharArray();
		int length = a.length;
		int count = 1;
		int[] index = new int[length];
		for(int ii = 1; ii < length; ii++)
			if(a[0] == a[ii])
				index[ii] = 1;

		for(int i = 1; i < length; i++) {
			if(index[i] == 1) {
				StringBuffer sb = new StringBuffer(str);
				sb.append(str.substring(0, i));
				char[] b = sb.toString().substring(i).toCharArray();
				if(isEquals2(a, b))
					count++;
			}
		}
		System.out.println(count);*/
	}
	
	public static boolean isEquals(char[] a, char[] b) {
		for(int i = 0; i < a.length; i++)
			if(a[i] != b[i])
				return false;
		return true;
	}
	
	public static boolean isEquals2(char[] a, char[] b) {
		for(int i = a.length-1; i >= 0; i--)
			if(a[i] != b[i])
				return false;
		return true;
	}
	
	public static boolean isEquals3(char[] a, char[] b) {
		for(int i = 0, j = a.length-1; i < j; i++,j--)
			if(a[i] != b[i] || a[j] != b[j])
				return false;
		return true;
	}
	
	public static boolean isEquals(String a, String b) {
		for(int i = 0, j = a.length()-1; i < j; i++,j--)
			if(a.charAt(i) != b.charAt(i) || a.charAt(j) != b.charAt(j))
				return false;
		return true;
	}
}
