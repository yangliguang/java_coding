package sort;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月10日下午4:46:10
 */
public class MergeArray {
	public static void main(String[] args) {
		int n = 3;
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = (int)(Math.random()*1000);
		}
//		int[] temp = new int[a.length];
		new MergeArray().mergeSort(a, 0, a.length-1);
		for(int i : a)
			System.out.print(i+" ");
	}
	
	void mergeSort(int[] a, int s, int e){
		if(s < e){
			int m = (s+e)/2;
			mergeSort(a, s, m);   //左边儿有序
			mergeSort(a, m+1, e); //右边儿有序
			mergeArray(a,s,m,e);  //合并两个有序数组
		}
	}
	void mergeArray(int[] a, int s, int m, int e){
		int[] temp = new int[e-s+1];
		int p1 = s, p2 = m+1;
		int i = 0;
		while(p1 <= m && p2 <= e){
			if(a[p1] < a[p2]){
				temp[i++] = a[p1++];
			} else
				temp[i++] = a[p2++];
		}
		while(p1 <= m)
			temp[i++] = a[p1++];
		while(p2 <= e){
			temp[i++] = a[p2++];
		}
		for(i = 0; i < temp.length; i++){
			a[s+i] = temp[i];
		}
	}
}
