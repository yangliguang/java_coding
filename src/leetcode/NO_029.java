package leetcode;

/**
 * Author:Young Class Comment: Date: 2016年5月5日下午3:56:58
 */
public class NO_029 {
	public static void main(String[] args) {
		//System.out.println(1 << 30);
		System.out.println(new NO_029().divide(1010369383, -2147483648));
		//System.out.println(new NO_029().recurse(3, 2, 2, 1));
		//System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		//System.out.println(~Integer.MIN_VALUE);
		//System.out.println(new NO_029().recurse(Integer.MAX_VALUE, 1, 1, 1));
		//System.out.println(new NO_029().divid(10, 2, 1));
	}

	
	public int divide(int a, int b) {
		if (b == 0)
			return Integer.MAX_VALUE;
		//由于Integer.MINVALUE的特殊性(其补码是它本身)，不得不将int型转为long型
		long dividend = (long)a;
		long divisor = (long)b;
		//符号位做和，-1表示结果为负，否则结果为正数
		long sign = (dividend >> 31) + (divisor >> 31);
		dividend = (dividend >> 31) == 0 ? dividend : (~dividend + 1);
		divisor = (divisor >> 31) == 0 ? divisor : (~divisor + 1);
		//初始判断，被除数小，直接返回0
		if(divisor > dividend)
			return 0;
		//开始递归
		long quotient = recurse(dividend, divisor, divisor, 1);
		//给商加上符号
		quotient = (sign == -1) ? (~quotient + 1) : quotient;
		//判断是否溢出，如a=Integer.MINVALUE,b=-1结果是溢出的
		if(quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE)
			return (int)quotient;
		else
			return Integer.MAX_VALUE;
	}
	/*
	 * 大致思路：
	 * 除数依次左移一位(乘2)，直至大于被除数
	 * 回退，判断，若差小于初始除数，结束，否则被除数置为两者之差，除数为初始数；
	 * 例如，(7,2,2,1)->(7,4,2,2)->(7,8,2,4)->(3>2)->(3,2,2,1)+2->(3,4,2,1)+2->(1<2)->return 1+2=3;
	 */
	public long recurse(long dividend, long divisor, long init, long quotient){
		if(dividend > divisor){
			return recurse(dividend, divisor << 1, init, quotient << 1);
		} else if(dividend == divisor){
			return quotient;
		} else{
			if(dividend-(divisor >> 1) < init)
				return quotient>>1;
			else
				return recurse(dividend - (divisor >> 1), init, init, 1) + (quotient >> 1);
		}
	}
	
	// https://leetcode.com/discuss/80477/java-solution-convert-both-numbers-negative-numbers-beats
	//https://leetcode.com/discuss/101606/recursive-java-solution-2ms
}
