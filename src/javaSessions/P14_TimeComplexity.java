package javaSessions;

public class P14_TimeComplexity {

	public static void main(String[] args) {
		//Tc:Big Oh() -- Big O(n)
		
		//1.
		int i=1;
		System.out.println(i);
		
		//O(1) -- constant time
		
		//2.
		for(int p=1;p<=10;p++) {
			System.out.println(p);
		}
		//1+n+n+n = 3n+1 --> Linear Equation : n+c
		//3n+1 => 3n => n => O(n)
		
		//
		int k=1;
		while(k<=10) {
			System.out.println(k);
			k++;
		}
		
		//1+n+n+n =>3n+1=>3n=>n=>O(n)
		
		
		//O(log n)
		//log n:
		//n/2
		//n/4
		//n/8
		
		//tc=n/k
		//T=n/k
		//log T= log(n/k)
		//log T=log n - log k
		//log T = 1- log k;
		//log T = log k
		//O(log n)
		
		
		
		
		
		
		
	}

}
