package javaSessions;

public class P9_LoopsConcept {

	public static void main(String[] args) {

		//1 to 10
		//1. while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			//break;//1 :  can be used in switch and while
		}
		
		//
		int p=1;
		while(p<=50) {
			System.out.println(p);
			if(p==5) {
				System.out.println("Bye");
				break;
			}
			p++;		
		}
		
		//10 to 1
		
		int t=10;
		while(t>=-1) {
			System.out.println(t);
			t--;
		}
		
		//2. For Loop
		//1 to 10
		for(int d=1; d<=10; d++) {
			System.out.println(d);
		}
		//can also be written as
		int i1=1;
		for (;i1<=10;) {
			System.out.println(i1);
			i1++;
		}
		
		for(short b=1;b<=10;b++) {
			System.out.println(b);
			b++;
		}
		
		for (char ch='a';ch<='z';ch++) {
			System.out.println(ch +" = "+(byte)ch);
		}
		
		//double
		for(double d=1.0;d<=5.0;d++) {
			System.out.println(d);
		}
		
		//When to use while loop:
		//when numer of iterations are not fixed then use while loop
		//Eg: Calender handling; 
		//Infinite scrolling on fb, linkedIn, 
		//wait for element on page
		//wait for page loading
		//Webtable with pagination
		//Carousels
		
		
		//When to use for loop:
		//When number of iterations are fixed
		//eg: month dropdown 1 to 12
		//Array, ArrayList: 
		//footer links
		//drop downs with fixed data
		
		
//		for(;;) {
//			System.out.println("Welcome to Hotel TAJ");//Infinite loop
//		}
		
		//int ss=10;// Dead code bcoz of the above infinite loop
	}

}
