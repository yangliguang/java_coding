package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月21日上午10:50:10
 */
public class NO_013 {
	public static void main(String[] args) {
		NO_013 m = new NO_013();
		System.out.println(m.romanToInt("MCMXCIX"));
		System.out.println(m.romanToInt2("MCMXCIX"));
	}
	
	public int romanToInt2(String s){
		String[][] str = {{"","M","MM","MMM","","","","","",""},{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},{"","I","II","III","IV","V","VI","VII","VIII","IX"}};
		int r = 0;
		for(int i = 3; i >= 0; i--){
			if(s.startsWith(str[0][i])){
				r += i * 1000;
				s = s.substring(str[0][i].length());
			}
				
		}
		for(int j = 2; j >= 0; j--){
			for(int i = 9; i >= 0; i--){
				if(s.startsWith(str[3-j][i])){
					r += i * (int)(Math.pow(10, j));
					s = s.substring(str[3-j][i].length());
				}
			}
		}
		return r;
	}
	public int romanToInt(String s) {
		if(s == null || "".equals(s))
			return 0;
		int[] in = {1000,100,10,1};
		String[] str1 = {"M","C","X","I"};
		String[] str2 = {"D","L","V"};
		int r = 0;
		
		int i = 0;
		if(s.startsWith(str1[i]+str1[i]+str1[i])){
			r += 3 * in[i];
			s = s.substring(3);
		}
		if(s.startsWith(str1[i]+str1[i])){
			r += 2 * in[i];
			s = s.substring(2);
		}
		if(s.startsWith(str1[i])){
			r += in[i];
			s = s.substring(1);
		}
		i++;
		
		for(; i < str1.length; i++){
			if(s.startsWith(str1[i]+str1[i-1])){
				r += 9 * in[i];
				s = s.substring(2);
				continue;
			}
			if(s.startsWith(str2[i-1]+str1[i]+str1[i]+str1[i])){
				r += 8 * in[i];
				s = s.substring(4);
				continue;
			}
			if(s.startsWith(str2[i-1]+str1[i]+str1[i])){
				r += 7 * in[i];
				s = s.substring(3);
				continue;
			}
			if(s.startsWith(str2[i-1]+str1[i])){
				r += 6 * in[i];
				s = s.substring(2);
				continue;
			}
			if(s.startsWith(str2[i-1])){
				r += 5 * in[i];
				s = s.substring(1);
				continue;
			}
			if(s.startsWith(str1[i]+str2[i-1])){
				r += 4 * in[i];
				s = s.substring(2);
				continue;
			}
			if(s.startsWith(str1[i]+str1[i]+str1[i])){
				r += 3 * in[i];
				s = s.substring(3);
				continue;
			}
			if(s.startsWith(str1[i]+str1[i])){
				r += 2 * in[i];
				s = s.substring(2);
				continue;
			}
			if(s.startsWith(str1[i])){
				r += in[i];
				s = s.substring(1);
				continue;
			}
		}
		return r;
    }
}
