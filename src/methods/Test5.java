package methods;

public class Test5 {
	int a=10;
	static int b=20;
	
	public static void sample() {
		System.out.println("sample");
	}
	public void demo() {
		System.out.println("demo");
	}

	public static void main(String[] args) {
		Test5 t=new Test5();
		System.out.println(t.a);
		System.out.println(Test5.b);
		
		Test5.sample();
		t.demo();

	}

}
