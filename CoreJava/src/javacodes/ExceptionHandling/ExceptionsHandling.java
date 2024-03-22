package javacodes.ExceptionHandling;

public class ExceptionsHandling {

	public static void main(String[] args) {

		try {
//			int a = 5;
//			int b = 0;
//
//			System.out.println(a / b);
			
			int[] arr = {1,2,3};
			System.out.println(arr[4]);
			
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Closing browser");
		}
	}

}
