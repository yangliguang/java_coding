package ccf_cap.before_201403;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月8日上午8:29:30
 */
public class NO_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String format = sc.next();
		int n = sc.nextInt();
		sc.nextLine();
		String[] command = new String[n];
		for(int i = 0; i < n; i++){
			command[i] = sc.nextLine();
		}
		
		for(int i = 0; i < n; i++){
			System.out.println("Case " + (i+1) + ":" + process(format,command[i]));
		}
		
	}
	public static String process(String format, String command){
		String result = "";
		List<String> result_list = new ArrayList<String>();
		List<String> format_list = new ArrayList<String>();
		for(int i = 0; i < format.length()-1; i++){
			if(format.charAt(i) != ':' && format.charAt(i+1) != ':')
				format_list.add(format.charAt(i)+"");
			if(format.charAt(i) != ':' && format.charAt(i+1) == ':'){
				format_list.add(format.charAt(i)+":");
				i++;
			}
		}
		if(format.charAt(format.length()-1) != ':')
			format_list.add(format.charAt(format.length()-1)+"");
		
		String[] c = command.split(" ");
		for(int i = 1; i < c.length; i++){
			if(c[i].startsWith("-") && c[i].length() ==2  && format_list.contains(c[i].charAt(1)+"")){
				if(!result_list.contains(c[i].charAt(1)+""))
					result_list.add(c[i].charAt(1)+"");
			}
			else if(c[i].startsWith("-") && c[i].length() ==2 && format_list.contains(c[i].charAt(1)+":")){
				if((i+1 == c.length) || (i+1 < c.length && !judgeParam(c[i+1])))
					break;
				else{
					if(result_list.contains(c[i].charAt(1)+":")){
						int index = result_list.indexOf(c[i].charAt(1)+":");
						result_list.remove(index);
						result_list.remove(index);
					}
					result_list.add(c[i].charAt(1)+":");
					result_list.add(c[i+1]);
					i++;
				}
				
			} else
				break;
			
		}
		for(char a = 'a'; a <= 'z'; a++){
			if(result_list.contains(a+""))
				result += (" -"+a);
			if(result_list.contains(a+":")){
				int index = result_list.indexOf(a+":");
				result += (" -"+a+" "+result_list.get(index+1));
			}
		}
		return result;
	}
	public static boolean judgeParam(String str){
		boolean result = true;
		for(char c : str.toCharArray()){
			boolean char_result;
			if(c == '-' || Character.isDigit(c) || Character.isLowerCase(c))
				char_result = true;
			else{
				char_result = false;
			}
			result = result & char_result;
		}
		return result;
	}
}
