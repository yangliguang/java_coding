package youdao;

import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年8月17日下午7:06:19
 * 
 * 洗牌
Time Limit: 2000/1000 MS (Java/Others) Memory Limit: 65536/65536 K (Java/Others)
Problem Description:
洗牌在生活中十分常见，现在需要写一个程序模拟洗牌的过程。
现在需要洗2n张牌，从上到下依次是第1张，第2张，第3张一直到第2n张。首先，我们把这2n张牌分成两堆，左手拿着第1张到第n张（上半堆），右手拿着第n+1张到第2n张（下半堆）。接着就开始洗牌的过程，先放下右手的最后一张牌，再放下左手的最后一张牌，接着放下右手的倒数第二张牌，再放下左手的倒数第二张牌，直到最后放下左手的第一张牌。接着把牌合并起来就可以了。
例如有6张牌，最开始牌的序列是1,2,3,4,5,6。首先分成两组，左手拿着1,2,3；右手拿着4,5,6。在洗牌过程中按顺序放下了6,3,5,2,4,1。把这六张牌再次合成一组牌之后，我们按照从上往下的顺序看这组牌，就变成了序列1,4,2,5,3,6。
现在给出一个原始牌组，请输出这副牌洗牌k次之后从上往下的序列。

输入
第一行一个数T(T<=100)，表示数据组数。对于每组数据，第一行两个数n,k(1<=n,k<=100)，接下来一行有2n个数a1,a2,...,a2n(1<=ai<=1000000000)。表示原始牌组从上到下的序列。

输出
对于每组数据，输出一行，最终的序列。数字之间用空格隔开，不要在行末输出多余的空格。

样例输入
3
3 1
1 2 3 4 5 6
3 2
1 2 3 4 5 6
2 2
1 1 1 1
样例输出
1 4 2 5 3 6
1 5 4 3 2 6
1 1 1 1
 */
public class NO_1 {
	public static void main(String[] args) {
//		int[] no = {1,2,3,4,5,6};
//		System.out.println(array2String(wash(3,1,no)));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n,k;
		int[] no;
		for(int i = 0; i < T; i++) {
			n = sc.nextInt();
			k = sc.nextInt();
			no = new int[2*n];
			for(int j = 0; j < 2*n; j++) {
				no[j] = sc.nextInt();
			}
			System.out.println(array2String(wash(n,k,no)));
		}
	}
	public static String array2String(int[] no) {
		if(no.length > 0) {
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < no.length - 1; i++) {
				sb.append(no[i]);
				sb.append(" ");
			}
			sb.append(no[no.length-1]);
			return sb.toString();
		}
		else
			return "";
		
	}
	public static int[] wash(int n, int k, int[] no) {
		for(int i = 0; i < k; i++) {
			no = wash(n, no);
		}
		return no;
	}
	public static int[] wash(int n, int[] no) {
		int[] no2 = new int[2*n];
		int index = 2*n-1;
		for(int i = 0; i < n; i++) {
			no2[index--] = no[2*n-1-i];
			no2[index--] = no[n-1-i];
		}
		return no2;
	}
}
