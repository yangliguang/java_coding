package sort;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月2日下午6:58:17
 */
public class CountingSort {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++){
			nums[i] = (int)(Math.random() * 100);
		}
		for(int i : nums)
			System.out.print(i+" ");
		System.out.println();
		sort(nums, 0, 100);
		for(int i : nums)
			System.out.print(i+" ");
	}
	
	public static void sort(int[] nums, int min, int max){
		int[] count = new int[max-min+1];
		for(int i : nums)
			count[i]++;
		for(int i = 0, j = 0; i < count.length; i++){
			while(count[i] > 0){
				nums[j++] = i;
				count[i]--;
			}
		}
	}
}
