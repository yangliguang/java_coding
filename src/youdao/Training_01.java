package youdao;

import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年8月17日上午11:16:22
 * 求数列的和

（编程题须知）（参考答案）
Time Limit: 2000/2000 MS (Java/Others) Memory Limit: 32768/32768 K (Java/Others)
Problem Description:
数列的定义如下：
数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
输入
输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。
输出
对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。

样例输入
81 4
2 2
样例输出
94.73
3.41
 */
public class Training_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		double n, sum;
		while(sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			sum = 0;
			for(int i = 0; i < m; i++) {
				sum += n;
				n = Math.sqrt(n);
			}
			System.out.printf("%.2f", sum);
			System.out.println();
		}
	}
}
