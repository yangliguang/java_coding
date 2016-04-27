package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月21日下午3:53:08
 */
public class NO_015 {
	public static void main(String[] args) {
		NO_015 m = new NO_015();
		//int[] a = {1,3,5,-3,-1,-10,55,33,4,-8,88};
//		int[] a = {0,0,0};
//		int[] a = {-2,0,1,1,2};
//		int[] a = {1,2,-2,-1};
		int[] a = {3,0,-2,-1,1,2};
//		int[] a = {-1,-2,-3,4,1,3,0,3,-2,1,-2,2,-1,1,-5,4,-3};
//		int[] a = {-1,-2,3};
//		int[] a = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
		long t1 = System.currentTimeMillis();
//		int[] a = {-4,-8,7,13,10,1,-14,-13,0,8,6,-13,-5,-4,-12,2,-11,7,-5,0,-9,-14,-8,-9,2,-7,-13,-3,13,9,-14,-6,8,1,14,-5,-13,8,-10,-5,1,11,-11,3,14,-8,-10,-12,6,-8,-5,13,-15,2,11,-5,10,6,-1,1,0,0,2,-7,8,-6,3,3,-13,8,5,-5,-3,9,5,-4,-14,11,-8,7,10,-6,-3,11,12,-14,-9,-1,7,5,-15,14,12,-5,-8,-2,4,2,-14,-2,-12,6,8,0,0,-2,3,-7,-14,2,7,12,12,12,0,9,13,-2,-15,-3,10,-14,-4,7,-12,3,-10};
		List<List<Integer>> rr = m.threeSum(a);
		System.out.println(rr);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
//		m.quickSort(a,0,a.length-1);
//		for(int i : a)
//			System.out.print(i + " ");
	}
	public List<List<Integer>> threeSum(int[] nums) {
		Set<Integer> po = new HashSet<Integer>();
		Set<Integer> ne = new HashSet<Integer>();
		Set<Integer> po_d = new HashSet<Integer>();
		Set<Integer> ne_d = new HashSet<Integer>();
		HashSet<List<Integer>> r = new HashSet<>();
		boolean isZero = false;
		int zero_count = 0;
		for(int i : nums){
			if(i > 0){
				int f = po.size();
				po.add(i);
				int s = po.size();
				if(f == s)
					po_d.add(i);
			}
				
			else if(i < 0){
				int f = ne.size();
				ne.add(i);
				int s = ne.size();
				if(f == s)
					ne_d.add(i);
			}
				
			else{
				isZero = true;
				zero_count++;
			}
		}
		if(zero_count>=3){
			r.add(Arrays.asList(0,0,0));
		}
		
		Iterator<Integer> it_po_d = po_d.iterator();
		while(it_po_d.hasNext()){
			int i_it_po_d = it_po_d.next();
			if(ne.contains(-2*i_it_po_d))
					r.add(Arrays.asList(-2*i_it_po_d,i_it_po_d,i_it_po_d));
		}
		Iterator<Integer> it_ne_d = ne_d.iterator();
		while(it_ne_d.hasNext()){
			int i_ne_d = it_ne_d.next();
			if(po.contains(-2*i_ne_d))
				r.add(Arrays.asList(i_ne_d,i_ne_d,-2*i_ne_d));
		}
			
		int[] pp = new int[po.size()];
		int[] nn = new int[ne.size()];
		Iterator<Integer> it = po.iterator();
		int int_i = 0;
		while(it.hasNext()){
			pp[int_i] = it.next();
			int_i++;
		}
		Iterator<Integer> it2 = ne.iterator();
		int_i = 0;
		while(it2.hasNext()){
			nn[int_i] = it2.next();
			int_i++;
		}
			
		Arrays.sort(pp);
		Arrays.sort(nn);
		
		//quickSort(pp,0,pp.length-1);
		//quickSort(nn,0,nn.length-1);
		if(isZero){
			for(int ii : pp){
				for(int j = 0; j < nn.length; j++){
					if(-nn[j] < ii)
						break;
					if(ii + nn[j] == 0){
						r.add(Arrays.asList(nn[j],0,ii));
					}
				}
			}
		} 
			
		for(int i = 0; i < pp.length; i++){
			for(int j = nn.length-1; j > 0; j--){
				if(-nn[j] > pp[i])
					break;;
				for(int k = j - 1; k >= 0; k--){
					if(-(nn[j]+nn[k])>pp[i])
						break;
					if(pp[i]+nn[j]+nn[k]==0){
						r.add(Arrays.asList(nn[k],nn[j],pp[i]));
						break;
					}
				}
			}
			
			
			for(int ii = 0; ii < nn.length; ii++){
				for(int jj = 0; jj < pp.length-1; jj++){
					if(pp[jj] > -nn[ii])
						break;
					for(int kk = jj + 1; kk < pp.length; kk++){
						if(pp[jj]+pp[kk]>-nn[ii])
							break;
						if(nn[ii]+pp[jj]+pp[kk]==0){
							r.add(Arrays.asList(nn[ii],pp[jj],pp[kk]));
							break;
						}
					}
				}
			}
			
		}
		List<List<Integer>> rr = new ArrayList<List<Integer>>();
		for(List<Integer> list : r)
			rr.add(list);
		return rr;
    }
	
	public void quickSort(int[] a, int start, int end){
		if(start >= end)
			return;
		int s = a[start];
		int l = start;
		int r = end;
		while(l < r){
			for(;r > l; r--){
				if(a[r] < s){
					a[l] = a[r];
					l++;
					break;
				}
			}
			for(; l < r; l++){
				if(a[l] > s){
					a[r] = a[l];
					r--;
					break;
				}
			}
		}
		a[l] = s;
		quickSort(a,start,l);
		quickSort(a,l+1,end);
	}
	
	
} 
