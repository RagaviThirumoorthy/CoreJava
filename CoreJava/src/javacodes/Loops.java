package javacodes;



public class Loops {

	public static void main(String[] args) {
		whileLoops();
		nestedLoops();
		
	}
	
	public static void whileLoops() {
		// TODO Auto-generated method stub
		int i=0;
		int j=10;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		while(j>0) {
			System.out.println(j);
			j--;
		}
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
	}
	
	public static void nestedLoops() {
		
		for(int i=0;i<4;i++) {
			System.out.println("Outer loop");
			for(int j=0;j<4;j++) {
				System.out.println("Inner loop");
			}
		}
	}

}
