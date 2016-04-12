package ccf_cap.before_201509;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月9日下午5:33:22
 */
public class NO_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int d = sc.nextInt();
		int [] days = new int[12];
		int[] month_31_list = {1,3,5,7,8,10,12};
		int[] month_30_list = {4,6,9,11};
		for(int i = 0; i < 12; i++){
			int month = i + 1;
			if(isInArray(month,month_31_list))
				days[i] = 31;
			else if(isInArray(month,month_30_list))
				days[i] = 30;
			else{
				if(!isLeapYear(y))
					days[i] = 28;
				else
					days[i] = 29;
			}
		}
		int date_m = 1;
		int date_d = 1;
		int alldays = 0;
		for(int i = 0; i < 12; i++){
			alldays += days[i];
			if(d > alldays)
				date_m++;
			else{
				alldays -= days[i];
				break;
			}
		}
		date_d = d-alldays;
		System.out.println(date_m);
		System.out.println(date_d);
		
	}
	public static boolean isInArray(int a, int[] array){
		boolean state = false;
		for(int i = 0; i < array.length; i++){
			if(a == array[i]){
				state = true;
				break;
			}
		}
		return state;
	}
	public static boolean isLeapYear(int year){
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			return true;
		else
			return false;
	}
}
