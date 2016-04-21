package ccf_cap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月8日下午11:42:46
 */
public class Before201503NO_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++){
			numbers[i] = sc.nextInt();
		}
		List<Integer> number_list = new ArrayList<Integer>();
		List<Integer> count_list = new ArrayList<Integer>();
		for(int number : numbers){
			if(!number_list.contains(number)){
				number_list.add(number);
			}
		}
		for(int n1 : number_list){
			int c = 0;
			for(int n2 : numbers){
				if(n1 == n2)
					c++;
			}
			count_list.add(c);
		}
		//sort order by frequency
		for(int i = 0; i < count_list.size(); i++){
			for(int j = i; j < count_list.size(); j++){
				if(count_list.get(i) < count_list.get(j) || (count_list.get(i) == count_list.get(j) && number_list.get(i) > number_list.get(j))){
					int temp_count = count_list.get(i);
					count_list.set(i, count_list.get(j));
					count_list.set(j, temp_count);
					
					int temp_number = number_list.get(i);
					number_list.set(i, number_list.get(j));
					number_list.set(j, temp_number);
				}
			}
		}
		
		
		for(int i = 0; i < count_list.size(); i++){
			System.out.println(number_list.get(i) + " " + count_list.get(i));
		}
	}
}
