package javacodes.Arrays;

public class Exercise1 {

	public static void main(String[] args) {
		//Print the maximum number in the column of the minimum number
		//1. Find the minimum number
		//2. Get the column number
		//3. Tranverse through that column and find the maximum number
		
		
		int[][] a = {{20,8,0},{15,3,96},{45,1,94}};

		int min = a[0][0];
		int colIndex = 0;
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//System.out.println(a[i][j]);
			
				if(a[i][j]<min) {
					min=a[i][j];
					colIndex = j;
				}
			}
		}
		
		int max=a[0][colIndex];
		
		for(int i=0;i<3;i++) {
			if(a[i][colIndex]>max) {
				max=a[i][colIndex];
			}
		}
		
		System.out.println("Min value is: "+min);
		System.out.println("Column Index is: "+colIndex);
		System.out.println("Max value is: "+max);
	}

}
