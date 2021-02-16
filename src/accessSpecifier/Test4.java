package accessSpecifier;

public class Test4 {
	int a=10;
	
	void demo() {
		System.out.println("deault method");
	}
	
	Test4(){
		System.out.println("default constructor");
	}
public static void main(String[] args) {
	Test4 t4=new Test4();
	System.out.println(t4.a);
	t4.demo();
}
}
