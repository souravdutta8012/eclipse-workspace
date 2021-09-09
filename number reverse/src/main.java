
public class main {
	public static void main(String[] args) {
		int number = 12345;
		String str = Integer.toString(number);
		char[] numarr = str.toCharArray();
		String finalstr = "";
		for (int i = 0; i < numarr.length; i++) {
			finalstr = finalstr + numarr[numarr.length - i - 1];
		}
		int num = Integer.parseInt(finalstr);
		System.out.println(num);
	}
}
