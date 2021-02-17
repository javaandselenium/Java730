package encapsulation;

public class Test1 {

	private String emailaddress="bharani@gmail.com";
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public int getPhonenumb() {
		return phonenumb;
	}
	public void setPhonenumb(int phonenumb) {
		this.phonenumb = phonenumb;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getPassword() {
		return password;
	}
	private int password=1234567;
	private int phonenumb=34567835;
	private double salary=90.0987;
}
