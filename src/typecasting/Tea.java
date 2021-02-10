package typecasting;

public class Tea extends Coffee {
	public void coldtea() {
		System.out.println("codtea");
	}
	
	public void hottea() {
		System.out.println("hottea");
	}
	
	public static void main(String[] args) {
		Coffee c=new Tea();
		c.hotcoffee();
		c.coldcoffee();
	
		Tea t=(Tea)c;
		t.coldcoffee();
		t.coldcoffee();
		t.coldcoffee();
		t.hotcoffee();
		
	}

}
