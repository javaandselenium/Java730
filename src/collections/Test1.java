package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
	ArrayList list1=new ArrayList<>();
	list1.add(100);
	list1.add(200);
	list1.add(300);
	list1.add(900);
	
	ArrayList list2=new ArrayList<>();
	list2.add(100);
	list2.add(200);
	list2.add(300);
	System.out.println(list2.containsAll(list1));
	System.out.println(list1.containsAll(list2));
	
	System.out.println(list1.equals(list2));
	//System.out.println(list1.addAll(list2));
	//System.out.println(list1.containsAll(list2));
	//System.out.println(list1.removeAll(list2));
	//System.out.println(list1.retainAll(list2));
	}

}
