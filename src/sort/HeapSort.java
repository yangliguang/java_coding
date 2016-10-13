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
		System.out.println();
		sort(a);
		for(int i : a)
			System.out.print(i+" ");
	}
	
	public static void sort(int[] a) {
		int n = a.length;
		//构造初始堆，大顶堆
		for(int i = n/2-1; i >= 0; i--) {
			heapAdjust(a, i, n-1);
		}
		
		//进行排序
		for(int i = n-1; i > 0; i--) {
			//最后一个元素和第一个元素交换
			swap(a, 0, i);
			//然后将剩下的无序元素继续调整为大顶堆
	        heapAdjust(a, 0, i-1);
		}
	}
	
	public static void heapAdjust(int[] a, int start, int end) {
		int temp = a[start];
		for(int i = 2*start + 1; i <= end; i = 2*i+1) {
			//因为假设根结点的序号为0而不是1，所以i结点左孩子和右孩子分别为2i+1和2i+2
	        if(i<end && a[i]<a[i+1])//左右孩子的比较
	            i++;//i为较大的记录的下标

	        if(temp > a[i])//左右孩子中获胜者与父亲的比较
	            break;

	        //将孩子结点上位，则以孩子结点的位置进行下一轮的筛选
	        a[start]= a[i];
	        start = i;
		}
		a[start] = temp;
	}
	
	public static void swap(int[] a, int f, int s) {
		a[f] ^= a[s];
		a[s] ^= a[f];
		a[f] ^= a[s];
	}
	
}
