package methods;

public class Test6 {
	static int a=900;
	int b=800;
	public static void add() {
		System.out.println("adding");
	}
	
	public void sub() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		System.out.println(Test6.a);
		Test6 t=new Test6();
		System.out.println(t.b);
		
		Test6.add();
		t.sub();
		
		

	}

}
