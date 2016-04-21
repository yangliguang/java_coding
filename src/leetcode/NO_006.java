package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月12日下午9:20:05
 */
public class NO_006 {
	public static void main(String[] args) {
		String a = "PAYPALISHIRING";
		NO_006 m = new NO_006();
		System.out.println(m.convert(a, 3));
		System.out.println(m.convert("A", 1));
		System.out.println(m.convert("ABC", 3));
	}
	public String convert(String s, int numRows) {
		if("".equals(s) || s == "")
			return "";
		else{
			int lines = 0;
			if(numRows == 1)
				return s;
			if(s.length() >= 2*numRows-2){
				lines = s.length()/(2*numRows - 2);
			}
	        int count = 2*numRows - 2;
	        char[][] r = new char[lines][count];
	        String ss = s.substring(0, lines*count);
	        int ii = 0;
	        for(int i = 0; i < lines; i++){
	        	for(int j = 0; j < count; j++){
	        		r[i][j] = ss.charAt(ii);
	        		ii++;
	        	}
	        }
	        int yushu = s.length() % count;
	        char y[] = s.substring(ss.length()).toCharArray();
	        StringBuffer sb = new StringBuffer();
	        for(int j = 0; j < lines; j++){
	        	sb.append(r[j][0]);
	        }
	        if(yushu>=1)
	        	sb.append(y[0]);
	        	
	        for(int i = 1; i < numRows-1; i++){
	        	for(int j = 0; j < lines; j++){
		        	sb.append(r[j][i]);
		        	sb.append(r[j][2*numRows-2-i]);
		        }
		        if(yushu > i){
		        	sb.append(y[i]);
		        	if(yushu>2*numRows-2-i)
		        		sb.append(y[2*numRows-2-i]);
		        }
	        }
	        for(int i = 0; i < lines; i++){
	        	sb.append(r[i][numRows-1]);
	        }
	        if(yushu>=numRows)
	        	sb.append(y[numRows-1]);
	        
	        return sb.toString();
		}
        
        
    }
}
