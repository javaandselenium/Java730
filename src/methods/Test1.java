package methods;

public class Test1 {
	public static void withdrawal() {
		int depositedAmt=1000;
		int withdrawalAmt=500;
		int currentBalnce=depositedAmt-withdrawalAmt;
		System.out.println(currentBalnce);
	}

	public static void main(String[] args) {
		withdrawal();
	}

}
