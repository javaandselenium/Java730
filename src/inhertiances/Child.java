package inhertiances;

public class Child extends Father{
	
	public void cycle() {
		System.out.println("cycle from child");
	}

	public static void main(String[] args) {
	Child c=new Child();
	c.car();
	c.home();
	c.cycle();

	}

}
