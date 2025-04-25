package javaSessions;

public class P13_NestedLoops {

	public static void main(String[] args) {
		//for--outer
			//for--

		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
		//30 31 32 33 34 35
		//40 41 42 43 44 45
		//50 51 52 53 54 55
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		//m*n
		//(1+n+n+n)(1+n+n+n) =>(1+3n)(1+3n)=>1+3n+3n+9n^2=> 9n^2+6n+1 => Quadratic equation
		
		for(int m=0;m<=5;m++) {
			for(int n=0;n<=5;n++) {
				for(int o=0;o<=5;o++) {
					System.out.print(m+""+n+""+o+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		//n*n*n=> n^3=> O(n^3) => Cubic equation
	}

}
