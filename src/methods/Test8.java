package methods;

public class Test8 {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a,double b) {
       System.out.println(a+b);
	}

	public void add(int a,int b,double c) {
      System.out.println(a+b+c);
	}

	public void add(double a,int b,int c) {
    System.out.println(a+b+c);
	}
	
	public static void main(int a)
	{
		System.out.println(a);
	}
	
	public static void main(double b) {
		System.out.println(b);
	
	}
	
	public static void main(String[] args) {
		Test8 t=new Test8();
		t.add(60.00,10,80);
		t.add(10,30);
		t.add(70,80);
		Test8.main(90.00);
		
		}
	}


