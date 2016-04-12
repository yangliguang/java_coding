package ccf_cap.before_201509;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young Class Comment: Date: 2015年12月12日上午1:58:49
 */
public class NO_4V2 {
	public static void main(String[] args) {
		NO_4V2 m = new NO_4V2();
		Scanner sc = new Scanner(System.in);
		int city_n = sc.nextInt();
		int road_n = sc.nextInt();
		city[] citys = new city[city_n];
		road[] roads = new road[road_n];
		for (int i = 0; i < city_n; i++) {
			citys[i] = m.new city(i + 1);
		}
		for (int i = 0; i < road_n; i++) {
			roads[i] = m.new road(sc.nextInt(), sc.nextInt());
		}

		List<String> pairs = new ArrayList<String>();
		for (int i = 0; i < city_n; i++) {
			for (int j = 0; j < city_n; j++) {
				citys[j].setColor(0);
			}
			citys[i].setColor(1);
			List<Integer> pair = new ArrayList<Integer>();
			pair.add(citys[i].getNumber());
			while (pair.size() > 0) {
				for (int j = 0; j < road_n; j++) {
					if (roads[j].getStart() == pair.get(0)) {
						if (citys[roads[j].getEnd() - 1].getColor() == 0) {
							pair.add(roads[j].getEnd());
							pairs.add(citys[i].getNumber() + " "
									+ roads[j].getEnd());
							citys[roads[j].getEnd() - 1].setColor(1);
						}
					}
				}
				pair.remove(0);
			}
		}
		int count = 0;
		for(String p : pairs){
			if(pairs.contains(p.split(" ")[1] + " " + p.split(" ")[0]))
				count++;
		}
		System.out.println(count/2);

	}

	public class city {
		private int number;
		private int color;

		public city() {
		}

		public city(int number) {
			this.number = number;
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
	}

	public class road {
		private int start;
		private int end;

		private road() {
		}

		private road(int start, int end) {
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
