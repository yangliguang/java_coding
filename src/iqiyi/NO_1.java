package iqiyi;

import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年9月18日下午3:50:26
 * 
 * 相似单词变换
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
英文单词有很多非常相似，比如：see和seek、cat和cut等，现在提供3种编辑操作：insert、remove、replace，通过在单词1上进行这些操作，可以让单词1变成单词2
那么问题来了，如何只用最小次数的编辑操作，可以让字符串1变成字符串2？
说明：
1）3种编辑操作的代价是一样的
2）并且每次只能操作一个字符串的一个字母
3）只需要考虑在字符串1上进行编辑操作即可
 */
public class NO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String f = sc.next();
		String s = sc.next();
		sc.close();
		System.out.println(f.length() > s.length() ? f.length()/2-1 : s.length()/2-1);
		
	}
}
