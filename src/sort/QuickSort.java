package sort;

/**
 * Author:Young
 * Class Comment:快速排序
 * Date: 2016年4月16日上午11:05:24
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] n = {1,3,7,9,2,4,6,0,11,66,44,99,765,999,-1,55};
//		QuickSort qs = new QuickSort();
//		qs.sort(n,0,n.length-1);
		sort(n,0,n.length-1);
		for(int i = 0; i < n.length; i++)
			System.out.print(n[i]+" ");
	}
	//s means start, e means end, st means stand number
	public static void sort(int[] n, int s, int e){
		if(s >= e)
			return;
		int l = s;
		int r = e;
		int st = n[s];
		while(l < r){
			while(r > l){
				if(n[r] < st){
					n[l] = n[r];
					break;
				} else
					r--;
			}
			while(l < r){
				if(n[l] > st){
					n[r] = n[l];
					break;
				} else
					l++;
			}
		}
		n[l] = st;
		sort(n, s, l-1);
		sort(n, r+1,e);
	}
}
