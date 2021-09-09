import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int key = sc.nextInt();

		sc.close();

		char[] str = s.toCharArray();
		String result = " ";
		
		if (key <= 0) {
			System.out.println("Invalid input.");
		} else {
			for (int i = 0; i < str.length; i++) {
				if ((int) str[i] >= 48 && (int) str[i] <= 57) {
					if ((int) str[i] == 57) {
						result += 0 + (key - 1);
					} else {
						result += Character.getNumericValue(str[i]) + key;
					}
				} else if (((int) str[i] >= 65 && (int) str[i] <= 90) || ((int) str[i] >= 97 && (int) str[i] <= 122)) {
					if ((int) str[i] == 90) {
						result += (char) (65 + (key - 1));
					} else if ((int) str[i] == 122) {
						result += (char) (97 + (key - 1));
					} else {
						result += (char) ((int) str[i] + key);
					}
				}else {
					result = "Not a valid char";
					break;
				}
			}
		}
		System.out.println(result.trim());
	}
}
