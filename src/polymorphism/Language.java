package polymorphism;

public class Language {
public void movie() {
	System.out.println("watching movie");
}
}

class Kananada extends Language{
	public void movie() {
		System.out.println("watching kannada movie");
	}
	}

class English extends Language{
	public void movie() {
		System.out.println("watching english movie");
	}
}

class Hindi extends Language{
	public void movie() {
		System.out.println("watching hindi movie");
	}
}

class Test3{
	public static void main(String[] args) {
		Language l=new Hindi();
		l.movie();
	}
}
