package train;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		System.out.println("Enter time: ");
		double t = sc.nextDouble();
		sc.close();

		if (t >= 0 && t <= 23.59) {
			double[] train_a = { 10.00, 10.04, 10.09, 10.15, 10.19, 10.22 };
			double[] train_b = new double[train_a.length];

			for (int i = 0; i < train_a.length; i++) {
				if (i == 0) {
					train_b[i] = 0;
				} else {
					train_b[i] = train_a[i] - train_a[0];
				}
			}

			for (int i = 0; i < train_b.length; i++) {
				train_b[i] = train_b[i] + t;
				if (train_b[i] > 23.59) {
					double temp = train_b[i] - 23.59 - 0.01;
					train_b[i] = 0.00 + temp;
				}
			}

			// output
			for (int i = 0; i < train_b.length; i++) {
				System.out.printf("%.2f", train_b[i]);
				System.out.print(", ");
			}
		} else {
			System.out.println("Invalid time!!");
		}
	}

}
