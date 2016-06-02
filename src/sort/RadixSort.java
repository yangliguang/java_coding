package sort;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月2日下午8:41:42
 */
public class RadixSort {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++){
			nums[i] = (int)(Math.random() * 500) + 500;
		}
		for(int i : nums)
			System.out.print(i+" ");
		System.out.println();
		sort(nums, 1000, 4);
		for(int i : nums)
			System.out.print(i+" ");
	}
	
	public static void sort(int[] nums, int max, int d){
		for(int i = 0; i < d; i++){
			@SuppressWarnings("unchecked")
			Queue<Integer>[] count = new LinkedList[10];
			for(int ii = 0;ii < 10; ii++){  
	            count[ii] = new LinkedList<Integer>();  
	        }  
			for(int num : nums)
				count[num/((int)(Math.pow(10, d)))%10].add(num);
			int p1 = 0;
			for(int j = 0; j < 10; j++){
				while(count[j].size() > 0){
					nums[p1++] = count[j].poll();
				}
			}
		}
	}
	
}
