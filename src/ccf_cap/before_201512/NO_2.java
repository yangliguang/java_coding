package ccf_cap.before_201512;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月9日下午2:20:41
 */
public class NO_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++)
				a[i][j] = sc.nextInt();
		}
		sc.close();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m-2; j++){
				if((a[i][j] == a[i][j+1]) && (a[i][j] == a[i][j+2])){
					list.add(i+" "+j);
					list.add(i+" "+(j+1));
					list.add(i+" "+(j+2));
				}
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n - 2; j++){
				if((a[j][i] == a[j+1][i]) && (a[j][i] == a[j+2][i])){
					if(!list.contains(j+" "+i))
						list.add(j+" "+i);
					if(!list.contains((j+1)+" "+i))
						list.add((j+1)+" "+i);
					if(!list.contains((j+2)+" "+i))
						list.add((j+2)+" "+i);
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(list.contains(i+" "+j))
					a[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m-1; j++)
				System.out.print(a[i][j] + " ");
			System.out.println(a[i][m-1]);
		}
		
		
	}
}
