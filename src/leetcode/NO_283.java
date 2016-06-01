package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月1日下午11:19:25
 */
public class NO_283 {
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		new NO_283().moveZeroes(nums);
		for(int i : nums)
			System.out.println(i);
	}
	public void moveZeroes(int[] nums){
		int p1 = 0, p2 = 0;
		for(; p2 < nums.length; p2++){
			if(nums[p2] == 0)
				continue;
			nums[p1++] = nums[p2];
		}
		while(p1 < nums.length)
			nums[p1++] = 0;
	}
	/*
	 * general solution : 2 pointers of start and end
	 * and switch two numbers when start->0 and end->!0
	 * but the order will be disturbed.
	 * Wrong answer!!!
	 */
	public void moveZeroes1(int[] nums) {
        int p1 = 0, p2 = nums.length-1;
        while(p1 < p2){
        	for(;p1 < nums.length && p1 < p2; p1++)
    			if(nums[p1] == 0)
    				break;
    		for(;p2 >= 0 && p1 < p2; p2--)
    			if(nums[p2] != 0)
    				break;
    		nums[p1] ^= nums[p2];
    		nums[p2] ^= nums[p1];
    		nums[p1] ^= nums[p2];
    		p1++;p2--;
        }
    }
}
