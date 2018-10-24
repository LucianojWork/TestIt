package TestPackage;

public class SimplyCalc {

	public static void main(String[] args) {
		new SimplyCalc();

	}

	public SimplyCalc() {
		Calculate addUp = (a, b) -> a + b;
		Calculate subtract = (a, b) -> a - b;
		Calculate multiply = (a, b) -> a * b;
		Calculate divide = (a, b) -> {
			if(b == 0)
				return -1;
			return a / b;
		};

		System.out.println(addUp.function(7,3));
		System.out.println(subtract.function(7,3));
		System.out.println(multiply.function(7,3));
		System.out.println(divide.function(7,3));
	}

	interface Calculate {
		double function(double a, double b);
	}

}
