package javaSessions;

public class P5_IncrementAndDecrementOperators {

	public static void main(String[] args) {

		//++ and --
		//1. post increment
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=-98;
		int d=c++;
		System.out.println(c);//-97
		System.out.println(d);//-98
		
		//2. pre increment
		int f=1;
		int g=++f;
		System.out.println(f);//2
		System.out.println(g);//2
		
		int r=-100;
		int t=++r;
		System.out.println(r);//-99
		System.out.println(t);//-99
		
		int h=-48;
		int l=++h;
		System.out.println(h);//-47
		System.out.println(l);//-47
		
		//3. post decrement:--
		int m=2;
		int n=m--;
		System.out.println(m);//1
		System.out.println(n);//2
		
		int total=10;
		System.out.println(total++);//10
		System.out.println(total);//11
		
		int fee=100;
		System.out.println(fee--);//100
		System.out.println(fee);//99
		
		//4. pre decrement
		int v=2;
		int z=--v;
		System.out.println(v);//1
		System.out.println(z);//1
		
		int num=10;
		System.out.println(--num);//9
		System.out.println(num);//9
		
		
		int i=11;
		int j=i++ + ++i; //11+13
		System.out.println(j);//24
		
		int a1=11, b1=22;
		int c1=a1 + b1 + a1++ + b1++ + ++a1 + ++b1;//11+22+11+22+13+24
		System.out.println(c1);//103
		
		int i1=0;
		int j1=i1++ - --i1 + ++i1 - i1--;//0-0+1-1
		System.out.println(j1);//0
		
		int m1=0, n1=0;
		int p1=--m1 * --n1 * n1-- * m1--; //-1*-1*-1*-1
		System.out.println(p1);//1
		
		
		
		
	}

}
