package exceptionHandling;

import java.io.FileInputStream;

public class Test5 {
	public void sample() {
		try {
		FileInputStream f=new FileInputStream("./d");
		}
		catch(Exception e) {
			System.out.println("handled");
		}
	}

	public static void main(String[] args) {
	Test5 t=new Test5();
	t.sample();

	}

}
