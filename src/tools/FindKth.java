package tools;

import java.util.Scanner;

/**
 * 类说明
 * @Author yangliguang
 * 2016年10月7日下午8:16:33
 */
public class FindKth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] numbers = str.split(" ");
		int[] n = new int[numbers.length];
		for(int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(numbers[i]);
		}
		System.out.println(usingQuicksort(n, 3));
		System.out.println(usingHeapsort(n, 3));
	}
	
	public static int usingQuicksort(int[] a, int k) {
		return quickSort(a, 0, a.length-1, k);
	}
	
	public static int quickSort(int[] a, int start, int end, int k) {
		int st = a[start];
		int p1 = start, p2 = end;
		while(p1 < p2) {
			while(p1 < p2) {
				if(a[p2] < st) {
					a[p1] = a[p2];
					break;
				}
				else
					p2--;
			}
			
			while(p1 < p2) {
				if(a[p1] > st) {
					a[p2] = a[p1];
					break;
				}
				else
					p1++;
			}
			swap(a, p1, p2);
		}
		a[p1] = st;
		if(p1-start+1 > k) {
			return quickSort(a, start, p1-1, k);
		} else if(p1-start+1 == k)
			return a[p1];
		else
			return quickSort(a, p1+1, end, k-(p1-start+1));
	}
	
	public static void swap(int[] a, int f, int s) {
		a[f] ^= a[s];
		a[s] ^= a[f];
		a[f] ^= a[s];
	}
	
	public static int usingHeapsort(int[] a, int k) {
		//构造初始堆，大顶堆
		for(int i = a.length/2-1; i >= 0; i--) {
			heapAdjust(a, i, a.length-1);
		}
		if(k == a.length)
			return a[k-1];
		//进行排序
		for(int i = a.length-1; i > k; i--) {
			//最后一个元素和第一个元素交换
			swap(a, 0, i);
			//然后将剩下的无序元素继续调整为大顶堆
			heapAdjust(a, 0, i-1);
		}
		return a[k-1];
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
	
	
	public static void adjustHeap(int[] a, int start, int end) {
		
	}
}
