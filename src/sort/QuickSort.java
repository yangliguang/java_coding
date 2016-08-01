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
		new QuickSort().quickSort(n,0,n.length-1);
		for(int i = 0; i < n.length; i++)
			System.out.print(n[i]+" ");
	}
	//s means start, e means end, st means stand number
	void quickSort(int[] a, int s, int e){
		if(s < e){
			int l = s, r = e;
			int st = a[s];
			while(l < r){
				while(r > l){
					if(a[r] < st){
						a[l] = a[r];
						l++;
						break;
					} else
						r--;
				}
				while(l < r){
					if(a[l] > st){
						a[r] = a[l];
						r--;
						break;
					} else
						l++;
				}
				
			}
			a[l] = st;
			quickSort(a, s, l-1);
			quickSort(a, l+1, e);
		}
	}
}
