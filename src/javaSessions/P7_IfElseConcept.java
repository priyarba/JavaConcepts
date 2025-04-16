package javaSessions;

public class P7_IfElseConcept {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
//		------------------------------------------------------
		if(true) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Bye");//dead code
		}
		
		////////////////////////////////
		boolean flag=true;
		if(flag) {
			System.out.println("Hi");
		}
		else {
			System.out.println("BBye");
		}
		
		//-----------------------------------------------------------------
		
		//if--if-else--if
		
		int marks=100;
		if(marks>=90) {
			System.out.println("GRADE A");
			if(marks>=95) {
				System.out.println("100% scholarship");
				if(marks==100) {
					System.out.println("0% tution fee");
				}
				else {
					System.out.println("10% fee");
				}
			}
		}
		else {
			System.out.println("INVALID MARKS");
		}
		
		
		//-----------------------------------------
		//Coparing primitive data type: ==
		//Comparing non-primitive data type: .equals()
		//if-elseif-elseif-else
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		else if(browser.equals("firefox")) {
			System.out.println("Firefox is launched");
		}
		else if(browser.contentEquals("IE")) {
			System.out.println("IE is launched");
		}
		else {
			System.out.println("Please pass correct browser: "+ browser);
		}
		
		
		
		
		
	}

}
