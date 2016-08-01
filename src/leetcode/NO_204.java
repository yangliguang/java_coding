package leetcode;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月26日下午11:38:40
 */
public class NO_204 {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		System.out.println(new NO_204().countPrimes1(150000));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		long t3 = System.currentTimeMillis();
		System.out.println(new NO_204().countPrimes(15000));
		long t4 = System.currentTimeMillis();
		System.out.println(t4-t3);
		
		
	}
	//高效思路
	public int countPrimes(int n){
		if(n < 3)
	        return 0;
	    int c= 1;
	    boolean isNotPrime[] = new boolean[n+1];
	    for(int i=3;i*i<=n;i=i+2) {
	        if(isNotPrime[i])
	            continue;
	        for(int j= i*i ;j<=n;j=j+2*i)
	            isNotPrime[j] = true;
	    }
	    for(int i =3;i<n;i=i+2){
	        if(!isNotPrime[i])
	            c++;
	    }
	    return c;
	}
	
	//常规思路，超时
	public int countPrimes1(int n) {
		if(n < 3)
			return 0;
		int s = 1;
        for(int i = 3; i < n; i=i+2)
        	if(isPrime1(i)){
        		s++;
        	}
        return s;
    }
	public boolean isPrime1(int n){
		for(int i = 3; i <= Math.sqrt(n); i=i+2)
			if(n%i == 0)
				return false;
		return true;
	}
}
