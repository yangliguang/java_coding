package leetcode;

import java.util.HashSet;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月1日上午12:09:01
 */
public class NO_219 {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(new NO_219().containsNearbyDuplicate(nums, 3));
	}
	
	//high effiencient solution, 2ms, beats 100%
	//mark from https://leetcode.com/discuss/105486/2ms-i-think-it-couldnt-be-that-fast-solution-in-java
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        int[][] table = new int[3][nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            int place = num % nums.length;
            if (place < 0) place += nums.length;

            while (table[0][place] != 0)
            {
                if (table[1][place] == num && table[2][place] + k >= i)
                    return true;
                else if (table[1][place] == num)
                    break;
                else
                    place = (place + 1) % nums.length;
            }

            table[0][place] = 1;
            table[1][place] = num;
            table[2][place] = i;
        }
        return false;
    }
	
	//General solution, using HashSet, one-pass, two pointers
	//time complexity O(n), space complexity O(n)
	//20 test cases, 9ms, beats 90%
	public boolean containsNearbyDuplicate1(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < k && i < nums.length; i++)
        	if(!hs.add(nums[i]))
        		return true;
       
        for(int i = 0,j = k; j < nums.length && j < nums.length; i++,j++){
        	if(!hs.add(nums[j]))
        		return true;
        	hs.remove(nums[i]);
        }
		return false;
    }
}
