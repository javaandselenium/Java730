package constructors;

public class Test2 {
	Test2(){
		int a=10;
		int b=30;
		System.out.println(a+b);
	}
	
	Test2(int a,int b){
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Test2 t=new Test2();
		Test2 T1=new Test2(10,2);
	}

}
