package leetcode;


/**
 * Author:Young
 * Class Comment:
 * Date: 2016年6月1日下午9:46:08
 */
public class NO_067 {
	public static void main(String[] args) {
		System.out.println('1'+'0'+'0');
		System.out.println(new NO_067().addBinary("100", "110010"));
	}
	/*
	 * use char array
	 * 294 test cases, 3ms, beats 90%
	 */
	public String addBinary(String a, String b){
		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();
		int gap = Math.abs(aa.length - bb.length);
		int i = 0;
		if(aa.length > bb.length){
			char[] temp = new char[aa.length];
			for(; i < gap; i++)
				temp[i] = '0';
			for(int j = 0; i < aa.length; i++,j++)
				temp[i] = bb[j];
			bb = temp;
		}
		if(aa.length < bb.length){
			char[] temp = new char[bb.length];
			for(; i < gap; i++)
				temp[i] = '0';
			for(int j = 0; i < bb.length; i++,j++)
				temp[i] = aa[j];
			aa = temp;
		}
		char[] cc = new char[aa.length];
		char[] dd = new char[bb.length];
		char[] ch = new char[2];
		ch = addChar(aa[aa.length-1],bb[bb.length-1],'0');
		cc[aa.length-1] = ch[0];
		dd[aa.length-1] = ch[1];
		for(i = aa.length-2; i >= 0; i--){
			ch = addChar(aa[i],bb[i],dd[i+1]);
			cc[i] = ch[0];
			dd[i] = ch[1];
		}
		String ret = dd[0] + new String(cc);
		for(i = 0; i < ret.length()-1; i++)
			if(ret.charAt(i) != '0')
				break;
		return ret.substring(i);
	}
	public char[] addChar(char a, char b, char c){
		char[] s = new char[2];
		int sum = a+b+c;
		if(sum == 144){
			s[0] = '0'; s[1] = '0';
		} else if(sum == 145){
			s[0] = '1'; s[1] = '0';
		} else if(sum == 146){
			s[0] = '0'; s[1] = '1';
		} else if(sum == 147){
			s[0] = '1'; s[1] = '1';
		} else{}
		return s;
	}
	/*
	 * general solution, convert to decimal and then using Integer.toBinaryString method
	 * it occurs to the wrong answer when overflows
	 * it's wrong!!!
	 */
	public String addBinary1(String a, String b) {
		int aa = 0, bb = 0;
		for(int i = 0; i < a.length(); i++)
			aa += (a.charAt(i) == '1') ? (1 << a.length()-1-i) : 0;
		for(int i = 0; i < b.length(); i++)
			bb += (b.charAt(i) == '1') ? (1 << b.length()-1-i) : 0;
		return Integer.toBinaryString(aa+bb);
	}
}
