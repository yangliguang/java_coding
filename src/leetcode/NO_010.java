package leetcode;


/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月14日下午4:01:13
 */
public class NO_010 {
	public static void main(String[] args) {
		NO_010 t = new NO_010();
		System.out.println(t.isMatch("aab","c*a*b"));
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext())
//			System.out.println(t.isMatch(sc.next(),sc.next()));
	}
	
	public boolean isMatch(String s, String p) {
		while(p.contains("**"))
			p = p.replace("**", "*");
		
//		char[] ss = s.toCharArray();
//        char[] pp = p.toCharArray();
//		while(p.length() >= 2 && s.length() > 0 && pp[0] != '.' && pp[0] != '*' && ss[0] != pp[0]){
//			p = p.substring(1);
//		}
		if(p.contains("*"))
			return true;
	return isMatch2(s, p);
    }
	
	public boolean isMatch2(String s, String p) {
		if(p.equals("*"))
			return true;
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        int i = 0, j = 0;
        for(;i<ss.length;i++){
        	if(j == pp.length)
        		return false;
        	if(pp[j] != '.' && pp[j] != '*' && ss[i] != pp[j])
        		return false;
        	else if(ss[i] == pp[j] || pp[j] == '.'){
        		j++;
        		continue;
        	}
        	else if(pp[j] == '*'){
        		if(p.substring(j).equals("*"))
        			return true;
        		while(i<ss.length && !isMatch2(s.substring(i),p.substring(j+1))){
        			i++;
        		}
        		if(i == s.length())
        			return false;
        		else
        			return true;
        	}
        }
        return true;
    }
}
