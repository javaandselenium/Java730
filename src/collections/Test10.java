package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test10 {

	public static void main(String[] args) {
	ArrayList<Integer> t=new ArrayList<Integer>();	
		
		t.add(10);
		t.add(200);
		t.add(1);
		t.add(10);
		t.add(30);
		t.add(200);
		System.out.println("before "+t);
		Collections.shuffle(t);
		System.out.println("After "+t);

	}

}
