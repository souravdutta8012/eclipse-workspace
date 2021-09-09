
public class main {

	public static void main(String[] args) {
		String str1 = "Happy";
		String str2 = "happy birth day";

		if (str1.toLowerCase().equals(str2.toLowerCase())) {
			System.out.println("equal string");
		} else if (str1.toLowerCase().contains(str2.toLowerCase()) || str2.toLowerCase().contains(str1.toLowerCase())) {
			System.out.println("partially equal string");
		} else {
			System.out.println("non equal string");
		}
	}

}