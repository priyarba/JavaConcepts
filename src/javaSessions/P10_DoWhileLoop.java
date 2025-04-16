package javaSessions;

public class P10_DoWhileLoop {

	public static void main(String[] args) {

		//1 to 10:
		int i=1;
		do {
			System.out.println(i);//1
			i++;//2
			if(i==7) {
				System.out.println("Hello");
			}
			//break;
		}
		while(i<=10);//1 to 10
		//while(i>=10);//1
		
		//use cases:
		//1. wait for the element:
		//
		
		int p=10;
		do {
			System.out.println(p);//10 to 0
			p--;//9
		}
		while(p>=0);
		System.out.println("----------------");
		//to print even numbers
		for(int k=1;k<=100;k++) {
			if(k%2==0) {
				System.out.println(k);
			}
		}
		
		System.out.println("-------------------------");
		
		for(int e=1;e<=10;e=e++) {
			//e++;
			System.out.println(e);
			e++;
		}
		
		
		
		
	}

}
