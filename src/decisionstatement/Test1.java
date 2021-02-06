package decisionstatement;

import java.util.Scanner;

public class Test1 {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amt");
		int amt=s.nextInt();
				
		
	if(amt<500) {
		System.out.println("cannot withdraw");
	}
	else
	{
		System.out.println("we can withdraw");
	}

	}

}
