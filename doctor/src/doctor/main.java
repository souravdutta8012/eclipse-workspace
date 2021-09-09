package doctor;

import java.util.*;

public class main {

	public static void main(String[] args) {
		int n = 20;
		int[] arr = new int[n];

//		for (int i = 0; i < n; i++) {
//			arr[i] = 0;
//		}

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			String temp = sc.nextLine();

			if (temp == "") {
				break;
			} else {
				arr[i] = Integer.parseInt(temp);
			}
		}

		sc.close();

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
