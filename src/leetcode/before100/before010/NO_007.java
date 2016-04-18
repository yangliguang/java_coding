package leetcode.before100.before010;

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
		System.out.println(m.reverse(-2147483648));
		System.out.println(m.reverse2(2147483646));
	}
	public int reverse(int x){
		int r = 0;
		while(x!=0){
			long l = (long)r*10+x%10;
			if(l > Integer.MAX_VALUE || l < Integer.MIN_VALUE)
				return 0;
			r = (int) l;
			x /= 10;
		}
		return r;
	}
	public int reverse2(int x) {
		if(x>=0){
			long l = Long.parseLong(rev(x+""));
			if(l > Integer.MAX_VALUE)
				return 0;
			return Integer.parseInt(rev(x+""));
		} else{
			if(x == Integer.MIN_VALUE){
				return 0;
			} else{
				long l = Long.parseLong(rev(-x+""))*-1;
				System.out.println();
				if(l < Integer.MIN_VALUE)
					return 0;
				return Integer.parseInt(rev(-x+""))*-1;
			}
			
		}
    }
	
	public String rev(String s){
		String res = new String();
		char[] c = s.toCharArray();
		for(int i = c.length-1; i >= 0; i--){
			res += c[i];
		}
		return res;
	}
}
