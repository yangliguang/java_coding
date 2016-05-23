package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Young
 * Class Comment:Remove Duplicates from Sorted Array
 * Date: 2016年5月23日下午10:09:33
 */
public class NO_026 {
	public static void main(String[] args) {
		int[] nums = {-3,-1,0,0,0,3,3};
		System.out.println(new NO_026().removeDuplicates(nums));
	}
	
	//简单方案
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int j = 1;
        for(int i=1; i<nums.length; i++) {
            if (nums[i-1] != nums[i])
                nums[j++] = nums[i];
        }
        return j;
    }
	
	//one-pass方案
	public int removeDuplicates3(int[] nums){
		if(nums == null || nums.length == 0)
			return 0;
		if(nums.length == 1)
			return 1;
		int flag = nums[0];
		int[] nums2 = new int[nums.length];
		nums2[0] = nums[0];
		int j = 1;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] == flag)
				continue;
			else{
				nums2[j++] = nums[i];
				flag = nums[i];
			}
		}
		for(int k = 0; k < j; k++)
			nums[k] = nums2[k];
		return j;
	}
	//hashset是无序的，ArrayList有序，此方法超时
	public int removeDuplicates2(int[] nums) {
        List<Integer> hs = new ArrayList<Integer>();
        for(int i : nums)
        	if(!hs.contains(i))
        		hs.add(i);
        int length = hs.size();
        Integer[] nums2 = new Integer[length];
        nums2 = hs.toArray(nums2);
        for(int i = 0; i < length;  i++)
        	nums[i] = nums2[i];
        return length;
    }
}
