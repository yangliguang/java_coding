package ccf_cap.before_201503;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月12日下午8:14:50
 */
public class NO_4 {
	public static void main(String[] args) {
		NO_4 m = new NO_4();
		Scanner sc = new Scanner(System.in);
		int switch_n = sc.nextInt();
		int terminal_n = sc.nextInt();
		int n = switch_n + terminal_n;
		Terminal[] terminals = new Terminal[n];
		terminals[0] = m.new Terminal(1,0);
		for(int i = 1; i < switch_n; i++){
			terminals[i] = m.new Terminal(i+1, sc.nextInt());
		}
		for(int i = switch_n; i < n; i++){
			terminals[i] = m.new Terminal(i+1, sc.nextInt());
		}
		for(int i = 1; i < n; i++){
			terminals[i].addAccess(terminals[i].pi);
			terminals[terminals[i].pi-1].addAccess(i+1);
		}
		
		int max = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				terminals[j].length = 0;
				terminals[j].color = 0;
			}
			m.DFS(terminals, i);
			int temp = 0;
			for(int j = 0; j < n; j++){
				if(terminals[j].length > temp)
					temp = terminals[j].length;
			}
			if(temp > max)
				max = temp;
		}
		System.out.println(max);
	}
	public void DFS(Terminal[] terminals, int u){
		terminals[u].color = 1;
		Queue<Integer> q = new PriorityQueue<Integer>();
		for(int i : terminals[u].access){
			if(terminals[i-1].color == 0){
				q.offer(i);
			}
		}
		if(q.size() > 0){
			for(int i : q){
				terminals[i-1].addLength(terminals[u].length);
				DFS(terminals, i-1);
			}
		}
	}
	
	//public 
	
	public class Terminal{
		//编号
		public int number;
		//白色为0，黑色为1
		public int color;
		//前驱交换机编号
		public int pi;
		
		public PriorityQueue<Integer> access;
		
		public int length;
		public Terminal(int number, int pi){
			this.number = number;
			this.pi = pi;
			this.color = 0;
			this.access = new PriorityQueue<Integer>();
		}
		
		public void addAccess(int i){
			this.access.offer(i);
		}
		public void addLength(int l){
			this.length = l + 1;
		}
	}
}
