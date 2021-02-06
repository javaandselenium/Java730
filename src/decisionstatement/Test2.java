package decisionstatement;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter time");
		int time=s.nextInt();
		
		if(time<=12) {
			System.out.println("gm");
		}
		else if(time<=18) {
			System.out.println("good noon");
		}
		else
		{
			System.out.println("gn");
		}
	}

}
