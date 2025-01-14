package javacodes;

public class AccessModifiers {
	
	//default
	int a =100;
	
	void getValueDefault() {
		System.out.println("Default");
	}
	
	//public
	public int b = 200;
	
	public void getValuePublic() {
		System.out.println("Public");
	}
	
	//private
	private int c = 300;
	
	private void getValuePrivate() {
		System.out.println("Private");
	}
	
	//protected
	protected int d = 400;
	
	protected void getValueProtected() {
		System.out.println("Protected");
	}
	

	public static void main(String[] args) {
		//Access Modifiers
		//1. default - None mentioned - Access within the same package
		//2. public - Access anywhere
		//3. private - Access only within the class
		//4. protected - Access within the same package and child classes in the other packages
		
		AccessModifiers modi = new AccessModifiers();
		modi.getValuePrivate();    //Can access only inside the class
		
	}

}
