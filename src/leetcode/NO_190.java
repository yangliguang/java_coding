package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月16日下午3:20:13
 */
public class NO_190 {
	public static void main(String[] args) {
//		System.out.println(Integer.toBinaryString(199));
//		System.out.println(Integer.valueOf("11000111"));
//		System.out.println(Integer.valueOf("199"));
//		System.out.println(Integer.parseInt("199"));
		//System.out.println(Integer.toBinaryString(0));
		System.out.println(new NO_190().reverseBits(43261596));
		System.out.println(new NO_190().reverseBits2(43261596));
		
//		System.out.println(1 << 31);
	}
	// you need treat n as an unsigned value
	//方法2：使用位操作
	/*
	 * 利用高地位交换实现逆序
	 * 两位一组，高低位互换，方法是（取奇数位，偶数位补0，右移1位）| （取偶数为，奇数位补0，左移1位）
	 * 依次四位一组，八位一组，十六位一组，三十二位一组
	 * 由于是无符号位，所以注意得是逻辑右移
	 */
	public int reverseBits2(int n){
		n = ((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1);
		n = ((n & 0xCCCCCCCC) >>> 2) | ((n & 0x33333333) << 2);
		n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
		n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
		n = ((n & 0xffff0000) >>> 16) | ((n & 0x0000ffff) << 16);
		return n;
	}
	//方法1：使用字符串(注意-1：ffffffff最后一步r=Inteter.MAX_VALUE+(1<<31)是MIN_VALUE,结果刚好还是-1)
    public int reverseBits(int n) {
    	StringBuffer sb = new StringBuffer();
    	String s = Integer.toBinaryString(n);
    	for(int i = 0; i < 32-s.length(); i++)
    		sb.append('0');
    	s = sb.toString() + s;
        char[]  c = s.toCharArray();
        int r = 0;
        for(int i = 0; i < 32; i++){
        	if(c[i] == '1')
        		r += (1 << i);
        }
        return r;
    }
}
