	package youdao;
	
	import java.util.Scanner;
	
	/**
	 * 类说明
	 * @Author yangliguang
	 * 2016年8月17日下午8:21:05
	 * 
	 * 
	 * 查找矩形
	Time Limit: 2000/1000 MS (Java/Others) Memory Limit: 65536/65536 K (Java/Others)
	Problem Description:
	对于一组水平线段及垂直线段，共有n条，已知其中必定存在一个若干条线段组成的矩形，输出这个矩形的左下角和右上角点，定义左下角点有最小的x值和y值，右上角点有最大的x值和y值。
	线段可以重合，线段必须恰好能组成矩形，即线段不能头或尾部超出矩阵边界，如下图：
	
	输入
	第一行为线段数 n (4 <= n <= 25)
	接下来有n行，每行为一条线段的首尾点坐标： xi yi xj yj
	坐标值范围 -1e9 <= x, y <= 1e9
	输出
	在一行输出矩形的左下角点和右上角点坐标：
	xi yi xj yj 
	根据定义有 xi < xj && yi < yj
	
	样例输入
	4
	0 0 0 1
	0 0 1 0
	0 1 1 1
	1 0 1 1 
	样例输出
	​0 0 1 1
	 */
	public class NO_3 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
		}
		
		public class Point {
			int x,y;
			public Point(int x, int y) {
				this.x = x;
				this.y = y;
			}
		}
	}
