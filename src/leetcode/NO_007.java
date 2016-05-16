package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月12日下午4:20:42
 */
public class NO_007 {
	public static void main(String[] args) {
		//System.out.println(-11%10);
		NO_007 m = new NO_007();
		System.out.println("max:"+Integer.MAX_VALUE);
		System.out.println("min:"+Integer.MIN_VALUE);
		System.out.println(m.rever(1234567));
	}
	public int rever(int x){
		long r = 0;
		while(x != 0){
			r = r*10 + x%10;
			x /= 10;
		}
		if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
			return (int)r;
		else
			return 0;
	}
}
