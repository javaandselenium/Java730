package inhertiances;

public class AdvancedCal extends BasicCal{
	public void costeta() {
		System.out.println("costeta");
	}


	public static void main(String[] args) {
		AdvancedCal c=new AdvancedCal();
		c.costeta();
		c.add();
		c.sub();
		

	}

}
