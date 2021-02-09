package inhertiances;

public class Father extends Grandfather {

	public void home() {
		System.out.println("home from father");
	}
	public static void main(String[] args) {
	Father f=new Father();
	f.car();
	f.home();
	}

}
