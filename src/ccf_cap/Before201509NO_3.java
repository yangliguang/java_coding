package ccf_cap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月9日下午8:20:47
 */
public class Before201509NO_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		String[] templates = new String[m];
		sc.nextLine();
		for(int i = 0; i < m; i++){
			templates[i] = sc.nextLine();
		}
		String[] variables = new String[n];
		for(int i = 0; i < n; i++){
			variables[i] = sc.nextLine();
		}
		List<String> val_names = new ArrayList<String>();
		List<String> val_values = new ArrayList<String>();
		for(String str : variables){
			//String[] str_parse = str.split(" ");
			int split_index = str.indexOf(" ");
			val_names.add(str.substring(0, split_index).replaceAll("\"", ""));
			val_values.add(str.substring(split_index+1).replaceAll("\"", ""));
		}
				
		for(String template : templates){
			/*Pattern p = Pattern.compile("\\{\\{ (.*) \\}\\}");
			Matcher mat = p.matcher(template);
			while(mat.matches()){
				System.out.println(mat.group(1));
			}*/
			for(int in = 0; in < 15; in++){
				if(template.contains("{{ ") && template.contains(" }}") && template.indexOf("{{ ") < template.indexOf(" }}")){
					int index_begin = template.indexOf("{{ ");
					int index_end = template.indexOf(" }}");
					String val_name =  template.substring(index_begin+3, index_end);
					if(val_names.contains(val_name)){
						int index = val_names.indexOf(val_name);
						template = template.replaceAll("\\{\\{ "+val_name+" \\}\\}", "hehe"+index+"haha");
					} else{
						if(isLegal(val_name)){
							template = template.replaceAll("\\{\\{ "+val_name+" \\}\\}", "");
						}
					}
						
				}
			}
			
			if(template.contains("hehe") && template.contains("haha")){
				int i = template.indexOf("hehe");
				int index = Integer.parseInt(template.substring(i+4,template.indexOf("haha")));
				template = template.replaceAll("hehe"+index+"haha", val_values.get(index));
			}
			System.out.println(template);
		}
	}
	public static boolean isLegal(String str){
		boolean state = true;
		for(char c : str.toCharArray()){
			if(!Character.isDigit(c) && !Character.isLetter(c) && c != '_'){
				state = false;
				break;
			}
		}
		if(Character.isDigit(str.toCharArray()[0]))
			state = false;
		if(str.toCharArray().length > 16)
			state = false;
		return state;
	}
}
