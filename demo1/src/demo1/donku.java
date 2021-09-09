package demo1;

public class donku {

	public static void main(String[] args) {
		String a = "dona";
		String b = "nsoudrav";

		String finalStr = "";
		String leftOver = "";

		char[] first = a.toCharArray();
		char[] second = b.toCharArray();

		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]) {
					finalStr += second[j];
					first[i] = '&';
					second[j] = '*';
				}
			}
		}

		for (int i = 0; i < second.length; i++) {
			if (second[i] != '*') {
				leftOver += second[i];
			}
		}

		System.out.println(finalStr);
		System.out.println(leftOver);

		if (a.equals(finalStr)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
