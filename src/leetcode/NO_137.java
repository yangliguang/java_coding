package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月29日下午8:49:21
 */
public class NO_137 {
	public static void main(String[] args) {
//		int[] nums = {5,2,11,5,2,11,5,2};
//		int[] nums = {1,1,2,2,2,3,3,3};
		int[] nums = {1,1,1,2,3,3,3};
		System.out.println(new NO_137().singleNumber(nums));
	}
	//位操作，出现3次，11cases,2ms
	//仅适用n=3,m=1,{1,1,1,2,3,3,3};
	public int singleNumber(int[] nums) {
	    int ones = 0, twos = 0;
	    for(int i = 0; i < nums.length; i++){
	        ones = (ones ^ nums[i]) & ~twos;
	        twos = (twos ^ nums[i]) & ~ones;
	    }
	    return ones;
	}
	//位操作，出现3次，可扩展到n次，11cases,6ms
	public int singleNumber2(int[] nums){
		int[] r = new int[32];
		for(int i = 0; i < 32; i++){
			for(int j = 0; j < nums.length; j++)
				r[i] += ((nums[j] >> i) & 1);
			r[i] = (r[i]%3 == 0) ? 0 : 1;
		}
		int result = 0;
		for(int i = 0; i < 32; i++)
			result += (1 << i) * r[i];
		return result;
	}
	//常规思路1，使用HashMap, O(n)
	//11 test cases, 15ms 
	//HashMap两种遍历方式，entrySet和keySet,entrySet效率更高一些
	public int singleNumber1(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(nums.length);
		for(int i = 0; i < nums.length; i++){
			if(hm.get(nums[i]) == null)
				hm.put(nums[i], 1);
			else
				hm.put(nums[i], hm.get(nums[i])+1);
		}
		Iterator<Map.Entry<Integer, Integer>> iter = hm.entrySet().iterator();
		Map.Entry<Integer, Integer> entry = null;
		while(iter.hasNext()){
			entry = (Map.Entry<Integer, Integer>)iter.next();
			if(entry.getValue() != 3)
				return entry.getKey();
		}
		return -1;
    }
}
