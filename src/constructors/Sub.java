package constructors;

public class Sub {
	Sub(int a){
		System.out.println(a);
	}
	
Sub(int a,int b){
	System.out.println(a-b);	
	}

Sub(double a,int b){
	System.out.println(a-b);
}

Sub(int a,double b){
	System.out.println(a-b);
}

	public static void main(String[] args) {
		Sub s=new Sub(10,5);
		Sub s1=new Sub(20.00,10);

	}}


