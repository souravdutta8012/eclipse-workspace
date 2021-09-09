import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] mat = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = scan.nextInt();
				scan.nextLine();
			}
		}

		scan.close();

		display(mat, 3);

		int dig1 = 0;
		int dig2 = 0;

		for (int i = 0; i < 3; i++) {
			dig1 += mat[i][i];
			dig2 += mat[i][3 - i - 1];
		}

		System.out.println("dig1 " + dig1);
		System.out.println("dig2 " + dig2);
		System.out.println(Math.abs(dig1 - dig2));
	}

	public static void display(int[][] mat, int quesnum) {
		for (int i = 0; i < quesnum; i++) {
			for (int j = 0; j < quesnum; j++) {
				System.out.print(mat[i][j] + "   ");
			}
			System.out.println("");
		}
	}

}
