package polymorphism;

public class Ecommerce {
public void shopping() {
	System.out.println("shopping");
}
}

class Amazon extends Ecommerce{
	public void shopping() {
		System.out.println("shopping from amazon");
	}
}

class Flipkart extends Ecommerce{
	public void shopping() {
		System.out.println("shopping from flipkart");
	}
}


class Myntra extends Ecommerce{
	public void shopping() {
		System.out.println("shopping from myntra");
	}
}
