package interacepac;

public class Child implements Parent1 ,Parent2{

	@Override
	public void car() {
		System.out.println("car from P1");
		
	}

	@Override
	public void home() {
		System.out.println("car from p2");
		
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.car();
		c.home();
	}

	

}
