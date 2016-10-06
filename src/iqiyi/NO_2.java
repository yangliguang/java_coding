package iqiyi;

import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年9月18日下午3:50:42
 * 
 * 
 * 世博南美馆
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
世博会期间，小明计划玩一遍所有南美国家的国家馆。南美一共有10个国家，他们的国家馆一字排开分布在南美大道上，按顺序编号分别为0-9。
小明的游玩方案是这样的
如果玩的人太多，就把馆分成两批，分的方式是在相邻的某两个馆之间插一个牌子；
任选其中一批先玩，另一批以后玩；
如果一批馆还是玩不玩，则继续分为两批；
一批中的馆全部玩完之后，才能玩下一个批馆；
每批馆玩的时候，只能从这批当中编号最小的馆开始，按照相邻的编号逐个玩；
一天至少可以玩一个馆。
十个馆都玩完之后，小明拿出在十个馆盖章的册子，请你根据册子上盖章的顺序，判断小明是否遵守了自己的游玩方案。
 */
public class NO_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			System.out.println("no");
		}
		sc.close();
	}
}
