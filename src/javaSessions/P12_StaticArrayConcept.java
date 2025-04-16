package javaSessions;

import java.util.Arrays;

public class P12_StaticArrayConcept {

	public static void main(String[] args) {
		//1. int array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;

		//for each loop:
		for(int e:i) {
			System.out.println(e);
		}
		
		//2. double array:
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=23.44;
		d[2]=100.11;
		
		for(double e:d) {
			System.out.println(e);
		}
		
		//3.char array:
		char ch[]=new char[4];
		ch[0]='a';
		ch[1]='A';
		ch[2]='0';
		ch[3]='$';
		
		for(char e:ch) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(ch));
		
		//4.String array:
		String emp[]=new String[3];
		emp[0]="Tom";
		emp[1]="Amit";
		emp[2]="Lisa";
		
		for(String e:emp) {
			System.out.println(e);
			if(e.equals("Amit")) {
				System.out.println("Emp is Admin");
				break;
			}
		}
		
		//empdata=name(String), age(int), gender(char), salary(double), isPrem(boolean)
		//5.Object array:
		
		//Object is super class of all the classes
		
		Object data[]=new Object[5];
		data[0]="Tom";
		data[1]=30;
		data[2]='m';
		data[3]=35.55;
		data[4]=true;
		
		System.out.println(Arrays.toString(data));
		
		for(Object e:data) {
			System.out.println(e);
		}
		
		for(int k=0; k<=data.length-1;k++) {
			System.out.println(data[k]);
		}
		
		//
		int p[]=new int[4];
		p[0]=10;
		p[1]=20;
		p[2]=30;
		p[3]=40;
		
		for(int k=p.length-1;k>=0;k--) {
			System.out.println(p[k]);
		}
		
		System.out.println("---------------------------");
		
		int count=p.length-1;
		for(int e:p) {
			e=count;
			System.out.println(p[e]);//40 30 20 10
			count--;
		}
	}

}
