package TestPackage;

public class SimplyCalc {

	public static void main(String[] args) {
		new SimplyCalc();

	}
	
	public SimplyCalc() {
		System.out.println("I add up two numbrs and the Result is: " + addUp(2, 3));
		System.out.println("I subtract two numbrs and the Result is: " + subtract(2, 3));
	}
	
	private int addUp(int num1, int num2) {
		return num1 + num2;
	}
	
	private int subtract(int num1, int num2) {
		return num1 - num2;
	}

}
