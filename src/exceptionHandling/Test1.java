package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		try {
		System.out.println(a[6]);
		}
		catch(Exception a1) {
			System.out.println("handled");
		}
		
		try {
		FileInputStream f=new FileInputStream("./D");
		}
		catch(FileNotFoundException f) {
			System.out.println("handled fnf");
		}
	}

}
