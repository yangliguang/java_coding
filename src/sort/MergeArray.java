package sort;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月10日下午4:46:10
 */
public class MergeArray {
	public static void main(String[] args) {
		int[] a = {1,4,3,5,7,90,23,45,13,100,0};
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
		int temp[] = new int[e-s+1];
		int i = s, j = m+1, k = 0;
		while(i <= m && j <= e){
			if(a[i] < a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}
		while(i<=m)
			temp[k++] = a[i++];
		while(j<=e)
			temp[k++] = a[j++];
		for(i = 0; i < e-s+1; i++){
			a[s+i] = temp[i];
		}
	}
}
