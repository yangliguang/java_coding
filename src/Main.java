import java.util.LinkedList;


/**
 * Author:Young
 * Class Comment:
 * Date: 2015年12月15日下午3:01:34
 */
public class Main {
	public static void main(String[] args) {
		int n = 10;
		Integer[] a = {1,5,4,6,0,2,3,9,8,7};
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			if(a[i]%2 == 1){
				list.addFirst(a[i]);
			} else{
				list.addLast(a[i]);
			}
		}
		a  = list.toArray(new Integer[n]);
	}
}
