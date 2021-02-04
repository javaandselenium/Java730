package methods;

public class Test9 {
	
	public static void send(int no) {
		System.out.println(no);
	}
public static void send(int no,String msg) {
		System.out.println(no+"  "+msg);
	}
public static void send(String msg,int no) {
	System.out.println(msg+" "+no);
}

	public static void main(String[] args) {
		Test9.send(76878,"Hello");

	}

}
