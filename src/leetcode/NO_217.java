package leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月31日下午2:55:54
 */
public class NO_217 {
	//时间复杂度O(n)，空间复杂度O(n),16 test cases 9ms
	public boolean containsDuplicate1(int[] nums) {
		if(nums.length == 0)
			return false;
		HashSet<Integer> hs = new HashSet<Integer>(nums.length);
		for(int i : nums)
			if(!hs.add(i))
				return true;
		return false;
    }
	//先排序,时间复杂度O(nlogn),空间复杂度,O(1), 16 test cases, 6ms
	public boolean containsDuplicate2(int[] nums){
		Arrays.sort(nums);
		for(int i = 0; i < nums.length-1; i++){
			if(nums[i] == nums[i+1]) 
				return true;
		}
		return false;
	}
}
