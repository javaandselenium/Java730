package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(10.00);
	a.add("Hello");
	a.add('H');
	System.out.println(a);
	
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i)); 
	}
	

	}

}
