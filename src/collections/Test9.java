package collections;

import java.util.LinkedList;

public class Test9 {

	public static void main(String[] args) {
	LinkedList t=new LinkedList();
    t.add(10);
	t.add(200);
	t.add(1);
	t.add(10);
	t.add(30);
	t.add(200);
	t.add(6);	
	System.out.println(t);
	System.out.println(t.getFirst());
	System.out.println(t.getLast());
	}

}
