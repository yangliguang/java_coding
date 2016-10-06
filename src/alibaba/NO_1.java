package alibaba;

/**
 * 类说明
 * @Author yangliguang
 * 2016年9月9日下午7:03:24
 * 有如下4个命题：
a、bcd都是假命题
b、abcd至少两个真命题
c、abcd至少两个假命题
d、abc都是假命题
上面四个命题至多成立几个，至少成立几个。   
 */
public class NO_1 {
	public static void main(String[] args) {
		for(int i = 0; i < 16; i++) {
			int a = (i&1) > 0 ? 1 : 0;
			int b = (i&2) > 0 ? 1 : 0;
			int c = (i&4) > 0 ? 1 : 0;
			int d = (i&8) > 0 ? 1 : 0;
			int count = 0;
			if(b==0 && c==0&& d == 0)
				count++;
			if(a==0&&b==0&&c==0)
				count++;
			if(a+b+c+d>=2)
				count++;
			if(a+b+c+d<=2)
				count++;
			System.out.println(count);
		}
	}
}
