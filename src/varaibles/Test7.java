package varaibles;

public class Test7 {
	
	static int b=100;
	System.out.println(b);
	
	
	public static void add() {
		int a=10;
		System.out.println(a);
		System.out.println(Test7.b);
	}

	public static void main(String[] args) {
		System.out.println(Test7.b);
       Test7.add();
	}

}
