package accessSpecifier;

public class Test3 {
	private int a=10;
	
	private void demo() {
		System.out.println("private method");
	}
	
	private Test3() {
		System.out.println("private constructor");
	}
	
	public static void main(String[] args) {
		Test3 t1=new Test3();
		System.out.println(t1.a);
		t1.demo();
		
		Test4 t4=new Test4();
		System.out.println(t4.a);
		t4.demo();
			
		}
	}


