import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = scan.nextInt();
		scan.close();

		check(num);
	}

	public static void check(int num) {
		if (num < 0) {
			System.out.println("Negative number");
		} else {
			prime(num);
		}
	}

	public static void prime(int num) {
		int c = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				c++;
			}
		}

		if (c >= 1) {
			System.out.println("Not Prime number");
		} else {
			System.out.println("Prime number");
		}
	}

}
