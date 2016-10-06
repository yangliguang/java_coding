package youdao;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年8月17日下午7:39:49
 * 
 * 
 * 构造队列
Time Limit: 4000/2000 MS (Java/Others) Memory Limit: 65536/65536 K (Java/Others)
Problem Description:
小明同学把1到n这n个数字按照一定的顺序放入了一个队列Q中。现在他对队列Q执行了如下程序：
while(!Q.empty())              //队列不空，执行循环
         {
                   int x=Q.front();            //取出当前队头的值x
                   Q.pop();                 //弹出当前队头
                   Q.push(x);               //把x放入队尾
                   x=Q.front();              //取出这时候队头的值
                   printf("%d\n",x);          //输出x
                   Q.pop();                 //弹出这时候的队头
         }
做取出队头的值操作的时候，并不弹出当前队头。
小明同学发现，这段程序恰好按顺序输出了1,2,3,...,n。现在小明想让你构造出原始的队列，你能做到吗？
输入
第一行一个整数T（T<=100）表示数据组数，每组数据输入一个数n（1<=n<=100000），输入的所有n之和不超过200000。
输出
对于每组数据，输出一行，表示原始的队列。数字之间用一个空格隔开，不要在行末输出多余的空格。

样例输入
4
1
2
5
10
样例输出
1
2 1
2 1 3
8 1 6 2 10 3 7 4 9 5
 */
public class NO_2 {
	public static void main(String[] args) {
		NO_2 m = new  NO_2();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n;
		for(int i = 0; i < T; i++) {
			n = sc.nextInt();
			System.out.println(array2String(cal(m, n)));
		}
	}
	
	public static QueueQT<Integer> cal(NO_2 m, int n) {
		QueueQT<Integer> q1 = m.new QueueQT<Integer>();
		QueueQT<Integer> q2 = m.new QueueQT<Integer>();
		for(int i = 1; i <= n; i++)
			q1.insertRight(i);
		int x,y;
		while(!q1.isEmpty()) {
			x = q1.peekRight();
			q1.removeRight();
			q2.insertLeft(x);
			
			y = q2.peekRight();
			q2.removeRight();
			q2.insertLeft(y);
		}
		return q2;
	}
	
	public class QueueQT<T> {
		  private LinkedList<T> list;

		  public QueueQT() {
		    list = new LinkedList<T>();
		  }

		  // 插入队头
		  public void insertLeft(T t) {
		    list.addFirst(t);
		  }

		  // 插入队尾
		  public void insertRight(T t) {
		    list.addLast(t);
		  }

		  // 移除队头
		  public T removeLeft() {
		    return list.removeFirst();
		  }

		  // 移除队尾
		  public T removeRight() {
		    return list.removeLast();
		  }

		  // 查看队头
		  public T peekLeft() {
		    return list.getFirst();
		  }

		  // 查看队尾
		  public T peekRight() {
		    return list.getLast();
		  }

		  public boolean isEmpty() {
		    return list.isEmpty();
		  }

		  public int size() {
		    return list.size();
		  }

		}
	
	public static String array2String(QueueQT<Integer> q) {
		StringBuffer sb = new StringBuffer();
		while(!q.isEmpty()) {
			int x = q.peekLeft();
			q.removeLeft();
			sb.append(x);
			sb.append(" ");
		}
		return sb.subSequence(0, sb.length()-1).toString();
	}
}
