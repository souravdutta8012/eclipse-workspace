import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
//		char[] strarr = str.toCharArray();
//		String finalstr = "";
//		for (int i = 0; i < str.length(); i++) {
//			finalstr = finalstr + strarr[str.length() - i - 1];
//		}
//		System.out.println(finalstr);

		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();

		String str2 = str1.toString();

		System.out.println("Reverse:- " + str2);
		System.out.println("Palindrome:- " + str2.equals(str));
	}

}
