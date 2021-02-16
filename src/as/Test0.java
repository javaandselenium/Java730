package as;

import accessSpecifier.Test1;
import accessSpecifier.Test3;
import accessSpecifier.Test4;
import accessSpecifier.Test5;

public class Test0 extends Test5{

	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println(t.a);
		t.add();
		
		Test0 t5=new Test0();
		System.out.println(t5.a);
		t5.demo();
		
		
		

	}

}
