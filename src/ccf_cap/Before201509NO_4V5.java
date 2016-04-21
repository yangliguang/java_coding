package ccf_cap;

import java.util.PriorityQueue;
import java.util.Scanner;


/**
 * Author:Young Class Comment: Date: 2015年12月28日下午4:54:55
 */
public class Before201509NO_4V5 {
	public static void main(String[] args) {
		Before201509NO_4V5 m = new Before201509NO_4V5();
		Scanner sc = new Scanner(System.in);
		int city_n = sc.nextInt();
		int road_n = sc.nextInt();
		city[] citys = new city[city_n];
		road[] roads = new road[road_n];
		for (int i = 0; i < city_n; i++) {
			citys[i] = m.new city(i + 1);
		}
		for (int i = 0; i < road_n; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			roads[i] = m.new road(start, end);
			citys[start - 1].addAccess(end);
		}
		sc.close();

		int count = 0;
		
		System.out.println(1111);
		
	}

	public class city {
		public int number;
		public int color;
		public PriorityQueue<Integer> access;
		public PriorityQueue<Integer> accesses;

		public city(int number) {
			this.number = number;
			this.color = 0;
			this.access = new PriorityQueue<Integer>();
			this.accesses = new PriorityQueue<Integer>();
		}

		public void addAccess(int a) {
			this.access.offer(a);
		}

		public void addAccesses(int a) {
			this.accesses.offer(a);
		}

	}

	public class road {
		public int start;
		public int end;

		public road() {
		}

		public road(int start, int end) {
			this.start = start;
			this.end = end;
		}

	}

}
