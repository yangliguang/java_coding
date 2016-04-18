package leetcode.before100.before010;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月11日下午11:03:41
 */
public class NO_005 {
	public String longestPalindrome(String s) {
		if(s.length() == 1)
			return s;
		else{
			int max = 0;
			String p = "";
			for(int i = 0; i < s.length()-1-max; i++){
	        	for(int j = i+1+max; j <= s.length(); j++){
	        		String ss = s.subSequence(i, j).toString();
	        		if(cal(ss)){
	        			//if(s.subSequence(i, j).length() > max){
	        				p = ss;
	        				max = ss.length();
	        			//}
	        		}
	        	}
	        }
			return p;
		}
		
    }
	public boolean cal(String s){
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length/2; i++){
			if(c[i] != c[c.length-1-i])
				return false;
		}
		return true;
	}
	
	
	public String longestPalindrome2(String s) {
		if(s.length() < 2)
			return s;
		int max = 1,p=0,q=0;
		char[] c = s.toCharArray();
		for(int i = 1; i < s.length(); i++){
			int start = i;
			int end = i;
			while(start>=0&&end<c.length&&c[start]==c[end]){
				if(end-start+1>max){
					max++;
					p=start;
					q=end;
				}
				start--;
				end++;
			}
		}
		for(int i = 0; i < s.length()-1; i++){
			int start = i;
			int end = i+1;
			while(start>=0&&end<c.length&&c[start]==c[end]){
				if(end-start+1>max){
					max++;
					p=start;
					q=end;
				}
				start--;
				end++;
			}
			
		}
		return s.substring(p, q+1);
	}
	
	public static void main(String[] args) {
		NO_005 m = new NO_005();
		long t1 = System.currentTimeMillis();
		//String s = "abc";
		String s = "zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir";
		System.out.println(m.longestPalindrome2(s));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		//System.out.println(m.cal("abcdcba"));
	}
	
}
