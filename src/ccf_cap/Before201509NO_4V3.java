package ccf_cap;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月14日下午11:08:50
 */
public class Before201509NO_4V3 {
	public static void main(String[] args) {
		Before201509NO_4V3 m = new Before201509NO_4V3();
		Scanner sc = new Scanner(System.in);
		int city_n = sc.nextInt();
		int road_n = sc.nextInt();
		city[] citys = new city[city_n];
		road[] roads = new road[road_n];
		for(int i = 0; i < city_n; i++){
			citys[i] = m.new city(i+1);
		}
		for(int i = 0; i < road_n; i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			roads[i] = m.new road(start, end);
			PriorityQueue<Integer> access = citys[start-1].getAccess();
			access.offer(end);
			citys[start-1].setAccess(access);
		}

		int count = 0;
		for(int i = 0; i < city_n; i++){
			for(int j = 0; j < city_n; j++){
				citys[j].setColor(0);
			}
			citys[i].setColor(1);
			Queue<Integer> q = new PriorityQueue<Integer>();
			q.offer(i+1);
			while(q.size() > 0){
				int first = q.poll();
				PriorityQueue<Integer> a = citys[first-1].getAccess();
				for(int ac : a){
					if(citys[ac-1].getColor() == 0){
						citys[ac-1].setColor(1);
						q.offer(ac);
						PriorityQueue<Integer> accesses = citys[i].getAccesses();
						accesses.offer(ac);
						citys[i].setAccesses(accesses);
						if(citys[ac-1].getAccesses().contains(i+1))
							count++;
					}
				}
			}
		}
		/*for(int i = 0; i < city_n; i++){
			for(int ac : citys[i].getAccesses()){
				if(ac > (i+1) && citys[ac-1].getAccesses().contains(i+1))
					count++;
			}
		}*/
		System.out.println(count);
	}
	public class city{
		private int number;
		private int color;
		private PriorityQueue<Integer> access;
		private PriorityQueue<Integer> accesses;
		public city(int number){
			this.number = number;
			this.color = 0;
			this.access = new PriorityQueue<Integer>();
			this.accesses = new PriorityQueue<Integer>();
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public int getColor() {
			return color;
		}
		public void setColor(int color) {
			this.color = color;
		}
		public PriorityQueue<Integer> getAccess(){
			return access;
		}
		public void setAccess(PriorityQueue<Integer> access){
			this.access = access;
		}
		
		public PriorityQueue<Integer> getAccesses(){
			return accesses;
		}
		public void setAccesses(PriorityQueue<Integer> accesses){
			this.access = accesses;
		}
	}
	
	public class road{
		private int start;
		private int end;
		public road(){}
		public road(int start, int end){
			this.start = start;
			this.end = end;
		}
		public int getStart() {
			return start;
		}
		public void setStart(int start) {
			this.start = start;
		}
		public int getEnd() {
			return end;
		}
		public void setEnd(int end) {
			this.end = end;
		}
	}
}
