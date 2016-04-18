package algorithm_design_and_analysis;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月15日下午8:41:01
 */
public class NO_1 {
	public static void main(String[] args) {
		NO_1 t = new NO_1();
		//System.out.println(t.cal(5, 6));
		int count = 0;
		System.out.print("the number are : ");
		for(int i = 1 ; i <= 2005; i++){
			if(t.cal(2, i) == 1){
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("the count is : " + count);
	}
	
	public int cal(int m, int n){
		int[] c = new int[n]; //按n个人初始化数组，值默认为0,out设为1
		int count = n; //剩余人数
		int i = 0; //报数人在c数组的索引
		int j = 1; //报数人报的数
		while(count > 1){ 
			j++; //报的数加1
			i = calIndex(c,i); //计算要报数人的索引
			if(j%m==0){
				c[i] = 1;
				count--;
			}
		}
		for(int ii = 0; ii < c.length; ii++)
			if(c[ii] == 0)
				return ii+1; //ii是索引，加1即为编号
			
		return 0;
	}
	public int calIndex(int c[], int i){
		if(i == c.length-1)
			i = 0;
		else
			i++;
		for(; i < c.length; i++){
			if(c[i] == 0)
				return i;
			else{
				if(i == c.length-1)
					i = -1;
				continue;
			}
		}
		return 0;
	}
}
