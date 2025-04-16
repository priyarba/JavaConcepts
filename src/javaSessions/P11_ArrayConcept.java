package javaSessions;

import java.util.Arrays;

public class P11_ArrayConcept {

	public static void main(String[] args) {

		//Array: similar type of data in a collection
		//1. static array: Size is fixed
		//2. Dynamic array: Size is not fixed:ArrayList
		
		//Limititaion:
		//1. Size is fixed(static array)
		//2. can store only similar data types: to overcome this we can use object array
		//
		
		//l. Using new keyword:
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[4]);//AIOB
		
		System.out.println("Li= "+0);
		int len= i.length;
		System.out.println("Length= "+len);
		System.out.println("Hi= "+(len-1));
		
		//to print all the values of array: use for loop:
		//0to3
		
		//for(int k=0;k<=len-1;k++)
		//for(int k=0;k<=i.length-1;k++)	
		for(int k=0;k<i.length;k++)
		{
			System.out.println(i[k]);
		}
		
		//without for loop, want to print the values of array
		System.out.println(Arrays.toString(i));
		
		//
		int p[]=new int[3];
		p[1]=100;
		System.out.println(p[1]);
		System.out.println(p[0]);//0
		System.out.println(p[2]);//0
		
		//p[4]=50;
		//System.out.println(p[4]);//ArrayIndexOutOfBoundsException
		
		//int m[]=new int[-4];//NegativeArraySizeException
		
		//Array Literals: static array"
		int num[]= {10,20,30,50,12,34};
		System.out.println(num.length);
		System.out.println(num[0]);
		
		System.out.println(Arrays.toString(num));
		num[0]=400;
		System.out.println(Arrays.toString(num));
		
		System.out.println("------------------");
		
		int pop[]=new int[10];//if we are not sure about the full data
		
		String browser[]= {"chrome","firefox","edge"}; //0-2
		System.out.println(browser.length);
		
		
		for(String e:browser) {
			System.out.println(e);
		}
		
		
	}

}
