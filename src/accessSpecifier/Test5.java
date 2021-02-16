package accessSpecifier;

public class Test5 {
	protected int a=10;
	
	protected void demo() {
		System.out.println("protected method");
	}
	
	protected Test5() {
		System.out.println("protected comstructor");
	}
	
	public static void main(String[] args) {
		Test5 t5=new Test5();
		System.out.println(t5.a);
		t5.demo();
		}
	}


