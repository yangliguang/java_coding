package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月1日上午10:02:38
 */
public class NO_220 {
	public static void main(String[] args) {
//		int[] nums = {-3,3};
//		System.out.println(new NO_220().containsNearbyAlmostDuplicate(nums, 2, 4));
		
//		int[] nums = {1,3,1};
//		System.out.println(new NO_220().containsNearbyAlmostDuplicate(nums, 2, 1));
		
//		int[] nums = {2,1};
//		System.out.println(new NO_220().containsNearbyAlmostDuplicate(nums, 1, 1));
		
//		int[] nums = {3,6,0,4};
//		System.out.println(new NO_220().containsNearbyAlmostDuplicate(nums, 2, 2));
		
		int[] nums = {-1,2147483647};
		System.out.println(new NO_220().containsNearbyAlmostDuplicate(nums, 1, 2147483647));
		
	}
	
	/*
	 * bucket sort, O(n)
	 * succeed
	 * 
	 */
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t){
		if(nums.length == 0 || k == 0 || t < 0)
			return false;
		long max = nums[0], min = nums[0];
		for(int i : nums){
			max = Math.max(max, i);
			min = Math.min(min, i);
		}
		@SuppressWarnings("unchecked")
		Stack<HashMap<Integer, Integer>>[] buckets = new Stack[(int)((max-min+1)/(t==0?1:t)+1)];
		for(int i = 0; i < buckets.length; i++)
			buckets[i] = new Stack<HashMap<Integer, Integer>>();
		int index = 0;
		for(int i = 0; i < nums.length; i++){
			index = (int)((nums[i]-min)/(t==0?1:t));
			if(buckets[index].size() > 0 && (i-buckets[index].peek().keySet().iterator().next()) <= k && (Math.abs(nums[i]-buckets[index].peek().values().iterator().next())) <= t)
				return true;
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			hm.put(i, nums[i]);
			buckets[index].push(hm);
			//warning
//			if(index > 0 && buckets[index-1].size() > 0){
//				System.out.println("t:"+t);
//				System.out.println(Math.abs((long)(nums[i])-buckets[index-1].peek().values().iterator().next()));
//			}
			if(index > 0 && buckets[index-1].size() > 0 && (i-buckets[index-1].peek().keySet().iterator().next()) <= k && (Math.abs((long)(nums[i])-buckets[index-1].peek().values().iterator().next())) <= t){
				 return true;
			}
//			if(index < buckets.length-1 && buckets[index+1].size() > 0){
//				System.out.println(buckets[index+1].peek().keySet().iterator().next());
//				System.out.println(buckets[index+1].peek().values().iterator().next());
//			}
			
			if(index < buckets.length-1 && buckets[index+1].size() > 0 && (i-buckets[index+1].peek().keySet().iterator().next()) <= k && (Math.abs((long)(nums[i])-buckets[index+1].peek().values().iterator().next())) <= t)
				return true;
		}
		return false;
	}
	
	
	
	/*
	 * general solution
	 * using one-pass(O(n)) with quick-sort(O(nlogn)),the time complexity O(n^2logn)
	 * using one-pass with finding max, min, O(n^2)
	 * time limit exceeded
	 */
	public boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {
		if(nums.length == 0)
			return false;
		if(nums.length <= k)
			return isAlmostDuplicat(nums, 0, nums.length-1, t);
		for(int i = 0; i < nums.length - k; i++){
			if(isAlmostDuplicat(nums, i, i + k, t))
				return true;
		}
		return false;
    }
	
	public boolean isAlmostDuplicat(int[] nums, int start, int end, int t){
		//no need to sort, just find the max and min
		/*Arrays.sort(nums);
		for(int i = 0; i < nums.length-1; i++){
			if((nums[i+1]-nums[i])<t)
				return true;
		}
		return false;*/
		int min = nums[0], max = nums[0];
		for(int i = start; i <= end; i++){
			if(nums[i] < min)
				min = nums[i];
			if(nums[i] > max)
				max = nums[i];
		}
		if(max - min < t)
			return true;
		else
			return false;
	}
}
