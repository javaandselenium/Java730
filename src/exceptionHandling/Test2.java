package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		try {
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("aiob");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ae");
		}
		
		
	
		
		

	}

}
