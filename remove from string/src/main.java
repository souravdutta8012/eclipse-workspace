import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 7;
		String astr = Integer.toString(a);

		int b = 56;
		String bstr = Integer.toString(b);

		String str = sc.nextLine();
		sc.close();


		String str1 = str.replaceAll(bstr, "");
		String str2 = str1.replaceAll(astr, "");

		System.out.println(str2);
	}
}