package javaSessions;

public class P02_DataTypes {

	public static void main(String[] args) {

		//Data types:
		//1. Primitive: Reserved data types
			//Numeric Type:
				//Integral value:
					//1. Integer: Byte, short, Int, long
					//2. Floating-type: float, Double
				//character: char: $ a 1
				//Boolean Type: true, false
		
		
		//2. Non Primitive: class, arrays, objects , interface
		
		//1. byte
		//size: 1byte= 8 bits
		//range: -128 to 127(-2^7 to 2^7-1)
		byte b=10;
		b=20;
		System.out.println(b);
		byte c=15;
		byte c1=20;
		//byte c2=130; // gives error
		System.out.println(c1);
		
		//2. short
		//Size: 2Bytes = 16bits
		//range: -32768 to -32767 (-2^15 to 2^15-1)
		short sh=600;
		short bh=120;
		System.out.println(sh);
		
		//3. Integer
		//Size:4 bytes=4x8=32bits
		//range: -2147483648 to 2147483647 (-2^31 to (2^31)-1)
		int i=10000;
		int j=1;//still takes 4 bytes
		
		//4. long
		//Size: 8 bytes=8x8=64bits
		//range: -2^63 to -2^63-1
		long l=1; //8000 bytes
		l=12233444436L;// for long number use l or L at the end
		System.out.println(l);
		long num=1233473463546l;
		System.out.println(num);
		
		//5. float
		//Size: 4 bytes=32 bits
		//range: after . it can take upto 6-7 digits; before . 39 digits
		//float n=12.33; //gives error
		float n=12.33f;
		System.out.println(n); //12.33
		
		float n1=(float) 23.37;
		System.out.println(n1); //12.37
		
		float n2=100;
		System.out.println(n2); //100.0
		
		//6. double:
		//Size: 8bytes=64 bits
		//range: after . it can take 15 digits; before . 309 digits
		double d=12.33;//8 bytes
		
		double df=128;
		System.out.println(df);//128.0
		
		//7. char: takes only 1 digit value: unicode values+ ASCII values
		//size: 2 bytes=16 bits
		char ch='a';
		System.out.println(ch);
		
		char ch1='1';
		char ch2='$';
		System.out.println(ch2);
		
		char ch3=63;
		System.out.println(ch3);
		
		System.out.println('t'+10);//163
		
		//8. boolean
		//size: ~1 bit
		//range: true , false
		boolean b1=true;
		System.out.println(b1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
