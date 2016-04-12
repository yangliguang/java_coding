package ccf_cap.before_201403;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月7日下午6:38:37
 */
public class NO_2 {
	public static void main(String[] args) {
		NO_2 main = new NO_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		window[] ws = new window[n];
		point[] ps = new point[m];
		for(int i = 0; i < n; i++){
			window w = main.new window(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			w.setLevel(i+1);
			w.setNo(i+1);
			ws[i] = w;
		}
		for(int i = 0; i < m; i++){
			point p = main.new point(sc.nextInt(), sc.nextInt());
			ps[i] = p;
		}
		get_max(ps, ws);
	}
	public static void get_max(point[] ps, window[] ws){
		for(point p : ps){
			List<window> list = new ArrayList<window>();
			for(window w : ws){
				if(w.contains(p))
					list.add(w);
			}
			if(list.size() == 0)
				System.out.println("IGNORED");
			else{
				int level = 1;
				int NO = 1;
				int index = 0;
				for(int i = 0; i < list.size(); i++){
					window w = list.get(i);
					if(w.getLevel() >= level){
						level = w.getLevel();
						NO = w.getNo();
						index = i;
					}
				}
				System.out.println(NO);
				int array_index = 0;
				int max_level = 1;
				for(int i = 0; i < ws.length; i++){
					window w = ws[i];
					if(w.getLevel() >= max_level){
						max_level = w.getLevel();
						array_index = i;
					}
				}
				
				
				if(list.get(index).getLevel() != ws[array_index].getLevel()){
					int temp = 0;
					temp = list.get(index).getLevel();
					list.get(index).setLevel(ws[array_index].getLevel());
					ws[array_index].setLevel(temp);
				}
			}
		}
		
	}
	
	public class point{
		private int x;
		private int y;
		public point(){}
		public point(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
	}
	public class window{
		private int x1;
		private int x2;
		private int y1;
		private int y2;
		private int level;
		private int no;
		
		public boolean contains(point p){
			int x = p.getX();
			int y = p.getY();
			if(x1<=x&&x<=x2&&y1<=y&&y<=y2)
				return true;
			else
				return false;
		}
		public window(){}
		public window(int x1, int y1, int x2, int y2){
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		public int getX1() {
			return x1;
		}
		public void setX1(int x1) {
			this.x1 = x1;
		}
		public int getX2() {
			return x2;
		}
		public void setX2(int x2) {
			this.x2 = x2;
		}
		public int getY1() {
			return y1;
		}
		public void setY1(int y1) {
			this.y1 = y1;
		}
		public int getY2() {
			return y2;
		}
		public void setY2(int y2) {
			this.y2 = y2;
		}
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		
		
	}
}


