package demopack;

import javacodes.AccessModifiers;
import javacodes.Inheritance.ParentDemo;

public class Demo1 extends AccessModifiers{

	public static void main(String[] args) {
		
		Demo1 demo = new Demo1();
		ParentDemo pdemo = new ParentDemo();
		pdemo.getMethod();
		
		AccessModifiers modi = new AccessModifiers();
//		System.out.println(modi.a);       //Cannot access because a is default access modifier
//		modi.getValueDefault();				
		modi.getValuePublic();               //Can access since getValue2() is public
//		modi.getValuePrivate();				//Cannot access since it is private
		demo.getValueProtected();         //Can access bcoz the accessmodifier class is inherited here
	}

}
