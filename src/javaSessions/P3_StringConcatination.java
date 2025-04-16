package javaSessions;

public class P3_StringConcatination {

	public static void main(String[] args) {
		//Non primitive data type
		//Default class
		
		String name="Priya";
		String x="Hello";
		String y="Selenium";
		
		int a=100;
		int b=200;
		System.out.println(a+b);//300
		System.out.println(x+y);//HelloSelenium
		System.out.println(x+a);//Hello100
		System.out.println(a+b+x);//300Hello
		System.out.println(a+b+x+y);//300HelloSelenium
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		
		double c=12.33;
		double d=12.44;
		
		System.out.println(a+b+x+y+a+b+c+d);//300HelloSelenium10020012.3312.44
		System.out.println(a+b+x+y+(a+b+c+d));//300HelloSelenium324.77
		
		
		
		char ch='a';
		String str="selenium";
		System.out.println(str+ch);//seleniuma
		
		char c1='a';
		char c2='b';
		System.out.println(c1+c2);//195 (adds ascii value)97+98
		
		//ACSII range:
		//a-z : 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println(c1+c2+0+'A');//308
		System.out.println(str+c1+c2);//seleniumab
		System.out.println(str+(c1+c2));//selenium195
		
		System.out.println((byte)'a');//97
	}

}
