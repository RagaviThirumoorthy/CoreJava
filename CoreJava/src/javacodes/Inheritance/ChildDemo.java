package javacodes.Inheritance;

public class ChildDemo extends ParentDemo {
	
	String name = "Kavya";
	
	public ChildDemo() {
		System.out.println("Child class constructor");
	}
		
	public static void main(String[] args) {
		ChildDemo child = new ChildDemo();
		child.getString();
		child.getMethod();
	}
	
	public void getMethod() {
		super.getMethod();
		System.out.println("Child class method");
	}
	
	public void getString() {
		System.out.println(name);      //Local class preference
		System.out.println(super.name);
	}

}
