package leetcode.before100.before010;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月11日下午9:29:55
 */
public class NO_001 {
	public static void main(String[] args) {
		NO_001 m = new NO_001();
		Solution s = m.new Solution();
		int[] a = {3,2,4};
		System.out.println(s.twoSum(a, 6)[0] + " " + s.twoSum(a, 6)[1]);
		
	}
	public class Solution {
	    public int[] twoSum(int[] nums, int target) {
	    	int[] r = new int[2];
	        for(int i = 0; i < nums.length-1; i++){
	        	for(int j = i + 1; j < nums.length; j++){
	        		if(nums[i] + nums[j] == target){
	        			r[0] = i;
	        			r[1] = j;
	        			return r;
	        		}
	        	}
	        }
	        return null;
	    }
	}
}
