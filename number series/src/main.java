import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter elment series number:");
		int num = scan.nextInt();
		scan.close();

		int result = find(num);

		System.out.println("Result:" + result);
	}

	public static int find(int num) {
		int result = -1;

		if (num > 0) {
			if (num % 2 == 0) {
				result = (num / 2 - 1) * 6;
			} else {
				result = ((num + 1) / 2 - 1) * 7;
			}
		} else {
			System.out.println("Wrong number");
		}

		return result;
	}

}
