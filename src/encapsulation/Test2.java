package encapsulation;

public class Test2 {

	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println("current numb "+t.getEmailaddress());
		t.setEmailaddress("selenium@gmail.com");
		System.out.println("after updateing "+t.getEmailaddress());

		System.out.println(t.getPassword());
		
		System.out.println("current numb "+t.getPhonenumb());
		t.setPhonenumb(987654321);
		System.out.println("after updateing number "+t.getPhonenumb());
	
		System.out.println("before updateing "+t.getSalary());
		t.setSalary(7609.989);
		System.out.println("after salary update "+t.getSalary());
	
	}

}
