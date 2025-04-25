package javaSessions;

public class P15_Employee {
	
	//class: category/template/blueprint of all classes
	//Object: physical entity
	
	//class variables: instance variables
	//can be used anywhere in the class
	String name;
	int age;
	double salary;
	boolean isPrem;
	
	
	

	public static void main(String[] args) {
		
		int i=10; //local variables
		//create the object: using new keyword
		
		P15_Employee obj=new P15_Employee();
		//obj is Object reference name
		//new P15_Employee() is an object/instance
		//P15_Employee is a class
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.isPrem);
		System.out.println(obj.salary);
		
		System.out.println("------------------");
		
		obj.name="Priya";
		obj.age=30;
		obj.isPrem=true;
		obj.salary=150000;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.isPrem);
		System.out.println(obj.salary);
		
		System.out.println("------------------------");
		
		P15_Employee e1=new P15_Employee();
		e1.name="Rajesh";
		e1.age=33;
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.isPrem);
		e1.salary=150000;
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.isPrem);
		
		//no reference object --> not a good practice
		new P15_Employee().name="Tom";
		new P15_Employee().age=50;
		
		//null
		P15_Employee t1=new P15_Employee();
		t1=null; // earthing
		t1.name="Naveen";
		System.out.println(t1.name);//null pointer exception
		
		//System.gc(); // there is no gurantee that system will call gc
		
		//All classes will be loaded in class loader
		
		

		
	}

}
