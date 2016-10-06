package youdao;

import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年8月17日上午11:16:35
 * 
 * 水仙花数

（编程题须知） （参考答案） 
Time Limit: 2000/2000 MS (Java/Others) Memory Limit: 32768/32768 K (Java/Others)
Problem Description:
春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，他是这样定义的：
“水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。
现在要求输出所有在m和n范围内的水仙花数。
输入
输入数据有多组，每组占一行，包括两个整数m和n（100<=m<=n<=999）。
输出
对于每个测试实例，要求输出所有在给定范围内的水仙花数，就是说，输出的水仙花数必须大于等于m,并且小于等于n，如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开;
如果给定的范围内不存在水仙花数，则输出no;
每个测试实例的输出占一行。

样例输入
100 120
300 380
样例输出
no
370 371
 */
public class Training_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		while(sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			System.out.println(count(n, m));
		}
	}
	
	public static String count(int n, int m) {
		StringBuffer sb = new StringBuffer();
		for(int i = n; i <= m; i++) {
			if(isSatisfied(i)) {
				sb.append(i);
				sb.append(" ");
			}
		}
		if(sb.length() > 1)
			return sb.subSequence(0, sb.length()).toString();
		else
			return "no";
	}
	
	public static boolean isSatisfied(int n) {
		int sum = 0, nn = n;
		while(n > 0) {
			sum += Math.pow(n%10, 3);
			n /= 10;
		}
		return sum == nn;
	} 
}
