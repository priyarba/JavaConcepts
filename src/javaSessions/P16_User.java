package javaSessions;

public class P16_User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		P16_User u1=new P16_User();
		u1.name="Veena";
		u1.age=30;
		u1.city="Pune";
		
		P16_User u2=new P16_User();
		u2.name="Piyush";
		u2.age=28;
		u2.city="Bangalore";
		
		P16_User u3=new P16_User();
		u3.name="Suma";
		u3.age=40;
		u3.city="Canada";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city); //Veena 30 Pune
		System.out.println(u2.name+" "+u2.age+" "+u2.city); //Piyush 28 Bangalore
		System.out.println(u3.name+" "+u3.age+" "+u3.city); //Suma 40 Canada
		
		u1=u2;
		System.out.println(u1.name+" "+u1.age+" "+u1.city); //Piyush 28 Bangalore
		System.out.println(u2.name+" "+u2.age+" "+u2.city); //Piyush 28 Bangalore
		System.out.println(u3.name+" "+u3.age+" "+u3.city); //Suma 40 Canada
		
		u2=u3;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city); //Piyush 28 Bangalore
		System.out.println(u2.name+" "+u2.age+" "+u2.city); //Suma 40 Canada
		System.out.println(u3.name+" "+u3.age+" "+u3.city); //Suma 40 Canada
		
		u3=u1;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city); //Piyush 28 Bangalore
		System.out.println(u2.name+" "+u2.age+" "+u2.city); //Suma 40 Canada
		System.out.println(u3.name+" "+u3.age+" "+u3.city); //Piyush 28 Bangalore
		
		
		
		
		
	}

}
