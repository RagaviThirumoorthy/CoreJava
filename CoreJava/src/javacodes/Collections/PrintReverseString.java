package javacodes.Collections;

import java.util.ArrayList;

public class PrintReverseString {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=a.length-1;i>=0;i--) {
			al.add(a[i]);
		}
		
		System.out.println(al);
		
//		for(int i=0;i<al.size();i++){
//			System.out.println(al.get(i));
//		}
	}

}
