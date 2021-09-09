import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of string:");
		int total = scan.nextInt();
		scan.nextLine();

		System.out.println("Enter letter to search:");
		char find = scan.nextLine().charAt(0);

		String[] strarr = new String[total];

		for (int i = 0; i < total; i++) {
			System.out.println("Enter " + i + " String:");
			strarr[i] = scan.nextLine();
		}
		scan.close();

		int count = CheckString(strarr, find);
		System.out.println(count);
	}

	public static int CheckString(String[] strarr2, char find) {
		int flag = 0;
		for (int i = 0; i < strarr2.length; i++) {
			for (int j = 0; j < strarr2[i].length(); j++) {
				if (strarr2[i].charAt(j) == find) {
					flag++;
				}
			}
		}
		return flag;
	}
}
