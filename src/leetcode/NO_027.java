package leetcode;

/**
 * Author:Young
 * Class Comment:Remove Element
 * Date: 2016年5月4日下午10:13:57
 */
public class NO_027 {
	public static void main(String[] args) {
		int[] nums = {3,3};
		System.out.println(new NO_027().removeElement(nums, 3));
	}
	
	//simple solution
	public int removeElement(int[] nums, int val) {
		int i = 0, j = nums.length-1;
		while(i<=j){
			if(nums[i] == val){
				nums[i] = nums[j];
				j--;
				continue;
			}
			i++;
		}
		return i;
	}
	//my solution 
	public int removeElement_me(int[] nums, int val) {
		if(nums == null || nums.length == 0)
			return 0;
		int start = 0, end = nums.length-1;
		while(start < end){
			if(nums[start] == val){
				while(start < end && nums[end] == val)
					end--;
				if(start < end && nums[end] != val){
					nums[start] = nums[end];
					start++;
					end--;
				} else{
					start--;
					break;
				}
			} else{
				start++;
			}
		}
		if(start == -1)
			return 0;
		if(start > end)
			return start;
		if(nums[start] == val)
			start--;
		start++;
        return start;
    }
}
