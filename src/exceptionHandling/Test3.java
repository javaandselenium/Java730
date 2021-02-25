package exceptionHandling;

public class Test3 {
	
	public void demo() {
		System.out.println("data base close");
	}

	public static void main(String[] args) {
		try {
		int a=1/0;
		}
		catch(ArithmeticException a) {
		System.out.println("handled");
		}
		finally {
		Test3 t=new Test3();
		t.demo();
		}

	}

}
