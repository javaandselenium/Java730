package methods;

public class B extends A {
	
	public void sub() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		B b=new B();
		b.sub();
		b.add();
		
//		A a=new A();
//		a.add();

	}

}
