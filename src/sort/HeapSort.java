package sort;

/**
 * Author:Young
 * Class Comment:堆排序
 * Date: 2016年5月5日下午4:33:56
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] a = new int[100];
		for(int i = 0; i < a.length; i++){
			a[i] = (int)(Math.random()*a.length);
		}
		for(int i : a)
			System.out.print(i+" ");
	}
	
	
}
