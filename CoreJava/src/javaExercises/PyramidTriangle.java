package javaExercises;

public class PyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle1();
		System.out.println("*************************");
		triangle2();
		System.out.println("*************************");
		invertedTriangle1();
		System.out.println("*************************");
		invertedTriangle2();
	}
	
	public static void invertedTriangle1() {
		int rows= 10;
				
		for(int i=rows;i>0;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	
	public static void invertedTriangle2() {
		int n=1;
		int rows=4; 
		
		for(int i=rows;i>0;i--) {
		
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println("");
		}
	}
	
	public static void triangle1() {
		int n=1;
		int rows=4;
		for(int i=1;i<=rows;i++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println("");
		}		
	}
	public static void triangle2() {
		int n=1;
		int rows=4;
		for(int i=1;i<=rows;i++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print(n*3+" ");
				n++;
			}
			System.out.println("");
		}
	}
}


