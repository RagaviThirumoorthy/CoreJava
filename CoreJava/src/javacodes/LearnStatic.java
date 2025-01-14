package javacodes;

public class LearnStatic {
	
	String name;							//Instance variable(Global variable), Dependent on objects/instances
	String gender;							//Initialize whenever the object is created
	static String city = "Karur";						//Static variable (Class variable), Independent of objects, Commonly shared variable
	int a =0;							//Instance variable
	static int b =0;					//Commonly shared to all object threads - class variable
	
	static {
		String city = "Karur";			//Static block used to declare &initialize all static variables
		int b =0;
	}
	
	LearnStatic(String name, String gender){		//Local variables
		this.name = name;
		this.gender = gender;
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		LearnStatic ls = new LearnStatic("Monica","Female");
		ls.getID();
		LearnStatic ls1 = new LearnStatic("Navani","Male");
		ls1.getID();
		LearnStatic ls2 = new LearnStatic("Ragavi","Female");
		ls2.getID();
		
//		LearnStatic.getData();
	}
	
	public void getID() {
		System.out.println(name);
		System.out.println(city);
	}
	
	public static void getData() {
		System.out.println(city);
	}

}
