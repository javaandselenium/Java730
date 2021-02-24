package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test11 {

	public static void main(String[] args) {
	ArrayList t=new ArrayList<>();	
		
		t.add(10);
		t.add(200);
		t.add(1);
		t.add(10);
		t.add(30);
		t.add(200);
		System.out.println(t.get(2));
		
		System.out.println("before"+t);
		Collections.sort(t);
		System.out.println("after"+t);
		Collections.sort(t,Collections.reverseOrder());
		
		System.out.println(t);
	}

}
