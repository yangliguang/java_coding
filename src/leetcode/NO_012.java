package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月21日上午9:59:35
 */
public class NO_012 {
	public static void main(String[] args) {
		NO_012 m = new NO_012();
		System.out.println(m.intToRoman(1999));
	}
	public String intToRoman(int num) {
		int[] in = {1000,100,10,1};
		String[] str1 = {"M","C","X","I"};
		String[] str2 = {"D","L","V"};
		String temp = "";
		for(int i = 0; i < in.length; i++){
			if(num/in[i] > 0){
				switch(num/in[i]){
				case(1):temp+=str1[i];break;
				case(2):temp+=str1[i]+str1[i];break;
				case(3):temp+=str1[i]+str1[i]+str1[i];break;
				case(4):temp+=str1[i]+str2[i-1];break;
				case(5):temp+=str2[i-1];break;
				case(6):temp+=str2[i-1]+str1[i];break;
				case(7):temp+=str2[i-1]+str1[i]+str1[i];break;
				case(8):temp+=str2[i-1]+str1[i]+str1[i]+str1[i];break;
				case(9):temp+=str1[i]+str1[i-1];
				}
				num = num%in[i];
			}
		}
        return temp;
    }
}
