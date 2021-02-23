package collections;

import java.util.TreeSet;

public class Tesr14 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet<>();
		t.add("hello");
		t.add("java");
		t.add("android");
		t.add("selenium");
		t.add("english");
		System.out.println(t);
		System.out.println(t.descendingSet());

	}

}
