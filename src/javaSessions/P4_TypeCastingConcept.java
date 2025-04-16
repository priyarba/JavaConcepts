package javaSessions;

public class P4_TypeCastingConcept {

	public static void main(String[] args) {
		
		//byte, short, int, long
		
		short s1=200;
		byte b1=(byte)s1;
		System.out.println(b1);//-56
		
		short s2=10;
		byte b2=(byte)s2;
		System.out.println(b2);//10
		
		byte b3=10;
		int i=b3;
		System.out.println(i);
		
		int j=1000;
		byte b4=(byte)j;
		System.out.println(b4);//-24
		
		int p=100;
		float f=p;
		System.out.println(f);//100.0
		
		float f1=12.33f;
		int p1=(int)f1;
		System.out.println(p1);//12
		
		int d=10000;
		double dd=d;
		System.out.println(dd);//10000.0
		
		char ch='a';//97
		int w=ch;
		System.out.println(w);//97
		
		int a=97;
		char cr=(char)a;
		System.out.println(cr);//a
		
		

	}

}
