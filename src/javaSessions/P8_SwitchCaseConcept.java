package javaSessions;

public class P8_SwitchCaseConcept {

	public static void main(String[] args) {

		String browser="chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;
			

		default:
			System.out.println("Please enter the right rowser: "+ browser);
			break;
		}
		
		//Limitations:
		//1. Conditional statements are not allowed (a>b)
		//2. only integers are allowed : byte, short, int, char(char are integer family)
		// Not allowed: long, float, double
		
		char ch='b';
		switch (ch) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonant");
			break;
		}
		
		//Examples
		//1. cross browser
		//2.cross os
		//3.month
		//4. run tc in diff env: dev, qa, uat
		//5. timezones
		//6. localization testing
		
	}

}
