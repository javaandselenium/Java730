package accessSpecifier;

public class Test1 {

 public	int a=10;
 
 public void add() {
	 System.out.println("public method");
 }
 
 public Test1() {
	 System.out.println("public constructor");
 }
 
 public static void main(String[] args) {
	Test1 t=new Test1();
	System.out.println(t.a);
	t.add();
	
	Test4 t4=new Test4();
	System.out.println(t4.a);
	t4.demo();
}
	
	

}
