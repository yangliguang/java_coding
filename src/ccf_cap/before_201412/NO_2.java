package ccf_cap.before_201412;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月8日下午6:03:25
 */
public class NO_2 {
	public static void main(String[] args) {
		NO_2 m = new NO_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		//未考虑0
		//起点
		point p = m.new point(0,0);
		result.add(a[p.getX()][p.getY()]);
		if(n%2==1){
			while(p.getY() < n - 1){
				p.yplus1();
				result.add(a[p.getX()][p.getY()]);
				while(p.getY() > 0 && p.getX() < n-1){
					p.xplus1();
					p.yminus1();
					result.add(a[p.getX()][p.getY()]);
				}
				p.xplus1();
				result.add(a[p.getX()][p.getY()]);
				while(p.getX() > 0 && p.getY() < n-1){
					p.xminus1();
					p.yplus1();
					result.add(a[p.getX()][p.getY()]);
				}
			}
			while(p.getX() < n - 1){
				p.xplus1();
				result.add(a[p.getX()][p.getY()]);
				while(p.getY() > 0 && p.getX() < n-1){
					p.xplus1();
					p.yminus1();
					result.add(a[p.getX()][p.getY()]);
				}
				p.yplus1();
				result.add(a[p.getX()][p.getY()]);
				while(p.getX() > 0 && p.getY() < n-1){
					p.xminus1();
					p.yplus1();
					result.add(a[p.getX()][p.getY()]);
				}
			}
		}
		
		if(n%2==0){
			p.yplus1();
			result.add(a[p.getX()][p.getY()]);
			while(p.getY() < n - 1){
				while(p.getY() > 0 && p.getX() < n-1){
					p.xplus1();
					p.yminus1();
					result.add(a[p.getX()][p.getY()]);
				}
				p.xplus1();
				result.add(a[p.getX()][p.getY()]);
				while(p.getX() > 0 && p.getY() < n-1){
					p.xminus1();
					p.yplus1();
					result.add(a[p.getX()][p.getY()]);
				}
				p.yplus1();
				result.add(a[p.getX()][p.getY()]);
			}
			while(p.getX() < n - 1){
				while(p.getY() > 0 && p.getX() < n-1){
					p.xplus1();
					p.yminus1();
					result.add(a[p.getX()][p.getY()]);
				}
				p.yplus1();
				result.add(a[p.getX()][p.getY()]);
				while(p.getX() > 0 && p.getY() < n-1){
					p.xminus1();
					p.yplus1();
					result.add(a[p.getX()][p.getY()]);
				}
				if(p.getX() < n - 1){
					p.xplus1();
					result.add(a[p.getX()][p.getY()]);
				}
				
			}
		}
		
		
		/*while(p.getX() < n && p.getY()<n){
			//可以往右则往右
			if(p.getY() < n-1 && p.getX() == 0){
				//往右
				p.yplus1();
				result.add(a[p.getX()][p.getY()]);
				//往左下
				while(p.getY() > 0 && p.getX() < n-1){
					p.xplus1();
					p.yminus1();
					result.add(a[p.getX()][p.getY()]);
				}
			} else{
				//不可以往右则往下
				//往下
				p.xplus1();
				result.add(a[p.getX()][p.getY()]);
				//往左下
				while(p.getY() > 0 && p.getX() < n-1){
					p.xplus1();
					p.yminus1();
					result.add(a[p.getX()][p.getY()]);
				}
			}
			
			//可以往下则往下
			if(p.getX() < n-1){
				p.xplus1();
				result.add(a[p.getX()][p.getY()]);
				//往右上	
				while(p.getX() > 0 && p.getY() < n-1){
					p.xminus1();
					p.yplus1();
					result.add(a[p.getX()][p.getY()]);
				}
			} else{ 
				//不可以往下则往右
				p.yplus1();
				result.add(a[p.getX()][p.getY()]);
				//往右上	
				while(p.getX() > 0 && p.getY() < n-1){
					p.xminus1();
					p.yplus1();
					result.add(a[p.getX()][p.getY()]);
				}
			}
				
			
		}*/
		
		/*while(p.getX() < n-1){
			//往下
			p.xplus1();
			result.add(a[p.getX()][p.getY()]);
			//往左下
			while(p.getY() > 0){
				p.xplus1();
				p.yminus1();
				result.add(a[p.getX()][p.getY()]);
			}
			//往右
			p.yplus1();
			result.add(a[p.getX()][p.getY()]);
		}*/
			
		for(int i = 0; i < result.size() - 1; i++){
			System.out.print(result.get(i) + " ");
		}
		System.out.println(result.get(result.size() - 1));
		
		
	}
	
	public class point{
		private int x;
		private int y;
		public point(){}
		public point(int x, int y){
			this.x = x;
			this.y = y;
		}
		public void xplus1(){
			this.x = x + 1;
		}
		public void yplus1(){
			this.y = y + 1;
		}
		public void xminus1(){
			this.x = x - 1;
		}
		public void yminus1(){
			this.y = y - 1;
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
}
