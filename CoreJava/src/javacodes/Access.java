package javacodes;

public class Access {

	public static void main(String[] args) {
		
		AccessModifiers modi = new AccessModifiers();
		System.out.println(modi.a);
		modi.getValueDefault();		// can access since same package
		modi.getValuePublic();      // can access 
//		modi.getValuePrivate();    // Cannot access since it is private
		modi.getValueProtected();  //Can access since they are inside same package
	}

}
