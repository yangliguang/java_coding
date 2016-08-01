package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Author:Young
 * Class Comment:整数比较
 * Date: 2016年4月13日下午5:25:50
 */
public class Test03 {
	public static void main(String[] args) throws Throwable {
		/*Integer i1 = 127,i2=127,i3=128,i4=128;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		Integer j1 = new Integer(3);
		Integer j2 = 3;
		Integer j3= new Integer(3);
		System.out.println(j1==j2);
		System.out.println(j1.equals(j2));
		System.out.println(j1==j3);
		System.out.println(j1.equals(j3));*/
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		for(int i : list)
			System.out.print(i+" ");
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(1);
		for(int j : hs)
			System.out.print(j+" ");*/
		/*String s = "111111111111111111";
		int a = Integer.parseInt(s);
		System.out.println(a);*/
		/*char c = 'b';
		System.out.println(Character.digit(c, 10));*/
		/*int a = 15,b = -15;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(a >> 2);
		System.out.println(b >> 2);*/
		/*int a = 15;
		System.out.println(a&1);*/
		/*int a = 2, b = 3;
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println(a+" "+b);*/
		/*int a = 15;
		System.out.println(~a+1);*/
		/*System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println((long)Math.pow(2, 31));
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));*/
		/*int i = -11;
		System.out.println(i>>31);*/
		/*int a = -1;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(0xffffffff);*/
		/*HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 1);
		hm.put(2, 2);
		hm.put(1, 3);
		System.out.println(hm.size());
		System.out.println(hm.get(1));*/
		/*List<String> al = new ArrayList<>();
		Set<String> hs = new HashSet<>();
		String[] s = al.toArray();
		String[] s*/
		/*System.out.println(-15>>1);
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE+1));*/
		/*System.out.println(new String().getClass());*/
		/*System.out.println(-15 >> 2);*/
		
//		int[] a = {1,4,3,6,2,11,67,56};
//		int[] a = {1,4,3,6,2};
		//快速排序
		/*new Test03().quickSort(a, 0, a.length-1);
		for(int i : a)
			System.out.print(i+" ");*/
		
		//归并排序
		/*new Test03().mergeSort(a, 0, a.length-1);
		for(int i : a)
			System.out.print(i+" ");*/
		/*System.out.println(100>>2);
		List<String> al = new ArrayList<String>();
		al.add("a");al.add("b");al.add("c");
		String[] str = new String[5];
		str[0] = "hehe";
		str[3] = "h1";
		str[4] = "h2";
		str = al.toArray(str);
		for(String s : str)
			System.out.print(s+" ");*/
		/*Set<String> hs = new HashSet<String>();
		hs.add("a");hs.add("b");hs.add("c");
		List<String> al2 = new ArrayList<String>(hs);
		for(String s : hs)
			System.out.print(s+" ");
		System.out.println();
		for(String s : al2)
			System.out.print(s+" ");
		Map<String,String> hm = new HashMap<String,String>();
//		Hashtable ht = 
		LinkedList<String> ll = new LinkedList<String>();*/
		/*int a = 1;
		if(a < 2)
			throw new Exception();*/
		
		
	}
	void quickSort(int[] a, int s, int e){
		if(s < e){
			int l = s, r = e;
			int st = a[s];
			while(l < r){
				while(r > l){
					if(a[r] < st){
						a[l] = a[r];
						l++;
						break;
					} else
						r--;
				}
				while(l < r){
					if(a[l] > st){
						a[r] = a[l];
						r--;
						break;
					} else
						l++;
				}
				
			}
			a[l] = st;
			quickSort(a, s, l-1);
			quickSort(a, l+1, e);
		}
	}
	//归并排序
	void mergeSort(int[] a, int s, int e){
		if(s < e){
			int m = (s+e)/2;
			mergeSort(a, s, m);
			mergeSort(a, m+1, e);
			mergeArray(a, s, m, e);
		}
	}
	void mergeArray(int[] a, int s, int m, int e){
		int[] temp = new int[e-s+1];
		int p1 = s, p2 = m+1;
		int i = 0;
		while(p1 <= m && p2 <= e){
			if(a[p1] < a[p2]){
				temp[i++] = a[p1++];
			} else
				temp[i++] = a[p2++];
		}
		while(p1 <= m)
			temp[i++] = a[p1++];
		while(p2 <= e){
			temp[i++] = a[p2++];
		}
		for(i = 0; i < temp.length; i++){
			a[s+i] = temp[i];
		}
	}
}
