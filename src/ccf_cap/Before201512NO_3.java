package ccf_cap;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月9日下午6:52:08
 */
public class Before201512NO_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		char[][] a = new char[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++)
				a[i][j] = '.';
		}
		
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			int state = sc.nextInt();
			if(state == 0){
				int x11 =  sc.nextInt();
				int y11 =  sc.nextInt();
				int x1 = n-1 - y11;
				int y1 = x11;
				int x22 =  sc.nextInt();
				int y22 =  sc.nextInt();
				int x2 = n-1 - y22;
				int y2 = x22;
				
				if(x1 == x2){
					int min = (y1 > y2) ? y2 : y1;
					int max = (y1 > y2) ? y1 : y2;
					for(int j = min; j <= max; j++){
						if(a[x1][j] == '|')
							a[x1][j] = '+';
						else
							a[x1][j] = '-';
					}
				} else{
					int min = (x1 > x2) ? x2 : x1;
					int max = (x1 > x2) ? x1 : x2;
					for(int j = min; j <= max; j++){
						if(a[j][y1] == '-')
							a[j][y1] = '+';
						else
							a[j][y1] = '|';
					}
				}
			} else{
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x = n-1 - y1;
				int y = x1;
				char c = sc.next().charAt(0);
				cal(m,n,a,x,y,c);
			}
		}
		sc.close();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m-1; j++){
				System.out.print(a[i][j] + "");
			}
			System.out.println(a[i][m-1]);
			
		}
	}
	static void cal(int m, int n, char[][] a, int x, int y, char c){
		a[x][y] = c;
		
		if(x>=0&&x<n&&y+1>=0&&y+1<m&&a[x][y+1]!=c){
			if(a[x][y+1] != '-' && a[x][y+1] != '|' && a[x][y+1] != '+' ){
				a[x][y+1] = c;
				cal(m,n,a,x,y+1,c);
			}
		}
		if(x>=0&&x<n&&y-1>=0&&y-1<m&&a[x][y-1]!=c){
			if(a[x][y-1] != '-' && a[x][y-1] != '|' && a[x][y-1] != '+'){
				a[x][y-1] = c;
				cal(m,n,a,x,y-1,c);
			}
		}
		if(x+1>=0&&x+1<n&&y>=0&&y<m&&a[x+1][y]!=c){
			if(a[x+1][y] != '|' && a[x+1][y] != '-' && a[x+1][y] != '+'){
				a[x+1][y] = c;
				cal(m,n,a,x+1,y,c);
			}
		}
		if(x-1>=0&&x-1<n&&y>=0&&y<m&&a[x-1][y]!=c){
			if(a[x-1][y] != '|' && a[x-1][y] != '-' && a[x-1][y] != '+'){
				a[x-1][y] = c;
				cal(m,n,a,x-1,y,c);
			}
		}
		
	}
}
