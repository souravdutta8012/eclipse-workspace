package math;

public class main {

	public static void main(String[] args) {
		double a = 5.01;
		double b = 2.112;

		// math power
		double result = Math.pow(a, b);
		System.out.println(result);

		// roundup
		// ".0" is must, put "0" according to how much place to round up
		double roundup = Math.round(result * 10000.0) / 10000.0;
		System.out.println(roundup);
	}

}
