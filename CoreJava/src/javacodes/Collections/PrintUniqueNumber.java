package javacodes.Collections;

import java.util.ArrayList;

public class PrintUniqueNumber {

	public static void main(String[] args) {
		
		//Take a single number and compare it with other numbers in array
		//
		
		int a[] = {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			int k =0;
			if(!al.contains(a[i])) {
				
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) {
					
					 if (a[i]==a[j]) {
						 k++;
					 }
				}
				System.out.println(a[i]+" "+k);
				if(k==1) {
					System.out.println("The unique number is: "+a[i]+" "+k);
				}
			}
			
		}
	}

}