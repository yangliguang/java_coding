package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author:Young
 * Class Comment：测试Collection
 * Date: 2016年3月23日上午10:18:37
 */
public class Test02 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Mr.Liu");
		s.add("Mr.Chen");
		s.add("Mr.Zhang");
		s.add("Mr.Lee");
		s.add("Mr.Wang");
		s.add("Miss.Zhao");
		s.add("Miss.Sun");
		s.add("Mr.Zhou");
		s.add("Mr.Wu");
		
		//使用Iterator迭代器输出
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next() + " ");
		}
		System.out.println();
		
		//使用for each输出
		for(String str : s){
			System.out.println(str + " ");
		}
		System.out.println();
		
		//使用toString输出
		System.out.println(s.toString());
	}
}
