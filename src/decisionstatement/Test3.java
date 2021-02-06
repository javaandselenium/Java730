package decisionstatement;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the marks");
	int marks=s.nextInt();
	
	if(marks>80) {
		System.out.println("A");
	}
	else if(marks>60) {
		System.out.println("B");
	}
	
	else if(marks>40) {
		System.out.println("C");
	}
	
	else if(marks>20) {
		System.out.println("fail");
	}
	else
	{
		System.out.println("go home");
	}
	}

}
