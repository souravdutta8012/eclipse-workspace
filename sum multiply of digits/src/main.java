import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter digit:");
		int digit = sc.nextInt();

		sc.close();

		String digitStr = Integer.toString(digit);
		int totalsum = 0;
		int totalmulti = 1;

		for (int i = 0; i < digitStr.length(); i++) {
			totalsum += Character.getNumericValue(digitStr.charAt(i));
			totalmulti *= Character.getNumericValue(digitStr.charAt(i));
		}

		System.out.println("total: " + totalsum);
		System.out.println("total: " + totalmulti);
	}

}
