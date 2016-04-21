package ccf_cap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月8日下午4:48:14
 */
public class Before201409NO_2 {
	public static void main(String[] args) {
		Before201409NO_2 m = new Before201409NO_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sharp[] sharps = new sharp[n];
		for(int i = 0; i < n; i++){
			sharps[i] = m.new sharp(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		List<point> points = new ArrayList<point>();
		for(double i = 0.5; i<= 99.5; i++){
			for(double j = 0.5; j <= 99.5; j++){
				points.add(m.new point(i,j));
			}
		}
		int count = 0;
		for(point p : points){
			for(sharp s : sharps){
				if(s.contains(p)){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
	
	
	public class point{
		private double x;
		private double y;
		public point(){}
		public point(double x, double y){
			this.x = x;
			this.y = y;
		}
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
	}
	
	public class sharp{
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		public sharp(){}
		public sharp(int x1, int y1, int x2, int y2){
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
		public boolean contains(point p){
			double x = p.getX();
			double y = p.getY();
			if(x1 < x && x < x2 && y1 < y && y < y2)
				return true;
			else
				return false;
		}
		public int getX1() {
			return x1;
		}
		public void setX1(int x1) {
			this.x1 = x1;
		}
		public int getY1() {
			return y1;
		}
		public void setY1(int y1) {
			this.y1 = y1;
		}
		public int getX2() {
			return x2;
		}
		public void setX2(int x2) {
			this.x2 = x2;
		}
		public int getY2() {
			return y2;
		}
		public void setY2(int y2) {
			this.y2 = y2;
		}
	}
}
