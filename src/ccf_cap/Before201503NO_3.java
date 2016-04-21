package ccf_cap;

import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月9日下午12:58:38
 */
public class Before201503NO_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		
		for(int year = y1; year <= y2; year++){
			int[] days = getDays(year);
			int first_day = getFirstDay(year, a);
			int d = (b-1)*7+c;
			int date_day = 0;
			if(first_day == c){
				date_day = 1 + (b-1)*7;
			} else if(first_day < c){
				date_day = c - first_day + (b-1)*7 + 1;
			} else{
				date_day = 7 - first_day + (b-1)*7 +c + 1;
			}
			if(date_day <= days[a-1]){
				String str_month = "";
				String str_day = "";
				if(a<10)
					str_month = "0"+a;
				else
					str_month = a + "";
				if(date_day<10)
					str_day = "0"+date_day;
				else
					str_day = date_day+"";
				System.out.println(year+"/"+str_month+"/"+str_day);
			} else
				System.out.println("none");
			
		}
		
	}
	public static int getFirstDay(int year, int month){
		int alldays = 0;
		for(int i = 1850; i < year; i++){
			int[] days = getDays(i);
			int all = 0;
			for(int d : days){
				all += d;
			}
			alldays += all;
		}
		int[] days = getDays(year);
		for(int i = 0; i < month-1; i++){
			alldays += days[i];
		}
		return (alldays%7-1+2)%7+1;
	}
	public static int[] getDays(int year){
		int[] month_31_list = {1,3,5,7,8,10,12};
		int[] month_30_list = {4,6,9,11};
		int[] days = new int[12];
		for(int i = 0; i < 12; i++){
			int month = i + 1;
			if(isInArray(month, month_31_list))
				days[i] = 31;
			else if(isInArray(month, month_30_list))
				days[i] = 30;
			else{
				if(!isLeapYear(year))
					days[i] = 28;
				else
					days[i] = 29;
			}
		}
		return days;
	}
	public static boolean isInArray(int a, int[] array){
		boolean state = false;
		for(int i : array){
			if(i == a){
				state = true;
				break;
			}
		}
		return state;
	}
	public static boolean isLeapYear(int year){
		if(year%400 == 0 || (year%4 == 0 && year%100 != 0 ))
			return true;
		else
			return false;
	}
}
