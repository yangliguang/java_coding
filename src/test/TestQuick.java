package test;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月19日上午9:26:49
 */
public class TestQuick {
	public static void main(String[] args) {
		int[] a = new int[100];
		for(int i = 0; i < 100; i++){
			a[i] = (int)(Math.random()*1000);
		}
		new TestQuick().quick(a,0,99);
		for(int i = 0; i < 100; i++)
			System.out.print(a[i]+" ");
		
	}
	public void quick(int[] a, int s, int e){
		if(s < e){
			int p1 = s, p2 = e, st = a[s];
			while(p1 < p2){
				while(p1 < p2){
					if(a[p2] < st){
						a[p1++] = a[p2];
						break;
					} else
						p2--;
				}
					
				while(p1 < p2){
					if(a[p1] > st){
						a[p2--] = a[p1];
						break;
					} else
						p1++;
				}
			};
			a[p1] = st;
			quick(a, s, p1);
			quick(a, p1+1, e);
		}
	}
}
