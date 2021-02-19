package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.40);
		a.add('A');
		a.add("hello");
		
		//System.out.println(a.size());
		//System.out.println(a.remove(1));
		//System.out.println(a);
//		System.out.println(a.remove(10));
//		System.out.println(a);
		System.out.println(a.contains("hello"));
//		System.out.println("before using clear method"+a.isEmpty());
//		a.clear();
//		System.out.println(a);
//		System.out.println("after using clear method"+a.isEmpty());
		
	}

}
