import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		sc.nextLine();

		int[] num = new int[total];
		for (int i = 0; i < total; i++) {
			num[i] = sc.nextInt();
			sc.nextLine();
		}

		sc.close();

		int sum = 0;
		int temp = num[0];
		int flag = num[0];

		for (int i = 1; i < total; i++) {
			if (flag < num[i]) {
				temp += num[i];
				if (temp > sum) {
					sum = temp;
				}
			} else {
				if (temp > sum) {
					sum = temp;
					temp = num[i];
				}
			}
			flag = num[i];
		}

		System.out.println(sum);
	}

}
