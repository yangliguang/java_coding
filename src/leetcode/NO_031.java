package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月19日下午11:15:05
 */
public class NO_031 {
	public void nextPermutation(int[] nums) {
		
    }
	public void next(int[] n, int p1, int p2){
		if(p1 > 0){
			if(n[p1] < n[p2]){
				n[p1] ^= n[p2];
				n[p2] ^= n[p1];
				n[p1] ^= n[p2];
			} 
		}
	}
}
