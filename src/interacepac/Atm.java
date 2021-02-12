package interacepac;

public class Atm implements Test0 {


	@Override
	public void cardslot() {
		System.out.println("cardslot");
		
	}

	@Override
	public void pin() {
		System.out.println("pin");
		
	}

	@Override
	public void cashwithdrawal() {
	System.out.println("cashwithdrawal");
		
	}
public static void main(String[] args) {
		Atm a=new Atm();
		a.cardslot();
		a.pin();
		a.cashwithdrawal();
		

	}

}
